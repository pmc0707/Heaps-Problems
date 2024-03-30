
public class HeapSorting {
    public static void heapify(int []numbers,int index,int size ){
        int left = 2*index+1;
        int right = 2*index+2;
        int maxIndex = index;
        if(left < size && numbers[left] > numbers[maxIndex]){
            maxIndex = left;

        }
        if(right < size && numbers[right] > numbers[maxIndex]){
            maxIndex = right;
        }
        if(maxIndex!= index){
            int temp = numbers[index];
            numbers[index] = numbers[maxIndex];
            numbers[maxIndex] = temp;
            heapify(numbers,maxIndex,size);
        }
    }
    public static void heapSort(int [] numbers){
        //step1 _ build maxHeap
        int number = numbers.length;
        for (int index = number/2; index >= 0; index--) {
            heapify(numbers,index,number);
        }
        //step2-push largest at end
        for (int index = number-1; index > 0; index--) {
            //swap
            int temp = numbers[0];
            numbers[0] = numbers[index];
            numbers[index] = temp;

            heapify(numbers,0,index);
        }
    }
    public static void main(String[] args) {
        int[] array ={1,6,9,4,5};
        heapSort(array);
        //print
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]+ " ");
        }
        System.out.println();
    }
}
