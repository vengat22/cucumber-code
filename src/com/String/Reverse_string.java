package com.String;

public class Reverse_string {
	public static void stringReverse() {
		String s="hi this is java";
		String output ="";
		char[] charArray = s.toCharArray();
		for (int i =s.length()-1;i>=0; i--) {
			output=output+charArray[i];
			
			
		}
			System.out.println(output);	
	}
	public static void main(String[] args) {
		stringReverse();
	}

}
