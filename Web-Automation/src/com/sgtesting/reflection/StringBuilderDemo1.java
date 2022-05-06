package com.sgtesting.reflection;

public class StringBuilderDemo1 {	
		public void appendDemo()
		{
			StringBuilder s=new StringBuilder("Java");
			s.append(" Programming");
			System.out.println(s);
			System.out.println("++++++++++");
		}
		
		public void insertDemo()
		{
			StringBuilder s=new StringBuilder("It is a palace");
			s.insert(8, "new ");
			System.out.println("Insert Result:"+s);
			System.out.println("++++++++++");
		}
		
		public void deleteDemo()
		{
			StringBuilder s=new StringBuilder("It is a new palace");
			s.delete(8, 12);
			System.out.println("Deleted Result:"+s);
			System.out.println("++++++++++");
		}
		
		public void reverseStr()
		{
			StringBuilder s=new StringBuilder("It is a new palace");
			s.reverse();
			System.out.println(s);
			System.out.println("++++++++++");
		}

	}

