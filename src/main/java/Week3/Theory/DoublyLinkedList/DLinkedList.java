package Week3.Theory.DoublyLinkedList;

/**
 *
 * @author zahid
 */
public class DLinkedList {

    DNode head;
    DNode tail;

    public DLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtTheBeggining(DNode newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtTheEnd(DNode newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public void insertAtTheMiddle(int afterData, int newData) {
        DNode temp = head;
        while ((temp != null) && (temp.data != afterData)) {
            temp = temp.next;
        }
        if (temp != null) {
            DNode newNode = new DNode(newData);
            newNode.next = temp.next;
            temp.next.previous = newNode;
            temp.next = newNode;
            newNode.previous = temp;
        }
    }

    public void delete(int target) {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        //Deleting the head node or nodes with value equal to target 
        while (head != null && head.data == target) {
            head = head.next;
            if (head != null) { //example case - > (1,1,2)
                head.previous = null;
            } else { // example case - > (1,1)
                tail = null; // Because list will be empty
            }
        }

        if (head == null) {
            return;
        }

        DNode temp = head.next; //head.next because i already checked the head.
        while (temp != null) {
            if (temp.data == target) {
                if (temp.next != null) { // Means target isn't in the tail.
                    temp.next.previous = temp.previous;
                } else { // Means target is in the tail
                    tail = temp.previous;
                }
                temp.previous.next = temp.next;
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        DNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        DNode current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
        System.out.println();
    }

}
