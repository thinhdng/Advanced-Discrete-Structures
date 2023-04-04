public class ADSFixedArrayIntList implements ADSList<Integer>, Queue, Stack {
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
     public void concat(ADSFixedArrayIntList<Integer> b)
{
	for(int i = 0; i < b.size(); i++)
	{
		add(b.get(i));
	}
}
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

    public Integer pop(){
	return intList[size-1];
	remove(get(size-1));
} 
    
    public void push(Integer x){
	add(x);
}
    public void enqueue(Integer x){
	add(x);
}

     public E dequeue(Integer x){
	return intList[0];
	remove(get(0));
}

}