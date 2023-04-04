import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

    	System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        scanner.close();

        longestCommonSubsequence lcs = new longestCommonSubsequence(str1, str2);

        System.out.println("LCS length is " + lcs.length());

        System.out.println("Array is: ");
        System.out.println(lcs.hashedArrayString());
    }
}
