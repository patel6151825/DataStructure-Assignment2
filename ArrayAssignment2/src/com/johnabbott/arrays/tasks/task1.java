package com.johnabbott.arrays.tasks;

public class task1 {

	public int[] returnArrayWithMiddleTwoElements(int[] array) {
		int[] newArray = new int[2];
		int length = array.length;

		// checking array is of even length or not
		if (length % 2 == 0) {
			// storing the middle two elements in new array
			newArray[0] = array[((length - 1) / 2)];
			newArray[1] = array[((length) / 2)];
		} else {
			System.out.println("Array does not contain even length");
			return null;
		}
		return newArray;
	}
}
