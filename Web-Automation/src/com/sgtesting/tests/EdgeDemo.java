package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		
			launchBrowser();
			navigate();
			closeApplication();
		}
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.edge.driver", "E:\\JavaAutomation\\Web-Automation\\Library\\driver\\msedgedriver.exe");
				oBrowser=new EdgeDriver();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost:82/login.do");
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void closeApplication()
		{
			try
			{
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}


