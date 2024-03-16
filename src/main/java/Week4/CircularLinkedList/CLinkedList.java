package Week4.CircularLinkedList;

/**
 *
 * @author zahid
 */
//Circular Linked List
public class CLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public CLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(T data, T search) {
        Node<T> newNode = new Node<>(data);
        Node<T> temp = head;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            while (temp != null && !temp.data.equals(search)) {
                temp = temp.next;
                if (head == temp) {
                    break;
                }
            }
            if (temp != null && temp.data.equals(search)) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (temp == tail) {
                    tail = newNode;
                    tail.next = head;
                }
            }
        }
        size++;
    }

    public void delete(T data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        // If list has just 1 element
        if (head.equals(data) && size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }
        // If data is in the head
        if (head.data.equals(data)) {
            head = head.next;
            tail.next = head;
            size--;
            return;
        } else {
            Node<T> temp = head.next;
            Node<T> prev = head;

            while (temp != null && !temp.data.equals(data)) {
                prev = temp;
                temp = temp.next;
            }
            if (temp != head) {
                prev.next = temp.next;
            }
            if (temp == tail) {
                tail = prev;
            }
        }
        size--;
    }

    public void display() {
        Node<T> temp = head;

        for (int i = 0; i < size; i++) {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }

    }
}
