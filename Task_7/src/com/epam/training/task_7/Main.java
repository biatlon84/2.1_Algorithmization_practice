package com.epam.training.task_7;

//There are real numbers a1, a2, ..., an.(task_7) 
//Find max (a + a2n, a2 + a2n-1, ..., an + an + 1)
public class Main {
	public static void main(String[] args) {
		double max = Double.NEGATIVE_INFINITY;
		double su = 0;
		double[] y = new double[32];

		for (int i = 0; i < y.length; i++) {
			y[i] = Math.random() * 0xff - 0x7f;
		}
		int i = 0;
		while (y.length > i) {
			System.out.print(" " + y[i]);
			i++;
			if (i % 4 == 0)
				System.out.print("\n");
		}

		for (i = 0; i < (y.length) / 2; i++) {
			su = y[i] + y[y.length - 1 - i];
			max = su >= max ? su : max;
		}
		System.out.print("\n");
		System.out.println("Maximum of the sums= " + max);

	}
}
