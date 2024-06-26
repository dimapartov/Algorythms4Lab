package priority_queue_array_list;

public interface AbstractQueue<E extends Comparable<E>> {

    int size();

    void add(E element);

    E peek();

    E poll();
}