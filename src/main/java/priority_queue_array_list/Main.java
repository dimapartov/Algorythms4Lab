package priority_queue_array_list;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(-5);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(12);
        priorityQueue.add(15);
        priorityQueue.add(21);
        priorityQueue.add(33);
        priorityQueue.add(-10);
        priorityQueue.add(6);
        priorityQueue.add(18);

        System.out.println("Queue size: " + priorityQueue.size());

        System.out.println("Highest priority: " + priorityQueue.peek());

        System.out.println("Delete elements with highest priority: ");
        while (priorityQueue.size() > 0) {
            System.out.println(priorityQueue.poll() + " ");
        }

    }
}