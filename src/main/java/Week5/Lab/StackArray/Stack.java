package Week5.Lab.StackArray;

/**
 *
 * @author zahid
 */
public class Stack<T> {

    private T dataArray[];
    private int top;

    public Stack(int size) {
        dataArray = (T[]) new Object[size];
        top = -1;
    }

    public void push(T data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        } else {
            dataArray[++top] = data;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return dataArray[top--];
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return (T) dataArray[top];
        }
    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(dataArray[i] + " ");
        }
    }

    public boolean isFull() {
        return (top + 1 == dataArray.length);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    int size() {
        return top + 1;
    }
}
