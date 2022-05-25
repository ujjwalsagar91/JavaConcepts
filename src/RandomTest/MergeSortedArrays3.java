package RandomTest;

import java.util.Arrays;

public class MergeSortedArrays3 {
	
	public static void main(String[] args) {
		int[] arr1 = {1,4,7,8};
		int[] arr2 = {2,5,9,11};
		int[] arr3 = new int[arr1.length+arr2.length];
		
		for(int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++) {
			arr3[arr1.length+i] = arr2[i];
		}
		
		Arrays.sort(arr3);
		
		System.out.println(Arrays.toString(arr3));
	}
}
