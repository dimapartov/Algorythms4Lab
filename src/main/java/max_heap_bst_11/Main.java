package max_heap_bst_11;

public class Main {
    public static void main(String[] args) {

        MaxHeapBST<Integer> maxHeapBST = new MaxHeapBST<>();

        maxHeapBST.add(3);
        maxHeapBST.add(2);
        maxHeapBST.add(5);
        maxHeapBST.add(7);
        maxHeapBST.add(1);
        maxHeapBST.add(20);
        maxHeapBST.add(24);
        maxHeapBST.add(15);
        maxHeapBST.add(9);
        maxHeapBST.add(22);

        System.out.println("Heap size: " + maxHeapBST.size());

        System.out.println("Max. element: " + maxHeapBST.peek());
    }
}