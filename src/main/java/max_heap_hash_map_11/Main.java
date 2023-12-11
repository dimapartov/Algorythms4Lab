package max_heap_hash_map_11;

public class Main {
    public static void main(String[] args) {

        CustomMaxHeap<Integer> customMaxHeap = new CustomMaxHeap<>();

        customMaxHeap.add(3);
        customMaxHeap.add(2);
        customMaxHeap.add(5);
        customMaxHeap.add(7);
        customMaxHeap.add(1);
        customMaxHeap.add(20);
        customMaxHeap.add(24);
        customMaxHeap.add(15);
        customMaxHeap.add(9);
        customMaxHeap.add(22);

        System.out.println("Heap size: " + customMaxHeap.size());

        System.out.println("Max. element: " + customMaxHeap.peek());

        System.out.println("Find random element: " + customMaxHeap.contains(15));
    }
}