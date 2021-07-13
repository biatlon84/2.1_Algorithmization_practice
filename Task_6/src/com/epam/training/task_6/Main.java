package com.epam.training.task_6;

//A sequence of N real numbers is given. 
//Calculate the sum of numbers whose ordinal numbers
//are prime numbers.
public class Main {
	public static void main(String[] args) {

		double array[] = new double[] { -0.001, 5, 5, 5, 234545, -456.3, 5, 7.6 };

		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 0xff - 0x7f;
		}

		int z = 0;
		double sum = 0;
		for (int i = 0; array.length > i; i++) {
			int ii = i - 1;
			z = 0;
			while (ii > 2) {
				ii--;
				z = (i % ii) == 0 ? z + 1 : z;

			}
			if ((z < 1) && (i > 1)) {
				sum += array[i];
				System.out.print(">>");
			} else {
				System.out.print("  ");
			}
			System.out.println("N= " + i + "  value= " + array[i]);
		}
		System.out.println("SUM = " + sum);
	}
}
