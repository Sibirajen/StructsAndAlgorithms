package sorting;

public class HeapSort {
  // heap sort
    public static void sort(int[] arr){
        heapSort(arr);
    }

    private static void heapSort(int[] arr){
        int n = arr.length;

        for(int i=n/2-1;i>=0;i--) {
            heapify(arr,n,i);
        }

        for(int i=n-1;i>=0;i--) {
            Arrays.swap(arr,0,i);
            heapify(arr,i,0);
        }
    }

    private static void heapify(int[] arr,int n,int i){
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if(l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if(r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if(largest != i) {
            Arrays.swap(arr,largest,i);
            heapify(arr,n,largest);
        }
    }
}