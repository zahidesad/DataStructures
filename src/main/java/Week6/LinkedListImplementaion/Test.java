package Week6.LinkedListImplementaion;

/**
 *
 * @author zahid
 */
public class Test {

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(6);
        q.print();
        q.dequeue();
        q.print();

        String input1 = "ABB";
        char result1 = q.findRemainingCharacter(input1);
        System.out.println("Character remaining without any operations for input1: " + result1);

        // Test case 2
        String input2 = "AABBB";
        char result2 = q.findRemainingCharacter(input2);
        System.out.println("Character remaining without any operations for input2: " + result2);
    }

}
