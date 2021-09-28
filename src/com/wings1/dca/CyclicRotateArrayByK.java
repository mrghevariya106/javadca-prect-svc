package com.wings1.dca;
import java.util.Scanner;
import java.util.Arrays;

public class CyclicRotateArrayByK {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int M =sc.nextInt();
		int Array[] = new int[M];
		for(int i=0;i<M;i++) {
			Array[i] = sc.nextInt();
		}
		int S =sc.nextInt();
		
		int[] ans = rotate(Array,M,S);
		for(int i=0; i<M;++i) {
			System.out.print(ans[i]+ " ");
		}
	}
	
	static int[] rotate(int nums[], int m, int s) {
		if(s>m) {
			s=s%m;
		}
		
		int[] ans = new int[m];
		
		for(int i=0;i<s;i++) {
			ans[i] = nums[m-s+i];
		}
		
		int index = 0;
		for(int i=s;i<m;i++) {
			ans[i] = nums[index++];
		}
		return ans;
	}
}