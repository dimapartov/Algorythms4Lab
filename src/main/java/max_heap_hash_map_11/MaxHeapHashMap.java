package max_heap_hash_map_11;

import max_heap_linked_list.AbstractHeap;

import java.util.*;

public class MaxHeapHashMap<E extends Comparable<E>> implements AbstractHeap<E> {

    private List<E> heap;
    private Map<E, Integer> map;

    public MaxHeapHashMap() {
        this.heap = new ArrayList<>();
        this.map = new HashMap<>();
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public void add(E element) {
        heap.add(element);
        map.put(element, heap.size() - 1);
        heapifyUp(heap.size() - 1);
    }

    @Override
    public E peek() {
        if (heap.isEmpty()) {
            return null;
        }
        return heap.get(0);
    }

    public boolean contains(E element) {
        return map.containsKey(element);
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parentIndex)) > 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        E temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);

        map.put(heap.get(i), i);
        map.put(heap.get(j), j);
    }
}