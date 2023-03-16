package com.exception;

import java.util.Scanner;

public class input_mismatch_exception {
	public static void main(String[] args) {
		System.out.println("inputmismatch exception");
	Scanner s=new Scanner(System.in);
	System.out.println("enter value");
	int val =s.nextInt();
	System.out.println(+val);
	
	}

}
