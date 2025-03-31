package sorting;


public class Main {
    public static void main(String[] args) {
        int[] arr = {9,3,5,6,2,1};

        Arrays.print(arr);
//        BubbleSort.sort(arr);
//        SelectionSort.sort(arr);
//        InsertionSort.sort(arr);
//        MergeSort.sort(arr);
//        QuickSort.sort(arr);
        HeapSort.sort(arr);
        Arrays.print(arr);

    }
}
