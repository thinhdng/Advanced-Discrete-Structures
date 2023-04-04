import java.util.Iterator;
import java.util.NoSuchElementException;

public class ADSLinkedList<E> implements ADSList<E>, Iterable<E> {

    /* Inner class that for the elements of the list */
    private class Element<EE> {
        EE data;
        Element<EE> next;
    }
    Element<E> head = null;
    int size = 0;


    private class llIterator implements Iterator<E> {
        Element<E> cur = null;

        public llIterator() {
            cur = head;
        }

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public E next() {
            if ( ! hasNext() ) {
                throw new NoSuchElementException();
            }
            
            E retval = cur.data;
            cur = cur.next;
            return retval;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    @Override
    public Iterator<E> iterator() {
        return new llIterator();
    }

    public void add(E x) {
        Element<E> newElem = new Element<E>();
        newElem.data = x;
        newElem.next = head;

        head = newElem;
        size = size + 1;
    }

    public void remove(E x) {
        Element<E> current;

        if ( head.data.equals(x) ) {
            head = head.next;
            size = size - 1;
            return;
        }

        current = head;
        while ( current.next != null ) {
            if ( current.next.data.equals (x) ) {
                // Delete element
                current.next = current.next.next;
                size = size - 1;
                return;
            }

            current = current.next;
        }

    }

    public boolean contains(E x) {
        Element<E> current = null;

        current = head;
        while ( current != null ) {
            if ( current.data.equals(x) ) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    /* TODO: Concatenation */
    public void concat(ADSLinkedList<E> b)
    {
    	for(int i = 0; i < b.size(); i++)
    	{
    		add(b.get(i));
    	}
    }
 
    public E first() {
        return head.data;
    }

    public E last() {
        Element<E> current = head;

        while ( current.next != null ) {
            current = current.next;
        }

        return current.data;
    }

    public E get(int i) {
        Element<E> current = head;

        for ( int j = 0 ; j < i ; j++ ) {
            current = current.next;
        }

        return current.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}