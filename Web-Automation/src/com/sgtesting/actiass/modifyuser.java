package com.sgtesting.actiass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class modifyuser {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
			launchbrowser1();
			navigate();
			login();
			minimizeflyoutwindow();
			createuser();
			modifyuser();
			deleteuser();
			logout();
			closebrowser();
	}
	
	private static void launchbrowser1()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\JavaAutomation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			obrowser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.linkText("Login")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeflyoutwindow()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createuser()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			obrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			obrowser.findElement(By.name("firstName")).sendKeys("Manu");
			obrowser.findElement(By.name("lastName")).sendKeys("kadle");
			obrowser.findElement(By.name("email")).sendKeys("manu@gmail.com");
			obrowser.findElement(By.name("username")).sendKeys("manu");
			
			obrowser.findElement(By.name("password")).sendKeys("manvith");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("manvith");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyuser()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			obrowser.findElement(By.xpath("//span[text()='kadle, Manu']")).click();
			obrowser.findElement(By.name("firstName")).clear();
			obrowser.findElement(By.name("firstName")).sendKeys("Manvith");
			Thread.sleep(2000);
		//	obrowser.findElement(By.linkText("//span[text()='Save Changes']")).click();
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteuser()
	{
		try
		{
				obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
				obrowser.findElement(By.xpath("//span[text()='kadle, Manvith']")).click();
				
				Thread.sleep(2000);
				obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();

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
	
	private static void logout()
	{
		try
		{
			obrowser.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(0);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closebrowser()
	{
		try
		{
			obrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	














}
