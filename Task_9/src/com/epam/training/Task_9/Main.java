package com.epam.training.Task_9;

//Find the most frequent number in an array
//of integers with n elements.
//If there are several such numbers, then determine
//the smallest of them.
public class Main {
	public static void main(String[] args) {
		long[] array32 = { 7, 6, 5, 1, 5, 7, 7, 234545, 456, 5, 6, 6, 5, 5, 5, 234545, 456, 5, 7, 7, 7, 7 };
		ArrayFr cl = new ArrayFr(array32);
		cl.display();
		System.out.print("The answer is : " + cl.findMin());
	}
}
