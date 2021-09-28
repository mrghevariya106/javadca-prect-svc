package com.wings1.dca;

import java.util.Arrays;
import java.util.Scanner;

public class SqureMatrixwith {
	int[][] arr;
	int row, column;
	int max;

	SqureMatrixwith() {
		Scanner scan = new Scanner(System.in);
		row = scan.nextInt();
		column = scan.nextInt();
		arr = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println("Array :"+ Arrays.toString(arr));
		max = 0;
	}

	void summer(int i, int j) {
		int flag = 1;
		int sum;
		while (flag <= column - j) {
			sum = 0;
			for (int k = i; k < flag + i; k++) {
				for (int l = j; l < flag + j; l++) {
					sum += arr[k][l];
				}
			}
			if (sum == (flag * flag)) {
				if (max < flag)
					max = flag;
				flag++;
			} else {
				return;
			}
		}
	}

	void calc() {
		for (int i = 0; i < (row - max); i++) {
			for (int j = 0; j < column - max; j++) {
				if (arr[i][j] == 1) {
					summer(i, j);
				}
			}
		}
	}

	public static void main(String[] args) {
		SqureMatrixwith t = new SqureMatrixwith();
		t.calc();
		System.out.println(t.max);
	}
}
