package sorting;

public class MergeSort {
    public static void sort(int[] arr){
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int start, int end){
        if (start < end){
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end){
        int l1 = mid - start + 1;
        int l2 = end - mid;

        int[] l = new int[l1];
        int[] r = new int[l2];

        for (int i = 0; i < l1; i++) l[i] = arr[ start + i ];
        for (int i = 0; i < l2; i++) r[i] = arr[ mid + 1 + i ];

        int i = 0, j = 0;
        int k = start;

        while ( i < l1 && j < l2){
            if (l[i] < r[j]){
                arr[k] = l[i];
                i++;
            }
            else{
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        while ( i < l1 ){
            arr[k] = l[i];
            i++;
            k++;
        }

        while ( j < l2 ){
            arr[k] = r[j];
            j++;
            k++;
        }
    }
}