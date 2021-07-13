package com.epam.training.k;

//The array A [N] contains natural numbers.(Task_1) 
//Find the sum of those elements that are multiples of a given K
public class Main {

	public static void main(String args[]) {

		long arra[] = new long[] { 2, 4, 1, 8, 9 };
		long x, k, sum = 0;
		int i = 0;
		k = 2; // K
		while (arra.length > i) {
			x = arra[i];
			if ((x % k) == 0) {
				sum = sum + arra[i];
			}
			i++;
		}
		System.out.println(sum);

	}

}
