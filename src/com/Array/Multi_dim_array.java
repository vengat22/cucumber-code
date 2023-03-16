package com.Array;

import java.util.Arrays;

public class Multi_dim_array {
	public static void main(String[] args) {
		int arr[][] =new int[2][3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 40;
		arr[1][0] = 50;
		arr[1][1] = 30;
		arr[1][2] = 60;
		System.out.println(arr[1][2]);
		
		Arrays.sort (arr);
		
		for (int i = 1; i <2; i++) {
			
			
			for (int j = 0; j <3; j++) {
				
				System.out.println(arr[i][j]);
			}
		}
	}

}
