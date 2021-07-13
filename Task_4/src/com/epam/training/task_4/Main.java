package com.epam.training.task_4;

//You are given real numbers a1, a2, ..., an.
//Swap the largest and smallest items.
public class Main {
	public static void main(String[] args) {
		double array[] = new double[] { -0.001, 4.23, 1.876, 0.34, -456.3, 0, -234.1 };
		int min = 0, max = 0;
		double bu = Double.NEGATIVE_INFINITY, bumin = Double.POSITIVE_INFINITY;

		for (int i = 0; array.length > i; i++) {
			if (array[i] > bu) {
				bu = array[i];
				max = i;
			}
			if (bumin > array[i]) {
				bumin = array[i];
				min = i;
			}
		}
		array[min] = bu;
		array[max] = bumin;
		System.out.println("max " + bu);
		System.out.println("min " + bumin);
		int i = 0;
		while (i < array.length) {
			System.out.print(" " + array[i]);
			i++;
			if (i % 10 == 0)
				System.out.print("\n");
		}
	}

}
