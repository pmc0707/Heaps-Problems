import java.util.PriorityQueue;
import java.util.Comparator;
public class PriorityQueueForObjects {
    public static class Student implements Comparable<Student>{
        String names;
        int rank;
        public Student(String names,int rank){
            this.names = names;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(new Student("A", 4));
        priorityQueue.add(new Student("B", 5));
        priorityQueue.add(new Student("C", 1));

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.peek().names+"->" + priorityQueue.peek().rank);
            priorityQueue.remove();
        }
    }
}

