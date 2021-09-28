package com.wings1.dca;

import java.util.Scanner;

public class FindRepetativeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int S = sc.nextInt();
		System.out.println("OutPut: "+find(M, S));
	}

	static int find(int m, int s) {
		int count = 0;
		
		for(int i=m; i<=s;i++) {
			int num = i;
			boolean[] visited = new boolean[10];
			
			while(num>0) {
				if(visited[num % 10] == true) {
					break;
				}
				visited[num % 10] = true;
				num /= 10;
			}
			if(num == 0) {
				count++;
			}
		}
		
		return count;
	}
	
}
