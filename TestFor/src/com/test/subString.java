package com.test;

import java.util.Scanner;

public class subString {
	public static void main(String[] args) {
		int count = 0;
		String hw = "12345654321";
		
		boolean ishuiwen =true; 
		for (int i = 1;  i<= hw.length()/2; i++) {
			String a = hw.substring(i-1 ,i);
			String b = hw.substring(hw.length()-i,hw.length()-(i-1));
			if(!a.equals(b)) {
				ishuiwen =false;
				                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		}else {
			System.out.println(ishuiwen);
			System.out.println(a);
			System.out.println(b);
				
			
			}
	}
	}
}
	
	

