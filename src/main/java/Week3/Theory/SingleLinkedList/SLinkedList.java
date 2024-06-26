package Week3.Theory.SingleLinkedList;

/**
 *
 * @author zahid
 */
public class SLinkedList {

    Node head;
    long size;

    public SLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insertAtTheBeggining(Node newNode) {
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtTheEnd(Node newNode) {
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;

        }
    }

    public void insertAtTheMiddle(int afterData, int newData) {
        Node temp = head;

        while ((temp != null) && (temp.data != afterData)) {
            temp = temp.next;
        }

        if (temp != null) {
            Node newNode = new Node(newData);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void delete(int target) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.data == target) { //If the target has been found at the current position
                if (previous == null) { // Means we are deleting the first element
                    head = current.next;
                } else { // Otherwise, we are deleting from middle or end
                    previous.next = current.next;
                }
            }

            previous = current;
            current = current.next;
        }
    }

    public void displayList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static int countOddIterative(Node node) {
        int count = 0;
        while (node != null) {
            if (node.data % 2 != 0) {
                count++;
            }
            node = node.next;
        }
        return count;
    }
    
    public static int countOddRecurisive(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.data % 2 == 0) {
            return 1 + countOddRecurisive(node.next);
        }
        return countOddRecurisive(node.next);
    }

}
