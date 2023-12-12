package max_heap_hash_map_11;

import max_heap_linked_list.MaxHeap;

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

        System.out.println("HashMap");
        long start = System.nanoTime();
        customMaxHeap.findAndPrintElement(15);
        long end = System.nanoTime();
        long time = end-start;
        System.out.println("Элемент найден за "+time/1000000+ " мс");
        System.out.println("Элемент найден за "+time+ " нано секунд");
        System.out.println("Linked list");
        long start2 = System.nanoTime();
        maxHeap.findAndPrint(15);
        long end2 = System.nanoTime();
        long time2 = end2-start2;
        System.out.println("Элемент найден за "+time2/1000000+ " мс");
        System.out.println("Элемент найден за "+time2+ " нано секунд");
    }
}