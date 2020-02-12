package com.johnabbott.arrays.tasks;

public class task2 {

	public int[] shiftLeftByOne(int[] array) {

		// Using original array
		int temp = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = temp;
		return array;

		// Using new Array
		
		/*
		int[] newArray = new int[array.length];
		for (int i = 0; i < newArray.length - 1; i++) {
			newArray[i] = array[i + 1];
		}
		newArray[newArray.length - 1] = array[0];
		return newArray;
		
		*/
	}
}
