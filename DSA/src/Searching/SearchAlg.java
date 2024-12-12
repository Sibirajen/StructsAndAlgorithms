package Searching;

public class SearchAlg {
	
	//Linear Search
	public int linearSearch(int[] arr,int data) {
		int len = arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i] == data) {
				return i;
			}
		}
		return -1;
	}
	
	//Binary Search
	public int binarySearch(int[] arr,int data) {
		return binarySearch(arr,data,0,arr.length - 1);
	}
	
	private int binarySearch(int[] arr,int data,int l,int r) {
		if(l <= r) {
			int m = l + (r-l)/2;
			if(arr[m] == data) {
				return m;
			}
			else if(arr[m] > data) {
				return binarySearch(arr,data,l,m-1);
			}
			else {
				return binarySearch(arr,data,m+1,r);
			}
		}
		return -1;
	}
}