package sorting;

public class SelectionSort {
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int minInd = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minInd]){
                    minInd = j;
                }
            }
            Arrays.swap(arr, i, minInd);
        }
    }
}
