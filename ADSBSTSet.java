import java.util.Iterator;
import java.util.Stack;
public class ADSBSTSet<E extends Comparable<E>> implements Iterable<E>{

    
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
            System.out.println(e + " compared to " + currRoot.data + " => " + comparison);

            if ( comparison == 0 ) {
                return true;
            }

            if ( comparison < 0 ) {
                currRoot = currRoot.left;
            }

            if ( comparison > 0 ) {
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
        } else if ( comparison < 0 ) {
            currRoot.left = addRecursive(e, currRoot.left);
            return currRoot;
        } else /* comparison > 0 */ {
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

            if ( comparison < 0 ) {
                if ( currRoot.left == null ) {
                    currRoot.left = newNode;
                    done = true;                }
                else {
                    currRoot = currRoot.left;
                }
                
            }

            if ( comparison > 0 ) {
                if ( currRoot.right == null ) {
                    currRoot.right = newNode;
                    done = true;                }
                else {
                    currRoot = currRoot.right;
                }
            }
        }
        return;
    }
    
    public void delete(E e)
    {
    	root = deleteR(root, e);
    }
    
    node deleteR(node root, E e)
    {
    	
        /* Base Case: If the tree is empty */
        if (root == null)
            return root;
 
        /* Otherwise, recur down the tree */
        if (e.compareTo(root.data) < 0)
            root.left = deleteR(root.left, e);
        else if (e.compareTo(root.data) > 0)
            root.right = deleteR(root.right, e);
 
        // if key is same as root's
        // key, then This is the
        // node to be deleted
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
 
            // node with two children: Get the in order
            // successor (smallest in the right subtree)
            root.data = minValue(root.right);
 
            // Delete the in order successor
            root.right = deleteR(root.right, root.data);
        }
    	
    	return root;
    }

    E minValue(node root)
    {
        E minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    
    class ADSBSTSetIterator implements Iterator<E>{
        Stack<node> myStack;
        
        node r = root;
        
        public ADSBSTSetIterator()
        {
     		myStack = new Stack<node>();
     		while (r != null) {
     			myStack.push(r);
     			r = r.left;
     		}
        }
       
        public boolean hasNext(){
        		if(r.data != null)
        			return true;
        		else 
        			return false;
        }
        
        public E next() {
    		node tnode = myStack.pop();
    		E result = tnode.data;
    		if (tnode.right != null) {
    			tnode = tnode.right;
    			while (tnode != null) {
    				myStack.push(tnode);
    				tnode = tnode.left;
    			}
    		}
    		return result;
    	}
    }
    
    public ADSBSTSetIterator iterator() {
        return new ADSBSTSetIterator();
    }
    
}