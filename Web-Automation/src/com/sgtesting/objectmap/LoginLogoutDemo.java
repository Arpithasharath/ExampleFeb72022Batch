package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {

		public static WebDriver obrowser=null;
		public static ObjectMap objectmap=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimiseflyoutwindow();
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

}
