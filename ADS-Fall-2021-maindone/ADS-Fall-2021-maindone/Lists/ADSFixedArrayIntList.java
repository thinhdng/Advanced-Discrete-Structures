public class ADSFixedArrayIntList implements ADSList<Integer> {
    private Integer[] intList = new Integer[100];
    private int size = 0;

    public void add(Integer x){
        intList[size] = x;
        size = size + 1;
    }

    public void remove(Integer x) {
        int loc;
        for ( loc = 0 ; loc < size ; loc++ ) {
            if ( intList[loc].equals(x) ) {
                break;
            }
        }

        for ( int i = loc ; i < size-1 ; i++ ) {
            intList[i] = intList[i+1];
        }
    }

    public boolean contains(Integer x) {
        for ( int i = 0 ; i < size ; i++ ) {
            if ( intList[i].equals(x) )
                return true;
        }

        return false;
    }

    /* TODO: Concatenation */

   

    public Integer first() {
        return intList[0];
    }

    public Integer last() {
        return intList[size-1];
    }

    public Integer get(int i) {
        return intList[i];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}