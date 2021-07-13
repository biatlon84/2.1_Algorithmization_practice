package com.epam.training.task_3;

public class Main {
	public static void main(String[] args) {
		double array[] = new double[] { 0, -0.001, 0, 4.23, 1.876, 0.34, -456.3, 0, -234.1 };
		int po = 0, ne = 0, z = 0;
		for (int i = 0; array.length > i; i++) {
			if (array[i] > 0) {
				po++;
			} else {
				if (array[i] < 0) {
					ne++;
				} else {
					z++;
				}
			}
		}
		System.out.println("po " + po);
		System.out.println("ne " + ne);
		System.out.println("z " + z);

	}
}
