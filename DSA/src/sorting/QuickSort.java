package sorting;

public class QuickSort {
    public static void sort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end){
        if(end <= start) return;
        int pivInd = lomutoPartition(arr, start, end);
        quickSort(arr, start, pivInd - 1);
        quickSort(arr, pivInd + 1, end);
    }

    private static int lomutoPartition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j = start; j <= end; j++){
            if(arr[j] < pivot){
                i++;
                Arrays.swap(arr, i, j);
            }
        }
        i++;
        Arrays.swap(arr, i, end);

        return i;
    }

}
