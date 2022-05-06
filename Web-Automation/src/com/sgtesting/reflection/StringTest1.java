package com.sgtesting.reflection;

public class StringTest1 {

	public void displayLength()
	{
		String s="Java";
		int a=s.length();
		System.out.println("number of characters: "+a);
		System.out.println("============================");
	}

	public void verifyempty()
	{
		String s=new String();
		boolean b=s.isEmpty();
		System.out.println("is string is empty : "+b);
		System.out.println("============================");
	}

	public void showcharacter()
	{
		String s="Java";
		char ch=s.charAt(1);
		System.out.println("character:= "+ch);
		System.out.println("===============================");
	}
	
	public void lowercase()
	{
		String s="JAVA";
		String str=s.toLowerCase();
		System.out.println(str);
		System.out.println("==================================");
	}
	
	public void uppercase()
	{
		String s="java";
		String str=s.toUpperCase();
		System.out.println(str);
		System.out.println("==================================");
	}
	
	public void extractstring()
	{
		String s="Welcome";
		String str=s.substring(3);
		System.out.println(str);
		System.out.println("===================================");
		String s1=s.substring(3, 4);
		System.out.println(s1);
		System.out.println("====================================");
	}
}
