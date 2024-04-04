package Week6.LinkedListImplementaion;

/**
 *
 * @author zahid
 */
public class Queue<T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        rear.next = front;
        size++;
    }

    public T dequeue() {
        if (front == null) {
            System.out.println("Empty queue ");
            return null;
        } else {
            T temp = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            rear.next = front;
            size--;
            return temp;
        }
    }

    public void print() {
        Node<T> temp = front;

        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public static char findRemainingCharacter(String input) {
        Queue<Integer> q1 = new Queue<>();
        Queue<Integer> q2 = new Queue<>();

        // Push indexes of 'A' to q1 and indexes of 'B' to q2
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                q1.enqueue(i);
            } else {
                q2.enqueue(i);
            }
        }

        // Iterate until one of the queues is empty
        while (!q1.isEmpty() && !q2.isEmpty()) {
            int index1 = q1.dequeue();
            int index2 = q2.dequeue();

            if (index1 < index2) {
                q1.enqueue(index1 + input.length());
            } else {
                q2.enqueue(index2 + input.length());
            }
        }

        // Return the character remaining without any operations
        return q1.isEmpty() ? 'B' : 'A';
    }
}
