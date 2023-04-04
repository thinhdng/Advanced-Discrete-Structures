import java.util.Iterator;

public class ADSArrayList<E> implements ADSList<E>, Iterable<E> {

    private E[] list = (E[]) new Object[100];
    
    private int size = 0;

    class ArrayIterator implements Iterator<E> {
        private int curloc = 0;
    
        public boolean hasNext() {
            return curloc < size;
        }
    
        public E next() {
            //System.out.println("We're at " + curloc);
            return list[curloc++];
        }
    }
    
    public void add(E x){
        if ( size+1 > list.length ) {
            E[] newList = (E[]) new Object[size+10];
            for ( int i = 0 ; i < size ; i++ ) {
                newList[i] = list[i];
            }
            list = newList;
        }
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
    
    public ArrayIterator iterator() {
        return new ArrayIterator();
    }
}