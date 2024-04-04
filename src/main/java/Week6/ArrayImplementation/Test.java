package Week6.ArrayImplementation;

/**
 *
 * @author zahid
 */
public class Test {
    public static void main(String[] args) {
        Queue q = new Queue<>(8);
        q.enqueue(5);
        q.enqueue(12);
        q.enqueue(8);
        q.display();
        q.dequeue();
        q.display();
                
    }
}
