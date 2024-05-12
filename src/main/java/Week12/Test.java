package Week12;

/**
 *
 * @author zahid
 */
public class Test {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.insert(48);
        minHeap.insert(16);
        minHeap.insert(24);
        minHeap.insert(20);
        minHeap.insert(8);
        minHeap.insert(12);
        minHeap.insert(32);
        minHeap.insert(54);
        minHeap.insert(72);
        minHeap.insert(4);
        minHeap.deleteMin();
        minHeap.printHeap();
        System.out.println("");
        
        minHeap.decreaseKey(16, 15);
        minHeap.printHeap();
    }
}
