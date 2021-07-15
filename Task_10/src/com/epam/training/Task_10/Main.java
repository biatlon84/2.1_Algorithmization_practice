package com.epam.training.Task_10;

import java.util.Arrays;

//There is array with the number of elements n. Throwing out every second element from it
//(fill the vacated elements with zeros). Note. Do not use an additional array.
public class Main {
	public static void main(String[] args) {

		int[] arr = new int[] { 7, 6, 5, 1, 5, 7, 7, 234545, 456, 5, 6, 6, 5, 5, 5, 234545, 456, 5, 7, 7, 7, 7 };

		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i % 2) == 1 ? 0 : arr[i];
		}

		System.out.println(Arrays.toString(arr));
	}
}
