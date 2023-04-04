public class ADSBSTSet<E implements Comparable> {}
    private class node {
        E data;
        node left, right;

        node(E data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    node root = null;

    public boolean contains(E e) {
        node currRoot = root;

        while ( currRoot != null ) {
            int comparison = e.compareTo(currRoot.data);

            if ( comparison == 0 ) {
                return true;
            }

            if ( comparison == -1 ) {
                currRoot = currRoot.left;
            }

            if ( comparison == 1 ) {
                currRoot = currRoot.right;
            }
        }

        return false;
    }

    public void addR(E e) {
        root = addRecursive(e, root);
    }

    private node addRecursive(E e, node currRoot) {
        if ( currRoot == null ) {
            return new node(e);
        }

        int comparison = e.compareTo(currRoot.data);
        if ( comparison == 0 ) {
            return currRoot;
        }

        if ( comparison == -1 ) {
            currRoot.left = addRecursive(e, currRoot.left);
            return currRoot;
        }

        if ( comparison == 1 ) {
            currRoot.right = addRecursive(e, currRoot.right);
            return currRoot;
        }
    }

    public void add(E e) {
        node currRoot = root;
        node newNode = new node(e);
        boolean done = false;

        if ( root == null ) {
            root = newNode;
            return;
        }

        while ( ! done ) {
            int comparison = e.compareTo(currRoot.data);

            if ( comparison == 0 ) {
                done = true;
            }

            if ( comparison == -1 ) {
                if ( currRoot.left == null ) {
                    currRoot.left = newNode;
                    done = true;                }
                else {
                    currRoot = currRoot.left;
                }
                
            }

            if ( comparison == 1 ) {
                if ( currRoot.right == null ) {
                    currRoot.right = newNode;
                    done = true;                }
                else {
                    currRoot = currRoot.right;
                }
            }

            return;
        }




    }
    
}
