package com.sgtesting.actiass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUser {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeflyoutwindow();
	//	creatuser();
		deleteuser();
	//	logout();
	//	closebrowser();
	}
	
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\JavaAutomation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			obrowser =new ChromeDriver();
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
			By by=By.id("username");
			WebElement oele=obrowser.findElement(by);
			oele.sendKeys("admin");
			
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			
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
	
	private static void creatuser()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
			obrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_firstNameField\"]")).sendKeys("Anil");
			obrowser.findElement(By.name("lastname")).sendKeys("Thotad");
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_emailField\"]")).sendKeys("anil@gmail.com");
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_usernameField\"]")).sendKeys("anil");
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordField\"]")).sendKeys("anil");
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordCopyField\"]")).sendKeys("anil");
			Thread.sleep(2000);
			//obrowser.findElement(By.linkText("Create User")).click();
			obrowser.findElement(By.xpath("//span[text()='Create User']")).click();
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
			
			obrowser.findElement(By.xpath("//span[text()='Thotad, Anil']")).click();
			//obrowser.findElement(By.linkText("kadle, Manu")).click();
			//obrowser.findElement(By.xpath("//*[@id="userListTableContainer"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
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

}
