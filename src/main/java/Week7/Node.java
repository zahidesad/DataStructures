package Week7;

/**
 *
 * @author zahid
 */
public class Node<T extends Comparable<T>> {

    T data;
    Node left;
    Node right;

    public Node(T data) {
        this.data = data;
    }
}
