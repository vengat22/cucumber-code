package com.Array;

public class Java_array {

	public static void main(String[] args) {
		System.out.println("array");
	int arr[] =new int[4];
	
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[2]=50;
	
	System.out.println(arr[0]);
	
	
	System.out.println("forloop array");
	
	for (int i = 0; i < arr.length; i++) {
		
		System.out.println(arr[i]);
		
	}
	
	System.out.println("for each");
	for (int a : arr) {
			System.out.println(a);
		
	}
	
	
	
	}
}
