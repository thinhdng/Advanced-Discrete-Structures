public class ADSFixedArrayStringList implements ADSList<String>, Queue, Stack {
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
    public void concat(ADSFixedArrayStringList<String> b)
{
	for(int i = 0; i < b.size(); i++)
	{
		add(b.get(i));
	}
}
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

    public String pop(){
	return list[size-1];
	remove(get(size-1));
} 
    
    public void push(E x){
	add(x);
}
    public void enqueue(E x){
	add(x);
}

     public String dequeue(E x){
	return list[0];
	remove(get(0));
}
}