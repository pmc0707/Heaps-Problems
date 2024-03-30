import java.util.Comparator;
import java.util.PriorityQueue;
public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(1);

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.peek());
            priorityQueue.remove();
        }
    }
}
