public class ADSFixedArrayList<E> implements ADSList<E> {

    // FIXME
    private E[] list = (E[]) new Object[100];
    private int size = 0;

    public void add(E x){
        list[size] = x;
        size = size + 1;
    }

    public void remove(E x) {
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

    public boolean contains(E x) {
        for ( int i = 0 ; i < size ; i++ ) {
            if ( list[i].equals(x) )
                return true;
        }

        return false;
    }

    /* TODO: Concatenation */

    public void concat(ADSArrayList<E> b)
{
	for(int i = 0; i < b.size(); i++)
	{
		add(b.get(i));
	}
}

    public E first() {
        return list[0];
    }

    public E last() {
        return list[size-1];
    }

    public E get(int i) {
        return list[i];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}