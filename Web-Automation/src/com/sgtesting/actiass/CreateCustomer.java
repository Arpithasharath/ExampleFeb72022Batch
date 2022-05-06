package com.sgtesting.actiass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomer {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser1();
		navigate();
		login();
		minimizeflyoutwindow();
		createcustomer();
		modifycustomer();
		deletecustomer();
		logout();
	//	closebrowser();
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

private static void createcustomer()
{
	try
	{
		obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
		Thread.sleep(1000);

		obrowser.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(1000);

		obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
		Thread.sleep(1000);

		obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("aaa");
		Thread.sleep(1000);

		obrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void modifycustomer()
{
	try
	{
		//obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
		Thread.sleep(2000);

		obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(2000);

		//obrowser.findElement(By.xpath("//div[text()='Shweta']")).clear();
	//	obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[1]")).click();
		Thread.sleep(2000);
		
		
		obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]/div")).click();
		Thread.sleep(2000);
		
		//obrowser.findElement(By.xpath("//div[text()='aaa']")).sendKeys("Anvitha");
		obrowser.findElement(By.xpath("//div[text()='Archived']")).click();
		Thread.sleep(2000);
		
	}catch(Exception e )
	{
		e.printStackTrace();
	}
}

private static void deletecustomer()
{
	try
	{	
		obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
		Thread.sleep(2000);
		
		obrowser.findElement(By.xpath("//div[text()='Delete']")).click();
		Thread.sleep(2000);
		
	//	obrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
		obrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
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
