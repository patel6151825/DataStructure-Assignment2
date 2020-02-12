package com.johnabbott.arrays.tasks;

public class task3 {

	public int[] returnArrayWithMiddleOfTwoArrays(int[] a, int[] b) {

		int[] newArray = new int[2];
		//checking the length of first array is 3 or not
		if (a.length != 3) {
			System.out.println("Given first array does not contain length 3");
			return null;
		} 
		//checking the length of second array is 3 or not
		else if (b.length != 3) {
			System.out.println("Given second array does not contain length 3");
			return null;
		} 
		//else both array length are OK then storing the middle elements of both in new array
		else {
			newArray[0] = a[a.length / 2];
			newArray[1] = b[b.length / 2];
		}
		return newArray;
	}
}
