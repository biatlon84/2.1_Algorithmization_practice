package com.epam.training.task_5;

//Integers a1, a2, ..., an are given. (task_5)
//Print only those numbers for which ai> i.
public class Main {
	public static void main(String[] args) {
		long arra[] = new long[] { 2, 4, 1, 8, 9, 5, 7 };
		System.out.println("Print only those numbers for which ai> i.");
		int i = 0;
		while (arra.length > i) {
			if (arra[i] > i) {
				System.out.println(arra[i]);
			}
			i++;
		}
	}
}
