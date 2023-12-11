package max_heap_hash_map_11;

public class Main {
    public static void main(String[] args) {

        MaxHeapHashMap<Integer> maxHeapHashMap = new MaxHeapHashMap<>();

        maxHeapHashMap.add(3);
        maxHeapHashMap.add(2);
        maxHeapHashMap.add(5);
        maxHeapHashMap.add(7);
        maxHeapHashMap.add(1);
        maxHeapHashMap.add(20);
        maxHeapHashMap.add(24);
        maxHeapHashMap.add(15);
        maxHeapHashMap.add(9);
        maxHeapHashMap.add(22);

        System.out.println("Heap size: " + maxHeapHashMap.size());

        System.out.println("Max. element: " + maxHeapHashMap.peek());

        System.out.println("Find random element: " + maxHeapHashMap.contains(15));
    }
}