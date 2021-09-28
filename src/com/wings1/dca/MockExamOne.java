package com.wings1.dca;

import java.util.Arrays;
import java.util.Scanner;

public class MockExamOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int coins[] = new int[M];
		System.out.println("Enter Coin series: ");
		for (int i = 0; i < M; i++) {
			coins[i] = sc.nextInt();
		}
		System.out.println("Coin series: "+Arrays.toString(coins));
		
		System.out.println("Max profite is: "+findProfit(coins, M));
	}

	static int findProfit(int cns[], int m) {
		int maxProfit = 0;
		for (int i = 0; i < m; i++) {
			if (cns[i] >= maxProfit) {
				maxProfit += cns[i];
			} else {
				maxProfit = 0;
				maxProfit += cns[i];
			}

		}
		return maxProfit;

	}

}
