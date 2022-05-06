package com.sgtesting.reflection;

import java.lang.reflect.Method;

public class ReflectionWithParameters {

	public static void main(String[] args) {
		Sample2 obj=new Sample2();
		Sample3 obj1=new Sample3();
		try
		{
			//create parameter for String
			Class strparam[]=new Class[1];
			strparam[0]=String.class;
			
			Method method1=obj.getClass().getMethod("showfn",strparam);
			method1.invoke(obj, new String("santosh"));
			
			//create parameter for integer
			Class intparam[]=new Class[1];
			intparam[0]=Integer.TYPE;
			
			Method method2=obj.getClass().getMethod("showage", intparam);
			method2.invoke(obj, 19);
			
			//create parameter for multiple strings
			Class multipleparam[]=new Class[2];
			multipleparam[0]=String.class;
			multipleparam[1]=String.class;
			
			Method method3=obj.getClass().getMethod("showcityname",multipleparam);
			method3.invoke(obj, "Davangere","Karnataka");
			
			System.out.println("==========================================");
			
			//create parameter for string
			Class sparam[]=new Class[1];
			sparam[0]=String.class;
			
			Method method4=obj1.getClass().getMethod("showname", sparam);
			method4.invoke(obj1,"Anvitha");
			
			//create parameter for integer
			Class inparam[]=new Class[1];
			inparam[0]=Integer.TYPE;
			
			Method method5=obj1.getClass().getMethod("showrollno", inparam);
			method5.invoke(obj1, 21);
			
			//create parameter for string
			Class s1param[]=new Class[1];
			s1param[0]=String.class;
			
			Method method6=obj1.getClass().getMethod("showcollege", s1param);
			method6.invoke(obj1, "B.I.E.T");
			
			//create parameter for MultipleString
			Class mulparam[]=new Class[2];
			mulparam[0]=String.class;
			mulparam[1]=String.class;
			
			Method method7=obj1.getClass().getMethod("showcityname", mulparam);
			method7.invoke(obj1,"Davangere","Karnataka");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
