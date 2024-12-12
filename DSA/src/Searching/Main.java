package Searching;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchAlg srt = new SearchAlg();
		
		int[] arr1 = {10,50,30,40,20,80,70,90};
		System.out.println(Arrays.toString(arr1));
		System.out.println(srt.linearSearch(arr1, 70));
		
		int[] arr2 = {10,20,30,40,50,60,70,80,90};
		System.out.println(Arrays.toString(arr2));
		System.out.println(srt.binarySearch(arr2, 70));
	}

}
