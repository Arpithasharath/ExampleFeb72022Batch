package com.sgtesting.actiass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimize();
		closebrowser();
		
		logout();
		
	}
	
	private static void launchbrowser()
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
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closebrowser()
	{
		try
		{
			obrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			By by=By.id("username");
			WebElement oele=obrowser.findElement(by);
			oele.sendKeys("admin");
			
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(4000);
			obrowser.findElement(By.linkText("Login")).click();
		//	obrowser.findElement(By.xpath("//div[text()='Login']")).click();
		//	obrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimize()
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

}
