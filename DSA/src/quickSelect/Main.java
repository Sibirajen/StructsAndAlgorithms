package quickSelect;

import sorting.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        System.out.println(QuickSelect.quickSelect(arr,k));
        java.util.Arrays.sort(arr);
        Arrays.print(arr);
    }
}
