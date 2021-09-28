package com.wings1.dca;

import java.util.Scanner;

public class Permutations {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		int k = sc.nextInt();
		int diff = high-low+1;
		int m,n,N,out;
		
		if(diff%2 == 0) {
			m = diff/2;
			n = m;
		}else {
			if(low%2 == 0) {
				m = (diff - 1)/2;
				n = m+1;
			}else {
				m = (diff + 1)/2;
				n = m-1;
			}
		}
		N=m;
		
		for(int i=0; i<k-1; i++) {
			N = (N * (m+n)) % 1000000007;
		}
		
		out = evenSum(m,n,k,N) % 1000000007;
		System.out.println("Out :"+ out);
	}
	
	static int evenSum(int m, int n,int k, int N) {
		if(k==1) {
			return n;
		}else {
			return (N - (m-n) * evenSum(m,n,k-1,N) %(1000000007));
		}
	}
}
