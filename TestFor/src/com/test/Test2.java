package com.test;



public class Test2 {
	public static void main(String[] args) {
		
		String str = "123321";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();// 把字符串反转
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == sb.charAt(i)) {
				count++; //统计相同字符的个数
			}
		}
		if (count == str.length()) {
			 System.out.println("shi");
			 
		} else {
			 System.out.println("否");
	}
	}
}
		
