import java.util.*;

public class ArraySort {
	
	static int[] searchArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	static int arrayLength = searchArray.length;
	static int[] sortArr = new int[] {2, 5, 10, 12, 6, 21, 32, 34, 22, 15, 18, 54, 76, 54, 34, 11, 8, 4, 26};
	
	
	
	public static void main(String args[]) {
		System.out.println(linearSearch(4));
		bubbleSort();
	}
	
	public static String linearSearch(int value) {
		boolean valueInArray = false;
		
		String indexWithValue = "";
		
		for(int i = 0; i < arrayLength; i++) {
			if (searchArray[i] == value) {
				valueInArray = true;
				indexWithValue += i + ", ";
			}
		}
		
		if (valueInArray) {
			return indexWithValue;
		}
		else {
			return "Value not in array";
		}
	}
	
	public static void bubbleSort() {
		int n = sortArr.length;
		int[] sorted = sortArr;
		//First loop marks position in array
		for (int i = 0; i < n-1; i++) {
			//Second loop passes 
			for (int j = 0; j < n-i-1; j++) {
				if (sorted[j] > sorted[j + 1]) {
					int temp = sorted[j];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < sortArr.length; i++) {
			System.out.print(sortArr[i] + ", ");
		}
	}
	
	public void insertionSort() {
		
	}
}
