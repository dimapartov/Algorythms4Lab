package max_heap_linked_list;

import java.util.LinkedList;
import java.util.List;

public class MaxHeap<E extends Comparable<E>> implements AbstractHeap<E> {

    private List<E> heap;

    public MaxHeap() {
        this.heap = new LinkedList<>();
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public void add(E element) {
        heap.add(element);
        heapifyUp(heap.size() - 1);
    }

    @Override
    public E peek() {
        if (heap.isEmpty()) {
            return null;
        }
        return heap.get(0);
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parentIndex)) > 0) {
                // Swap with parent
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break; // Heap property is satisfied
            }
        }
    }

    private void swap(int i, int j) {
        E temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}