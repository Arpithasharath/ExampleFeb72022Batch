package com.sgtesting.objectmap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserDemo {
		public static WebDriver obrowser=null;
		public static ObjectMap objectmap=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimiseflyoutwindow();
			createuser();
			modifyuser();
			deleteuser();
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
		
		private static void createuser()
		{
			try
			{
				obrowser.findElement(objectmap.getLocator("homepageusers")).click();
				obrowser.findElement(objectmap.getLocator("homepageadduser")).click();
				obrowser.findElement(objectmap.getLocator("adduserfirstname")).sendKeys("user1");
				obrowser.findElement(objectmap.getLocator("adduserlastname")).sendKeys("aaa");
				obrowser.findElement(objectmap.getLocator("adduseremailid")).sendKeys("user1@gmail.com");
				obrowser.findElement(objectmap.getLocator("adduserusername")).sendKeys("anil");
				obrowser.findElement(objectmap.getLocator("adduserpassword")).sendKeys("welcome");
				obrowser.findElement(objectmap.getLocator("adduserpasswordcopy")).sendKeys("welcome");
				Thread.sleep(2000);
				
				obrowser.findElement(objectmap.getLocator("addusercreateuserbutton")).click();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void modifyuser()
		{
			try
			{
				obrowser.findElement(objectmap.getLocator("homepageusers")).click();
				obrowser.findElement(objectmap.getLocator("homepageexistinguser")).click();
				Thread.sleep(2000);
				obrowser.findElement(objectmap.getLocator("modifyuserpassword")).sendKeys("password");
				Thread.sleep(2000);
				obrowser.findElement(objectmap.getLocator("modifyuserpasswordcopy")).sendKeys("password");
				obrowser.findElement(objectmap.getLocator("modifyusersavechangesbutton")).click();


			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void deleteuser()
		{
			try
			{
				obrowser.findElement(objectmap.getLocator("homepageusers")).click();
				Thread.sleep(2000);
				
				obrowser.findElement(objectmap.getLocator("homepageexistinguser")).click();
				Thread.sleep(4000);
				
				obrowser.findElement(objectmap.getLocator("deleteuserbutton")).click();
				Thread.sleep(2000);
				
				Alert oAlert=obrowser.switchTo().alert();
				String strContent=oAlert.getText();
				System.out.println(strContent);
				oAlert.accept();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}
