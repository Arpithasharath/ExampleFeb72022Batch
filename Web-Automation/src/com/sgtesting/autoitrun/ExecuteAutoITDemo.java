package com.sgtesting.autoitrun;

public class ExecuteAutoITDemo {

	public static void main(String[] args) {
	
		executeauto();
	}
	
	private static void executeauto()
	{
		try
		{
			//Runtime.getRuntime().exec("E:\\Autoit\\India.exe");
			Runtime obj=Runtime.getRuntime();
			obj.exec("E:\\Autoit\\India.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
