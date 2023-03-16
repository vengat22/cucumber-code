package com.String;

public class String_type {
public static void main(String[] args) {
	String s="java";
	String s1="JAVA";
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s1.equals(s));
	System.out.println(s==s1);
	System.out.println("s memory value="+System.identityHashCode(s));
    System.out.println("s1 memory value="+System.identityHashCode(s1));
}
}
