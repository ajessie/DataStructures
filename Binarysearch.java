package dataStructures;
import java.util.Arrays;
//import java.util.Collections;

public class Binarysearch {

	public int binarySearch (int array[], int l, int r, int targetNumber){
		if (r >= 1){
			int mid = l + (r - 1) /2;
			
		if (array[mid] == targetNumber)	
			return mid;
		
		if ( array[mid] > targetNumber)
			return binarySearch(array, l, mid - 1, targetNumber);
		
		return binarySearch(array, mid + 1, r, targetNumber);	
	}
		return -1;
}
	
	public static void main(String[] args) {
		Binarysearch ob = new Binarysearch();
		int[] array = {1,56,4,9,6};
		Arrays.sort(array);
		System.out.printf("sorted array : %s", Arrays.toString(array));
		int targetNumber = 9;
		int n = array.length;
		int result = ob.binarySearch(array, 0, n - 1, targetNumber);
		
		if (result == -1)
			System.out.println("Number not found");
		else
			System.out.printf("\n" + targetNumber + " " + "found at index: " + result);
	}
}
	
