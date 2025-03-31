package sorting;

public class Arrays {

    public static void print(int[] arr){
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
