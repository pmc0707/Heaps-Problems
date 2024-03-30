import java.util.ArrayDeque;
import java.util.ArrayList;

public class InsertInHeaps {
    static class Heap {
        ArrayList<Integer> arrayList = new ArrayList<>();
        public void add(int data) {
            arrayList.add(data);
            int childIndex = arrayList.size() -1 ;
            int parIndex = (childIndex -1)/2;

            while (arrayList.get(childIndex) < arrayList.get(parIndex)) {
                int temp = arrayList.get(childIndex);
                arrayList.set(childIndex,arrayList.get(parIndex));
                arrayList.set(parIndex,temp);
            }
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(5);
        heap.add(7);
        heap.add(9);
        heap.add(8);

    }
}
