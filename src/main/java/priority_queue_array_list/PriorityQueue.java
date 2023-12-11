package priority_queue_array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriorityQueue<E extends Comparable<E>> implements AbstractQueue<E> {

    private List<E> queue;

    public PriorityQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void add(E element) {
        queue.add(element);
        heapifyUp(queue.size() - 1);
    }

    @Override
    public E peek() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.get(0);
    }

    @Override
    public E poll() {
        if (queue.isEmpty()) {
            return null;
        }
        E root = queue.get(0);
        int lastIndex = queue.size() - 1;
        Collections.swap(queue, 0, lastIndex);
        queue.remove(lastIndex);
        heapifyDown(0);
        return root;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (queue.get(index).compareTo(queue.get(parentIndex)) > 0) {
                // Swap with parent
                Collections.swap(queue, index, parentIndex);
                index = parentIndex;
            } else {
                break; // Heap property is satisfied
            }
        }
    }

    private void heapifyDown(int index) {
        int size = queue.size();
        while (index < size) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int largest = index;
            if (leftChildIndex < size && queue.get(leftChildIndex).compareTo(queue.get(largest)) > 0) {
                largest = leftChildIndex;
            }
            if (rightChildIndex < size && queue.get(rightChildIndex).compareTo(queue.get(largest)) > 0) {
                largest = rightChildIndex;
            }
            if (largest != index) {
                // Swap with the larger child
                Collections.swap(queue, index, largest);
                index = largest;
            } else {
                break; // Heap property is satisfied
            }
        }
    }
}