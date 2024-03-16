package Week3.Lab;

/**
 *
 * @author zahid
 */
public class LinkedList<T> {

    private Node<T> head;

    // Add a data at the beggining of the linked list
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //Add a data at the end of the linked list
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = null;
        }
    }

    //Add a data at the middle of the linked list
    public void addMiddle(T afterData, T newData) {
        Node<T> temp = head;

        while ((temp != null) && !(temp.data.equals(afterData))) {
            temp = temp.next;
        }

        if (temp != null) {
            Node newNode = new Node(newData);
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            addLast(newData);
        }
    }

    //Delete a data from linked list for all cases
    public void delete(T target) {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        if (head.data.equals(target)) {
            head = head.next;
            return;
        }

        Node temp = head.next;
        Node previous = temp;

        while (temp != null && !temp.data.equals(target)) {
            previous = temp;
            temp = temp.next;
        }

        if (temp != null) {
            previous.next = temp.next;
        } else {
            System.out.println("Data not found");
        }
    }

    public void displayList() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void size() {
        int count = 0;
        Node<T> currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        System.out.println("Count : " + count);
    }

    //TEST CASE
    public void removeDuplicates() {
        if (head == null || head.next == null) {
            return;
        }
        Node<T> temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data.equals(temp.next.data)) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

}
