package com.String;

public class String_function {
	public static void main(String[] args) {
		
	
	String s= "java";
	String s1="javA";
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s.equals(s1));
 	System.out.println(s.equalsIgnoreCase(s1));
 	System.out.println(s==s1);
 	System.out.println("s memory value="+System.identityHashCode(s));
 	System.out.println("s1 memory value" +System.identityHashCode(s1));

}
}