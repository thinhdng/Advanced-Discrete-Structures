public interface ADSStringList {
    public void add(String x);
    public void remove(String x);
    public boolean contains(String x);

    /* TODO: Concatenation */

    public String first();
    public String last();
    public String get(int i);

    public int size();
    public boolean isEmpty();
}