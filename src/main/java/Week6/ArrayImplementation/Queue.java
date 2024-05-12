package Week6.ArrayImplementation;

/**
 *
 * @author zahid
 */
public class Queue<T> {

    private T[] dataArray;
    private int front;
    private int rear;
    private int size;

    public Queue(int capacity) {
        dataArray = (T[]) new Object[capacity];
        front = 0;
        rear = 0;
    }

    void enqueue(T data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        dataArray[rear] = data;
        rear++;
        size++;
        
        if (rear % dataArray.length == 0) {
            rear = 0;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T item = dataArray[front];
        front++;
        size--;

        if (front % dataArray.length == 0) {
            front = 0;
        }

        return item;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.print(dataArray[index++] + "->");
            if (index % dataArray.length == 0) {
                index = 0;
            }
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == dataArray.length;
    }

    public int size() {
        return size;
    }

}
