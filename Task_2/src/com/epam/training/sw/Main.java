package com.epam.training.sw;

//Given a sequence of real numbers a1, a2, ..., an.(Task_2)
//Replace all members greater than the given Z with this number. Count the number of substitutions.
public class Main {

	public static void main(String[] args) {
		long arra[] = new long[] { 2, 4, 1, 8, 9 };
		long x, z, sum = 0;
		int i = 0;
		z = 5; // Z
		while (arra.length > i) {
			x = arra[i];
			if (x > z) {
				arra[i] = z;
				sum++;
			}
			i++;
		}

		System.out.println("It was " + sum + " substitutions");
		i = 0;
		while (arra.length > i) {
			System.out.print(" " + arra[i]);
			i++;

		}

	}

}
