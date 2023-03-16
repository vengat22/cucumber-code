package com.Array;

import java.util.Scanner;

public class Array_add {
		public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		 System.out.println("enter row size");
		int row=s.nextInt();
		System.out.println("enter col siza");
		int col=s.nextInt();
		
		int marks[][]=new int [row][col];
		System.out.println("inputs");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				marks[i][j]=s.nextInt();
						
			}
		}
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <col; j++) {
				System.out.println(marks[i][j]+" ");
			}
		}
System.out.println();		
		
		
		
		
		}
		}