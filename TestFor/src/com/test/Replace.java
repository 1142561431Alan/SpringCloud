package com.test;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		System.out.println("请输入:");
		while (true) {
			String str = new Scanner(System.in).nextLine();
			String rep = str.replace("你", "").replace("?", "!").replace("吗", "").replace("我", "你");
		
			 
		
			System.out.println(rep);
			
		}
	}
}
