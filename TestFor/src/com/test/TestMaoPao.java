package com.test;

import java.util.Arrays;
import java.util.Random;

public class TestMaoPao {
	public static void main(String[] args) {
		
		int[] a  = {10,25,24,342,34,14};
		
		for(int i= 0;i<a.length-1 ;i++ ) {
			for(int j =0 ; j<a.length-i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] =a[j+1];
					a[j+1] = temp;
					
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
}	
