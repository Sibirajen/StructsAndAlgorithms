package Sorting;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arr = {9,3,5,6,2,1};
    SortAlg srt = new SortAlg();

    System.out.println(Arrays.toString(arr));
//    srt.bubbleSort(arr);
//    srt.selectionSort(arr);
//    srt.insertionSort(arr);
//    srt.mergeSort(arr,0, arr.length-1);
//    srt.quickSort(arr,0,arr.length-1);
    srt.heapSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
