package com.String;

public class String_methods {
	public static void main(String[] args) {
	String s="this is java";
      int length =s.length();
      System.out.println("length of string is " +length);
      boolean equalsIgnoreCase = s.equalsIgnoreCase("this is JAVA");
      System.out.println("ignore case sensitivity "+equalsIgnoreCase);
      String upperCase = s.toUpperCase();
      System.out.println("to upper case "+upperCase);
      String lowerCase = s.toLowerCase();
      System.out.println("to lower case "+lowerCase);
      boolean startsWith = s.startsWith("t");
      System.out.println("starting letter "+startsWith);
      boolean endsWith = s.endsWith("a");
      System.out.println("ending letter"+endsWith);
      boolean contains = s.contains("is");
      System.out.println("checking data"+contains);
	  char charAt = s.charAt(2);
	  System.out.println("haracter at index 2 "+charAt);
	  String replace = s.replace('i', 's');
	  System.out.println("replace string is "+replace);
	  String substring = s.substring(2);
	  System.out.println("substring ="+substring);
	  String substring2 = s.substring(1, 6);
	  System.out.println("substring 2 "+substring2);
	  boolean empty = s.isEmpty();
	  System.out.println("is empty "+empty);
	  String[] split = s.split(" ");
	  System.out.println("string after split ");
	  for (String word : split) {
		System.out.println(word);
	}
	String trim = s.trim();
	System.out.println("string after trimming "+trim);
	String concat = s.concat(" project");
	System.out.println("concat "+concat);
	}
}