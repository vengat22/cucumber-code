package com.String;

public class String_comparison {
	public static void main(String[] args) {
		String s1="bala";
		String s2=new String("bala");
		String s3="bala";
		String s6=new String("bala");
		StringBuffer s4= new StringBuffer("bala");
		StringBuffer s5= new StringBuffer("bala");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s1));
		System.out.println(s5==s4);
		System.out.println(s2==s6);
		System.out.println(s2.equals(s6));
		System.out.println(s4.equals(s5));
		
		
		
	}

}