package com.test;

import java.util.Scanner;

public class TestString {
	
	public static void main(String[] args) {
		int count =0;
		
		String n = "123" ;
		
		System.out.println("请输入");
		String m = new Scanner(System.in).nextLine();
		StringBuffer f = new StringBuffer(m);
		StringBuffer mReverse = f.reverse();
		for(int i = 0 ;i<n.length();i++) {
			
			if(n.charAt(i)==mReverse.charAt(i)) {
				count++;
			}
		}
		if(count==n.length()) {
			System.out.println("是回文");
		}else {
			System.out.println("不是回文");
		}
		}
	}

