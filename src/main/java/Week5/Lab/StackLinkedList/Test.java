package Week5.Lab.StackLinkedList;

/**
 *
 * @author zahid
 */
public class Test {

    public static void main(String[] args) {
        /*StackLinkedList<Integer> stack = new StackLinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);       
        System.out.println("Size : " + stack.size());
        System.out.println("Peak value : " + stack.peek());     
        stack.pop();
        stack.displayStack();*/
        
        int result = StackLinkedList.evaluatePostfix("34+56*92-+*");
        System.out.println("Result : " + result);
        
        
        
    }

}
