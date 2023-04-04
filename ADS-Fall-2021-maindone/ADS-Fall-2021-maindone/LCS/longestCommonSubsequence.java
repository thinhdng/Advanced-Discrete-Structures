import java.util.HashMap;
import java.util.HashSet;

public class longestCommonSubsequence {
    char x[], y[];
    HashMap<IntPair0,Integer> memo;
    HashMap<IntPair0,HashSet<String>> lcsMemo;

    public longestCommonSubsequence(String s1, String s2) {
        x = s1.toCharArray();
        y = s2.toCharArray();
        memo = new HashMap<IntPair0,Integer>();
        lcsMemo = new HashMap<IntPair0,HashSet<String>>();
    }

    public Integer length() {
        return ell(x.length, y.length);
    }

    public Integer ell(int i, int j) {
        IntPair0 curset = new IntPair0(i,j);

        if ( memo.containsKey(curset) ) {
            return memo.get(curset);
        }

        if ( i == 0 || j == 0 ) {
            memo.put(curset, 0);
            // System.out.println("Memoizing (" + i + "," + j + ")");
            return 0;
        }

        if ( x[i-1] == y[j-1] ) {
            int retval = 1 + ell(i-1,j-1);
            memo.put(curset, retval);
            // System.out.println("Memoizing (" + i + "," + j + ")");
            return retval;
        }
        else {
            int res1 = ell(i-1,j);
            int res2 = ell(i,j-1);

            int value = res1 < res2 ? res2 : res1;

            memo.put(curset, value);
            // System.out.println("Memoizing (" + i + "," + j + ")");

            return value;
        }
    }

    public String hashedArrayString() {
        String arrayStr = "";
        for ( int j = y.length-1; j >= 0 ; j-- ) {
            arrayStr += String.format("%1s %2d |", y[j], (j+1));
            for ( int i = 0 ; i < x.length ; i++ ) {
                arrayStr += String.format(" %2d", ell(i+1,j+1));
            }
            arrayStr += "\n";
        }

        arrayStr += "     +";
        String penultimate = "      ";
        String ultimate    = "      ";
        for ( int i = 0 ; i < x.length ; i++ ) {
            arrayStr += "---";
            penultimate += String.format(" %2d", i+1);
            ultimate += "  " + x[i];
        }

        return arrayStr + "\n" + penultimate + "\n" + ultimate;
    }
}
