public interface ADSList<E> {
    public void add(E x);
    public void remove(E x);
    public boolean contains(E x);

    /* TODO: Concatenation */

    public E first();
    public E last();
    public E get(int i);
    public E concat(ADSList<E>);
    public int size();
    public boolean isEmpty();
}
