package com.base;

import java.util.Scanner;

public class Fibonic {
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the fibonaci series ");
		
		int n=scan.nextInt();
		
		for(int i=0; i<n; i++) {
			
			 System.out.print(fibonacci(i) + " ");
			
		}		
	}

	public static int fibonacci(int n) {
		if(n<=1) {
			
		
		return n;
		
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
