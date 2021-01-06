package iterator.examples.treeTraversal;

import java.util.Iterator;

public class InOrderIterator<T> implements Iterator<T> {

    private Node<T> current;
    private Node<T> root;
    private boolean yieldedStart; // The iteration of the tree we are doing doesn't start from the root it starts from the leftmost element.

    public InOrderIterator(Node<T> root) {
        this.root = root;
        this.current = root;

        // Set the current to the leftmost element in the tree.
        while (current.left != null)
            current = current.left;
    }

    /**
     * Check if the node has the rightmost parent
     */
    private boolean hasRightmostParent(Node<T> node) {
        if (node.parent == null)
            return false;
        else {
            return (node == node.parent.left) || hasRightmostParent(node.parent);
        }
    }

    @Override
    public boolean hasNext() {
        return current.left != null || current.right != null || hasRightmostParent(current);
    }

    @Override
    public T next() {
        if (!yieldedStart) {
            yieldedStart = true;
            return current.value;
        }

        if (current.right != null) {
            current = current.right;
            while (current.left != null) {
                current = current.left;
            }
            return current.value;
        } else {
            Node<T> p = current.parent;
            while (p != null && current == p.right) {
                current = p;
                p = p.parent;
            }
            current = p;
            return current.value;
        }
    }
}
