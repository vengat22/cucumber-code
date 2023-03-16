package com.Array;

public class findequalentpair {
public static void main(String[] args) {
	
	
	int arr[]= {1,2,3,4,5,6,7,8,0,10};
	int target=5;
	for (int i = 0; i < arr.length; i++) {
		
		for (int j = 0; j < arr.length; j++) {
			
			if (arr[i]+arr[j]==target) {
				
				System.out.println("{"+arr[i] +"," + arr[j]+"}");
			}
		}
	}
}
}
