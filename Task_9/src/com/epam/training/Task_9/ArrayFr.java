package com.epam.training.Task_9;

public class ArrayFr {
	long array[][];

	public ArrayFr(long[] ar) {
		this.array = new long[2][ar.length];
		this.array[0] = ar;
		getFreq();
		sortF();
	}

	private void getFreq() {
		int i = 0;
		int ii = 0;
		boolean w = false;
		while (i < (array[0].length)) {
			ii = 0;
			// how frequent
			w = false;
			while (ii < (array[1].length)) {
				if (ii < i) {
					w = array[0][ii] == array[0][i] ? true : w;
				}
				if (!w && (array[0][ii] == array[0][i])) {
					array[1][i] = array[1][i] + 1;
				}
				ii++;
			}
			i++;
		}
	}

	private void sortF() {

		boolean a = true;
		long st, st1;

		while (a) { // sorting for max
			a = false;
			int o = 1;
			while (o < array[1].length) {
				if (array[1][o] > array[1][o - 1]) {
					st = array[1][o];
					st1 = array[0][o];
					array[1][o] = array[1][o - 1];
					array[0][o] = array[0][o - 1];
					array[1][o - 1] = st;
					array[0][o - 1] = st1;
					a = true;

				}
				o++;
			}
		}
	}

	// Finding the minimum
	public long findMin() {
		long fin = Long.MAX_VALUE;

		int i = 1;
		while (array[1][i] == array[1][0]) {
			fin = array[0][i] < fin ? array[0][i] : fin;
			i++;
		}
		return fin;
	}

	public void display() {
		int i = 0;
		while (i < array[1].length) {
			System.out.print(array[1][i]);
			System.out.print(" >> ");
			System.out.print(array[0][i]);
			System.out.print("\n");
			i++;
		}
	}
}
