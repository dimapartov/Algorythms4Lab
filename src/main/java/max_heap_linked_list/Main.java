package max_heap_linked_list;

public class Main {
    public static void main(String[] args) {

        MaxHeap<Integer> maxHeap = new MaxHeap<>();

        maxHeap.add(3);
        maxHeap.add(2);
        maxHeap.add(5);
        maxHeap.add(7);
        maxHeap.add(1);
        maxHeap.add(20);
        maxHeap.add(24);
        maxHeap.add(15);
        maxHeap.add(9);
        maxHeap.add(22);

        System.out.println("Heap size: " + maxHeap.size());

        System.out.println("Max. element: " + maxHeap.peek());

    }
}