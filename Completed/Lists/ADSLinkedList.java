public class ADSLinkedList<E> implements ADSList {

    private class Element<E> {
        E data;
        Element<E> next;
    }

    Element<E> head = null;
    int size = 0;

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
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
