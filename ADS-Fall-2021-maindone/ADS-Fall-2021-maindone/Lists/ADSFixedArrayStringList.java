public class ADSFixedArrayStringList implements ADSList<String> {
    private String[] list = new String[100];
    private int size = 0;

    public void add(String x){
        list[size] = x;
        size = size + 1;
    }

    public void remove(String x) {
        int loc;
        for ( loc = 0 ; loc < size ; loc++ ) {
            if ( list[loc].equals(x) ) {
                break;
            }
        }

        for ( int i = loc ; i < size-1 ; i++ ) {
            list[i] = list[i+1];
        }
    }

    public boolean contains(String x) {
        for ( int i = 0 ; i < size ; i++ ) {
            if ( list[i].equals(x) )
                return true;
        }

        return false;
    }

    /* TODO: Concatenation */

    public String first() {
        return list[0];
    }

    public String last() {
        return list[size-1];
    }

    public String get(int i) {
        return list[i];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}