package com.sgtesting.reflection;
public class StringBufferDemo1 {
		
	public void appendDemo()
	{
		StringBuffer s=new StringBuffer("Java");
		s.append(" Programming");
		System.out.println(s);
		System.out.println("++++++++++");
	}
	
	public void insertDemo()
	{
		StringBuffer s=new StringBuffer("It is a palace");
		s.insert(8, "new ");
		System.out.println("Insert Result:"+s);
		System.out.println("++++++++++");
	}
	
	public void deleteDemo()
	{
		StringBuffer s=new StringBuffer("It is a new palace");
		s.delete(8, 12);
		System.out.println("Deleted Result:"+s);
		System.out.println("++++++++++");
	}
	
	public void reverseStr1()
	{
		StringBuffer s=new StringBuffer("It is a new palace");
		s.reverse();
		System.out.println(s);
		System.out.println("++++++++++");
	}

}
