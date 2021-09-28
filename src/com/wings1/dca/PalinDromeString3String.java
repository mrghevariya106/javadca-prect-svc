package com.wings1.dca;

import java.util.Scanner;

public class PalinDromeString3String {
	
	static boolean isPalindromeStr(String sr) {
		if(sr.length() == 1) {
			return true;
		}else{
			StringBuilder sb = new StringBuilder(sr);
			sb = sb.reverse();
			String rev = new String(sb);
			return sr.equals(rev);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int len = str.length();
		String str1="", str2="", str3="";
		
		boolean flag = false;
		
		for(int i=1;i<len-i;i++) {
			str1 = str.substring(0,i);
			if(isPalindromeStr(str1)) {
				for(int j=1;j<len-i;j++) {
					str2 = str.substring(i,i+j);
					str3 = str.substring(i+j,len);
					
					if(isPalindromeStr(str2) && isPalindromeStr(str3)) {
						System.out.println(str1 + "\n" + str2 + "\n" + str3);
						flag=true;
						break;
					}
				}
				
				if(flag) {
					break;
				}
			}
		}
		if(flag == false) {
			System.out.println("Impossible");
		}
	}
}
