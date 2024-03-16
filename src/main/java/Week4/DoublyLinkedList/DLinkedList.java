package Week4.DoublyLinkedList;

/**
 *
 * @author zahid
 */
public class DLinkedList<T> {

    Node<T> head;
    int size;

    public DLinkedList() {
        this.head = null;
    }

    public void insertAtTheBeggining(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertAtTheEnd(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> temp = head;
        if (head == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;
        }
        size++;
    }

    public void insertAfter(T search, T data) {
        Node<T> temp = head;
        while ((temp != null) && !(temp.data.equals(search))) {
            temp = temp.next;
        }
        if (temp != null) {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            newNode.previous = temp;
            temp.next.previous = newNode;
            temp.next = newNode;
        } else if (temp == null && temp.data.equals(search)) {
            insertAtTheEnd(data);
        } else {
            System.out.println("Data not found");

        }
        size++;
    }

    public void delete(T data) {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            head.previous = null;
            size--;
            return;
        } else {
            Node<T> temp = head.next;

            while (temp != null && !temp.data.equals(data)) {
                temp = temp.next;
            }

            if (temp != null) {
                temp.previous.next = temp.next;

                if (temp.next != null) {
                    temp.next.previous = temp.previous;
                }

            }

        }
        size--;
    }

    public void displayForward() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
