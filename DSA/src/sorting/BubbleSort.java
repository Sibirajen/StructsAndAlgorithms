package sorting;

public class BubbleSort {
    public static void sort(int[] arr){
        for (int loop = arr.length - 1; loop >= 0; loop--){
            for(int i = 0; i < loop; i++){
                if(arr[i+1] < arr[i]){
                    Arrays.swap(arr, i, i+1);
                }
            }
        }
    }
}
