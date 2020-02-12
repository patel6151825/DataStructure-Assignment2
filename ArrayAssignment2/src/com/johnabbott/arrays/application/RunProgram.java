package com.johnabbott.arrays.application;

import java.util.Arrays;

import com.johnabbott.arrays.tasks.task1;
import com.johnabbott.arrays.tasks.task2;
import com.johnabbott.arrays.tasks.task3;

public class RunProgram {
	public static void main(String[] args) {

		System.out.println("\n------------------------Task 1 ----------------------------------");
		int[] array1 = { 7, 1, 2, 3, 4, 9 };
		task1 firstTask = new task1();
		System.out.println("Given Array:" + Arrays.toString(array1));
		int[] resultArray1 = firstTask.returnArrayWithMiddleTwoElements(array1);
		if (resultArray1 != null) {
			System.out.println("New array  :" + Arrays.toString(resultArray1));
		}

		System.out.println("\n------------------------Task 2 ----------------------------------");
		int[] array2 = { 6, 2, 5, 3 };
		task2 secondTask = new task2();
		System.out.println("Given Array:" + Arrays.toString(array2));
		int[] resultArray2 = secondTask.shiftLeftByOne(array2);
		if (resultArray2 != null) {
			System.out.println("New array  :" + Arrays.toString(resultArray2));
		}

		System.out.println("\n------------------------Task 3 ----------------------------------");
		int[] a = { 5, 2, 9 };
		int[] b = { 1, 4, 9 };
		task3 thirdTask = new task3();
		System.out.println("Given Array1:" + Arrays.toString(a));
		System.out.println("Given Array2:" + Arrays.toString(b));
		int[] resultArray3 = thirdTask.returnArrayWithMiddleOfTwoArrays(a, b);
		if (resultArray3 != null) {
			System.out.println("New array  :" + Arrays.toString(resultArray3));
		}
	}
}
