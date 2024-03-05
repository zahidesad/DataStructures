package Week3.Theory.DoublyLinkedList;

/**
 *
 * @author zahid
 */
public class Test {

    public static void main(String[] args) {
        // Testing for doubly linked list methods
        /*DLinkedList myList = new DLinkedList();
        DNode newNode1 = new DNode(1);
        DNode newNode2 = new DNode(2);
        DNode newNode3 = new DNode(3);
        DNode newNode4 = new DNode(4);
        DNode newNode5 = new DNode(5);

        myList.insertAtTheEnd(newNode4);
        myList.insertAtTheEnd(newNode5);
        myList.insertAtTheBeggining(newNode2);
        myList.insertAtTheBeggining(newNode1);
        myList.insertAtTheMiddle(2, newNode3.data);

        myList.delete(1);

        myList.displayForward();*/
        
        //Testing for case study
        DLinkedList listForCaseStudy = new DLinkedList();
        
        DNode dn1 = new DNode(8);
        DNode dn2 = new DNode(4);
        DNode dn3 = new DNode(4);
        DNode dn4 = new DNode(6);
        DNode dn5 = new DNode(4);
        DNode dn6 = new DNode(8);
        DNode dn7 = new DNode(4);
        DNode dn8 = new DNode(10);
        DNode dn9 = new DNode(12);
        listForCaseStudy.insertAtTheEnd(dn1);
        listForCaseStudy.insertAtTheEnd(dn2);
        listForCaseStudy.insertAtTheEnd(dn3);
        listForCaseStudy.insertAtTheEnd(dn4);
        listForCaseStudy.insertAtTheEnd(dn5);
        listForCaseStudy.insertAtTheEnd(dn6);
        listForCaseStudy.insertAtTheEnd(dn7);
        listForCaseStudy.insertAtTheEnd(dn8);
        listForCaseStudy.insertAtTheEnd(dn9);
        listForCaseStudy.displayForward();
        removeDuplicateValue(listForCaseStudy);
        listForCaseStudy.displayForward();
        
    }

    /* 
    CASE STUDY
    -Given an unsorted doubly linked list containing n nodes.
    -The problem is to remove duplicate nodes from the given list.
    
    Input : DoubleLinkedList = 8<->4<->4<->6<->4<->8<->4<->10<->12<->12
    Output : 8<->4<->6<->10<->12
     */
    public static void removeDuplicateValue(DLinkedList list) {
        if (list.head == null) {
            System.out.println("Empty List");
            return;
        } else {
            DNode ptr1 = list.head;
            while (ptr1 != null) {
                DNode ptr2 = ptr1.next;
                while (ptr2 != null) {
                    if (ptr1.data == ptr2.data) {
                        ptr2.previous.next = ptr2.next;
                        if (ptr2.next != null) {
                            ptr2.next.previous = ptr2.previous;
                        } else {
                            list.tail = ptr2.previous;
                        }
                    }
                    ptr2 = ptr2.next;
                }
                ptr1 = ptr1.next;
            }
        }
    }
}
