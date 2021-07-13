package com.epam.training.task_8;

//Given a sequence of integers a1, a2, ..., an.
//Form a new sequence, discarding from the original 
//those terms that are equal to min (a1, a2, ..., an).)
public class Main {
	public static void main(String[] args) {

		long[] a = new long[] { 49, -36, 11, 27, -25, 1, 87 };

		for (int i = 0; i < a.length; i++) {
			a[i] = (long) (Math.random() * 6 - 3);
		}

		long min = Long.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			min = a[i] < min ? a[i] : min;
		}

		int len2 = a.length;
		for (long va : a) {
			len2 = va == min ? len2 - 1 : len2;
		}
		long[] ar = new long[len2];

		int j = 0;
		for (int i = 0; a.length > i; i++) {
			if (min != a[i]) {
				ar[j] = a[i];
				j++;
			}
		}
		System.out.println("before");
		for (long m : a) {
			System.out.printf("%4d", m);
		}
		System.out.print("\nafter\n");
		for (long n : ar) {
			System.out.printf("%4d", n);
		}
	}
}
