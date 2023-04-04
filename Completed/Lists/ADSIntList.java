public interface ADSIntList {
    public void add(int x);
    public void remove(int x);
    public boolean contains(int x);

    /* TODO: Concatenation */

    public int first();
    public int last();
    public int get(int i);

    public int size();
    public boolean isEmpty();
}