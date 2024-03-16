package Week3.Lab;

/**
 *
 * @author zahid
 */
public class Test {

    public static void main(String[] args) {
        // Testing for linked list methods
        LinkedList<Integer> myList = new LinkedList();

        myList.addFirst(5);
        myList.addFirst(10);
        myList.addFirst(25);
        myList.addFirst(12);
        myList.addLast(35);
        myList.addMiddle(10, 28);
        myList.addMiddle(17, 5);

        myList.delete(10);
        //myList.displayList();
        
        
        //TEST CASE
        // I have sample question about linkedList.  Write a function that takes list sorted in non-decreasing order and deletes any duplicate
        //nodes from the list. The lis should only be traversed once. For example, if the linked list 11->11->11->21->43->43->60 then removeDuplicates()
        //should convert the list 11->21->43->60
        
        LinkedList<Integer> testCaseList = new LinkedList();   
        testCaseList.addLast(11);
        testCaseList.addLast(11);
        testCaseList.addLast(11);
        testCaseList.addLast(21);
        testCaseList.addLast(43);
        testCaseList.addLast(43);
        testCaseList.addLast(60);
        
        testCaseList.displayList();
        testCaseList.removeDuplicates();
        testCaseList.displayList();
    }
    
    
}
