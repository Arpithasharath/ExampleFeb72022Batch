package com.sgtesting.reflection;

public class Reflection4 {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Class.forName("com.sgtesting.reflection.Sample1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
