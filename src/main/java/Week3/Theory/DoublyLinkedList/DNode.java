package Week3.Theory.DoublyLinkedList;

/**
 *
 * @author zahid
 */
public class DNode {

    int data;
    DNode next;
    DNode previous;

    public DNode(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

}
