package Sorting;

public class SortAlg {
  private void swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public void bubbleSort(int[] arr){
    for(int j=0;j< arr.length;j++){
      for(int i=0;i<arr.length-1;i++){
        if(arr[i] > arr[i+1]){
          swap(arr,i,i+1);
        }
      }
    }
  }
  public void selectionSort(int[] arr){
    for(int i=0;i< arr.length;i++){
      int minInd = i;
      for(int j=i+1;j< arr.length;j++){
        if(arr[j] < arr[minInd]){
          minInd = j;
        }
      }
      swap(arr,i,minInd);
    }
  }
  public void insertionSort(int[] arr){
    for(int i=1;i<arr.length;i++){
      int key = arr[i];
      int j=i-1;
      while(j>=0 && arr[j]>key){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = key;
    }
  }
  private void merge(int[] arr,int l,int m,int r){
    int n1 = m - l + 1;
    int n2 = r - m;
    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; ++i)
      L[i] = arr[l + i +1 - 1];
    for (int j = 0; j < n2; ++j)
      R[j] = arr[m + 1 + j];

    int i = 0, j = 0;
    int k = l;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      }
      else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }
  }
  public void mergeSort(int[] arr,int l,int r){
    if(l < r){
      int m = l + (r - l) / 2;
      mergeSort(arr,l,m);
      mergeSort(arr,m+1,r);
      merge(arr,l,m,r);
    }
  }
  private int partition(int[] arr,int low,int high){
    int pivot = arr[high];
    int i = low - 1;
    for(int j=low;j<=high-1;j++){
      if(arr[j] < pivot){
        i++;
        swap(arr,i,j);
      }
    }
    swap(arr,i+1,high);
    return i+1;
  }
  public void quickSort(int[] arr,int low,int high){
    if(low < high){
      int pivot = partition(arr,low,high);
      quickSort(arr,low,pivot-1);
      quickSort(arr,pivot+1,high);
    }
  }
  
}
