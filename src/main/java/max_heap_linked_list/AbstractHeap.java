package max_heap_linked_list;

public interface AbstractHeap<E extends Comparable<E>> {

    int size();

    void add(E element);

    E peek();
}