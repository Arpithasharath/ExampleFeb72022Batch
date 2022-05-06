package com.sgtesting.autoitrun;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteUsingRobotClass {
	public static WebDriver obrowser=null;

	public static void main(String[] args) {	
	
			launchbrowser1();
			navigate();
			login();
			minimizeflyoutwindow();
			importtasks();

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
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
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
	
	private static void importtasks()
	{
		try
		{
			obrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(2000);
			
			obrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
			
			obrowser.findElement(By.xpath("//div[text()='Import tasks from CSV']")).click();
			Thread.sleep(2000);
			
			obrowser.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(2000);
			
			String filename="E:\\ActiTime_Software\\Sample (1).csv";
			copyFile(filename);
			Thread.sleep(2000);
			
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_V);

			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void copyFile(String filename)
	{
		StringSelection stringselection=new StringSelection(filename);
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Clipboard clipboard=toolkit.getSystemClipboard();
		clipboard.setContents(stringselection, null);
	}


}
