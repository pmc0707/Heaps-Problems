import java.util.ArrayList;

public class PeekFromHeap {
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
        public int peek(){
            return arrayList.get(0);
        }
    }

    public static void main(String[] args) {

    }
}

