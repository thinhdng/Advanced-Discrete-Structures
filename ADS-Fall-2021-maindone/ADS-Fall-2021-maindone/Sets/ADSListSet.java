import java.util.ArrayList;

public class ADSListSet<E> implements ADSSet<E> {
    ArrayList<E> listSet = new ArrayList<E>();

    public boolean contains(E e) {
        return listSet.contains(e);
    }

    public void add(E e) {
        listSet.add(e);
    }

    public void delete(E e) {
        while (listSet.contains(e)) {
            listSet.remove(e); 
        }
    }
}
