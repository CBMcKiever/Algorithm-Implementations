import java.util.*;

public class ArraySort {
	
	int[] searchArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int arrayLength = searchArray.length;
	
	public static void main(String args[]) {
		
	}
	
	public String linearSearch(int value) {
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
	
	public void bubbleSort() {
		
	}
	
	public void insertionSort() {
		
	}
}
