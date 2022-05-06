package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createProjectDemo {

		public static WebDriver obrowser=null;
		public static ObjectMap objectmap=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimiseflyoutwindow();
			createcustomer();
			createproject();
			modifyproject();
			createtask();
			deleteproject();
			
		//	deletecustomer();
		//	logout();
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
		
		private static void modifyproject()
		{
			try
			{
			//	obrowser.findElement(objectmap.getLocator("homepagetasks")).click();
				obrowser.findElement(objectmap.getLocator("projectsettingsbutton")).click();
				Thread.sleep(2000);
				
				obrowser.findElement(objectmap.getLocator("projectdescriptionbox")).sendKeys("It is a sample project");
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
				//obrowser.findElement(objectmap.getLocator("homepagetasks")).click();
				//Thread.sleep(2000);
				
				obrowser.findElement(objectmap.getLocator("deletecustomersettings")).click();
				Thread.sleep(2000);
			
				
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
			
		private static void createproject()
			{
				try
				{
					obrowser.findElement(objectmap.getLocator("homepagetasks")).click();
					Thread.sleep(2000);
					
					obrowser.findElement(objectmap.getLocator("taskaddnewproject")).click();
					Thread.sleep(4000);
					
					obrowser.findElement(objectmap.getLocator("projectnew")).click();
					Thread.sleep(2000);
					
					obrowser.findElement(objectmap.getLocator("createnewproject")).sendKeys("project1");
					Thread.sleep(2000);
					
					obrowser.findElement(objectmap.getLocator("createnewprojectbutton")).click();
					Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		
		private static void deleteproject()
		{
			try
			{
				obrowser.findElement(objectmap.getLocator("projectsettingsbutton")).click();
				Thread.sleep(2000);
				
				obrowser.findElement(objectmap.getLocator("projectactionbutton")).click();
				Thread.sleep(4000);
				
				obrowser.findElement(objectmap.getLocator("projectdeletebutton")).click();
				Thread.sleep(2000);
				
				obrowser.findElement(objectmap.getLocator("projectdeletepermanentlybutton")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void createtask()
		{
			try
			{
				obrowser.findElement(objectmap.getLocator("taskaddnewbutton")).click();
				Thread.sleep(2000);
				
				obrowser.findElement(objectmap.getLocator("taskcreatenewtask")).click();
				Thread.sleep(4000);
				
				obrowser.findElement(objectmap.getLocator("tasktextfield")).sendKeys("task1");;
				Thread.sleep(2000);
				
				obrowser.findElement(objectmap.getLocator("taskcreatetaskbutton")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}
