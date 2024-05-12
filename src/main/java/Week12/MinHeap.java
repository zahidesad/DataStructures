package Week12;

/**
 *
 * @author zahid
 */
public class MinHeap<T extends Comparable<T>> {

    T[] heap;
    private int size;

    public MinHeap(int capacity) {
        heap = (T[]) new Comparable[capacity];
        size = 0;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    void insert(T data) {
        if (size < heap.length) {
            heap[size] = data;
            int current = size++;

            while (heap[current].compareTo(heap[parent(current)]) < 0) {
                swap(current, parent(current));
                current = parent(current);
            }

        } else {
            System.out.println("Heap is full");
        }
    }

    void printArray() {
        for (T element : heap) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }

    void heapify() {
        int lastIndex = size - 1;

        for (int i = lastIndex; i >= 0; i--) {
            minHeap(i);
        }
    }

    void heapify(int index) {
        minHeap(index);
    }

    void minHeap(int i) {
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;

        int min = i;

        if (left < size && heap[left].compareTo(heap[min]) < 0) {
            min = left;
        }

        if (right < size && heap[right].compareTo(heap[min]) < 0) {
            min = right;
        }

        if (min != i) {
            swap(min, i);
            minHeap(min);
        }
    }

    T deleteMin() {
        T deleted_element = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);

        return deleted_element;
    }

    void printHeap() {
        int level = 0;
        int levelSize = 1;
        for (int i = 0; i < size; i++) {
            if (i == levelSize - 1) {
                System.out.println("Level " + level + ": ");
                level++;
                levelSize *= 2;
            }

            int leftChildIndex = 2 * i + 1;
            int rightChildIndex = 2 * i + 2;

            if (leftChildIndex < size || rightChildIndex < size) { // Check if parent has at least one child
                System.out.print("Parent: " + heap[i]);
                if (leftChildIndex < size) {
                    System.out.print(", Left Child: " + heap[leftChildIndex]);
                }
                if (rightChildIndex < size) {
                    System.out.print(", Right Child: " + heap[rightChildIndex]);
                }
                System.out.println();
            }
        }
    }

    public void decreaseKey(T key, int amount) {
        int keyIndex = -1;
        // Key'in indexini bul
        for (int i = 0; i < size; i++) {
            if (heap[i].equals(key)) {
                keyIndex = i;
                break;
            }
        }

        if (keyIndex == -1) {
            System.out.println("Key not found in the heap");
            return;
        }

        // Key değerini azalt
        heap[keyIndex] = (T) subtract((Number) heap[keyIndex], amount);

        // Heap özelliğini sağlamak için yeniden düzenle
        while (keyIndex > 0 && heap[parent(keyIndex)].compareTo(heap[keyIndex]) > 0) {
            swap(keyIndex, parent(keyIndex));
            keyIndex = parent(keyIndex);
        }
    }

    private Number subtract(Number a, Number b) {
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() - b.doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() - b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() - b.longValue();
        } else {
            return a.intValue() - b.intValue();
        }
    }

    boolean leftChildExists(int i) {
        return leftChild(i) < size;
    }

    boolean rightChildExists(int i) {
        return rightChild(i) < size;
    }

    int leftChild(int i) {
        return 2 * i + 1;
    }

    int rightChild(int i) {
        return 2 * i + 2;
    }

}
