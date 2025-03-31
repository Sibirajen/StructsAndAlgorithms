package quickSelect;

import sorting.Arrays;

public class QuickSelect {

    public static int quickSelect(int[] arr, int k) {
        return kthElement(arr, arr.length - k + 1
                , 0, arr.length - 1);
    }

    private static int kthElement(int[] arr, int k, int start, int end) {
        int pivot = partition(arr, start, end);

        if(pivot == k-1){
            return arr[pivot];
        }
        else if (k-1 > pivot) {
            return kthElement(arr, k, pivot+1, end);
        }
        else {
            return kthElement(arr, k, start, pivot-1);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for(int j = start; j < end; j++){
            if(arr[j] < pivot){
                Arrays.swap(arr, ++i, j);
            }
        }
        Arrays.swap(arr, ++i, end);
        return i;
    }

}
