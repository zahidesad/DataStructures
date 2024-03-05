package Week3.Theory.SingleLinkedList;

/**
 *
 * @author zahid
 */
public class Test {

    public static void main(String[] args) {
        
        // Testing for linked list methods
        SLinkedList myList = new SLinkedList();
        
        Node newNode1 = new Node(5);
        Node newNode2 = new Node(6);
        Node newNode3 = new Node(7);
        Node newNode4 = new Node(8);
        Node newNode5 = new Node(9);
        myList.insertAtTheEnd(newNode4);
        myList.insertAtTheEnd(newNode5);
        myList.insertAtTheBeggining(newNode2);
        myList.insertAtTheBeggining(newNode1);
        myList.insertAtTheMiddle(6, 7);
        
        myList.delete(6);
        myList.displayList();
        
        
        //Testing for case study
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);
        SLinkedList list1 = new SLinkedList();
        list1.insertAtTheEnd(n1);
        list1.insertAtTheEnd(n2);
        list1.insertAtTheEnd(n3);
        list1.insertAtTheEnd(n4);

       
        Node n5 = new Node(2);
        Node n6 = new Node(4);
        SLinkedList list2 = new SLinkedList();
        list2.insertAtTheEnd(n5);
        list2.insertAtTheEnd(n6);

        SLinkedList mergedList = new SLinkedList();
        mergedList = merge(list1, list2);
        mergedList.displayList();

    }

    /* CASE STUDY : Merge two sorted linked list 
        Input: 
        head1 = 5->7->9
        head2 = 4->6->8
        
        Output = 4->5->6->7->8->9
        ####################################
        Input: 
        head1 = 1->3->5->7
        head2 = 2->4
        
        Output = 1->2->3->4->5->7
     */
    public static SLinkedList merge(SLinkedList list1, SLinkedList list2) {
        SLinkedList mergedList = new SLinkedList();

        Node current1 = list1.head;
        Node current2 = list2.head;

        while (current1 != null && current2 != null) {
            if (current1.data <= current2.data) {
                mergedList.insertAtTheEnd(new Node(current1.data));
                current1 = current1.next;
            } else {
                mergedList.insertAtTheEnd(new Node(current2.data));
                current2 = current2.next;
            }
        }
        while (current1 != null) {
            mergedList.insertAtTheEnd(new Node(current1.data));
            current1 = current1.next;
        }
        while (current2 != null) {
            mergedList.insertAtTheEnd(new Node(current2.data));
            current2 = current2.next;
        }

        return mergedList;
    }
}
