package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomerDemo {

		public static WebDriver obrowser=null;
		public static ObjectMap objectmap=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimiseflyoutwindow();
			createcustomer();
			modifycustomer();
			deletecustomer();
			logout();
	//		closeApplication();
		}
		
		private static void launchBrowser()
		{
			String filename=null;
			try
			{
				filename="E:\\JavaAutomation\\ObjectMap.properties";
				System.setProperty("webdriver.chrome.driver", "E:\\JavaAutomation\\Web-Automation\\Library\\driver\\chromedriver.exe");
				obrowser=new ChromeDriver();
				objectmap=new ObjectMap(filename);
			}catch(Exception e)
			{
				e.printStackTrace();;
			}
		}
		
		private static void navigate()
		{
			try
			{
				obrowser.get("http://localhost:82/login.do");
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();;
			}
		}
		
		private static void login()
		{
			try
			{
				obrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
				
				obrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
				
				obrowser.findElement(objectmap.getLocator("loginpageloginbutton")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void logout()
		{
			try
			{
				obrowser.findElement(objectmap.getLocator("homepagelogoutbutton")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void minimiseflyoutwindow()
		{
			try
			{
				obrowser.findElement(objectmap.getLocator("homepageflyoutwindow")).click();
				Thread.sleep(2000 );
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void createcustomer()
		{
			try
			{
				obrowser.findElement(objectmap.getLocator("homepagetasks")).click();
				Thread.sleep(2000);

				obrowser.findElement(objectmap.getLocator("taskaddnewcustomer")).click();
				Thread.sleep(2000);

				obrowser.findElement(objectmap.getLocator("tasknewcustomer")).click();
				Thread.sleep(2000);

				obrowser.findElement(objectmap.getLocator("entercustomername")).sendKeys("customer1");
				Thread.sleep(2000);
				
				obrowser.findElement(objectmap.getLocator("createcustomerbutton")).click();
				
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void modifycustomer()
		{
			try
			{
				obrowser.findElement(objectmap.getLocator("homepagetasks")).click();
				obrowser.findElement(objectmap.getLocator("taskssettingsbutton")).click();
				Thread.sleep(2000);
				
				obrowser.findElement(objectmap.getLocator("customerstatusdropdown")).click();
				Thread.sleep(2000);
			
				obrowser.findElement(objectmap.getLocator("customerstatusarchieve")).click();
				Thread.sleep(2000);

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void deletecustomer()
		{
			try
			{
				obrowser.findElement(objectmap.getLocator("deletecustomeractionbutton")).click();
				Thread.sleep(2000);
				
				obrowser.findElement(objectmap.getLocator("deletecustomer")).click();
				Thread.sleep(4000);
				
				obrowser.findElement(objectmap.getLocator("deletecustomerpermanently")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}

	}

}
