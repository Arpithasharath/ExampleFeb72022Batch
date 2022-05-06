package com.sgtesting.cssselector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteCssSelector {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
	//	absolutecssselectorpath();
	//	relativeCSSByTagName();
	//	relativeCSSByTagNameWithIDAttributeValue();
	//	relativeCSSByIDAttributeValue();
	//	relativeCSSByTagNameWithClassAttributeValue();
	//	relativeCSSByClassAttributeValue();
	//	relativeCSSByTagNameWithAttributeNameValueCombination();
	//	relativeCSSByAttributeNameValueCombination();
	//	relativeCSSByTagNameWithMultipleAttributeNameValueCombination();
	//	relativeCSSByTagNameWithPartialAttributeNameValueCombination();
	//	relativeCSSByTagNameWithAttributeNameCombination();
	//	relativeCSSByTagNameWithAttributeNameCombination_1();
	//	 relativeCSSByTagNameWithAttributeNameCombination_2();
	//	relativeCSSByTagNameWithAttributeNameCombination_3();
	//	relativeCSSByTagNameWithParentElement();
	//	relativeCSSBynthChildConcept();
		relativeCSSBySiblingConcept();
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
			obrowser.get("E:\\ActiTime_Software\\Actitime\\Sample.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void absolutecssselectorpath()
	{
		try
		{
			obrowser.findElement(By.cssSelector("html body div form input")).sendKeys("Demouser1");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void relativeCSSByTagName()
	{
		try
		{
			obrowser.findElement(By.cssSelector("input")).sendKeys("Demouser1");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void relativeCSSByTagNameWithIDAttributeValue()
	{
		try
		{
			obrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("Demouser1");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void relativeCSSByIDAttributeValue()
	{
		try
		{
			obrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("Demouser1");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	/**
	 * Case 4: Identify the Element based on 
	 * tagname with class attribute value
	 * Syntax: <tagname>.<class attribute value>
	 */
	private static void relativeCSSByTagNameWithClassAttributeValue()
	{
		obrowser.findElement(By.cssSelector("input.submit1btn1")).click();
		
	}
	
	/**
	 * Case 5: Identify the Element based on 
	 * class attribute value
	 * Syntax: .<class attribute value>
	 */
	private static void relativeCSSByClassAttributeValue()
	{
		obrowser.findElement(By.cssSelector(".submit1btn1")).sendKeys("Demouser1");
		
	}
	
	/**
	 * Case 6: Identify the Element based on tagname with
	 * attribute Name and attribute value combination
	 * Syntax: <tagname>[attributename='attribute value']
	 */
	private static void relativeCSSByTagNameWithAttributeNameValueCombination()
	{
		obrowser.findElement(By.cssSelector("a[href='http://www.gmail.com']")).click();
		
	}
	
	/**
	 * Case 7: Identify the Element based on 
	 * attribute Name and attribute value combination
	 * Syntax: [attributename='attribute value']
	 */
	private static void relativeCSSByAttributeNameValueCombination()
	{
		obrowser.findElement(By.cssSelector("[href='http://www.selenium.dev']")).click();
		
	}
	
	/**
	 * Case 8: Identify the Element based on tagname with
	 * Multiple attribute Name and attribute value combination
	 * Syntax: <tagname>[attributename='attribute value'][attributename='attribute value']
	 */
	private static void relativeCSSByTagNameWithMultipleAttributeNameValueCombination()
	{
		obrowser.findElement(By.cssSelector("input[id='btn1submit1button1'][name='submit1btn1']")).click();
	}	
	
	/**
	 * Case 9: Identify the Element based on tagname with
	 * partial matching of Attribute Value
	 * Syntax: 
	 * <tagname>[attributename ^= 'partial attribute value']
	 * <tagname>[attributename $= 'partial attribute value']
	 * <tagname>[attributename *= 'partial attribute value']
	 */
	private static void relativeCSSByTagNameWithPartialAttributeNameValueCombination()
	{
	//	obrowser.findElement(By.cssSelector("a[href^='http']")).click();
		obrowser.findElement(By.cssSelector("a[href*='selenium']")).click();
	}
	
	/**
	 * Case 10: Identify the Element based on tagname with
	 * attribute Name combination
	 * Syntax: <tagname>[attributename]
	 */
	private static void relativeCSSByTagNameWithAttributeNameCombination()
	{
		//List<WebElement> olinks = obrowser.findElement(By.cssSelector("a[href]"));
		List<WebElement> olinks=obrowser.findElements(By.cssSelector("a[href]"));
		System.out.println(+olinks.size());
	}
	
	private static void relativeCSSByTagNameWithAttributeNameCombination_1()
	{
		List<WebElement> olinks=obrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			System.out.println(link.getText());
		}
	}
	
	private static void relativeCSSByTagNameWithAttributeNameCombination_2()
	{
		//Perform click on link in the Web Page based on ends with Text content
		List<WebElement> olinks=obrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String text=link.getText();
			if(text.contains("HQ"))
			{
				link.click();
				break;
			}
		}
	}
	
	private static void relativeCSSByTagNameWithAttributeNameCombination_3()
	{
		//org.openqa.selenium.StaleElementReferenceException: stale element reference: 
		//element is not attached to the page document
		List<WebElement> olinks=obrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String text=link.getText();
			if(text.contains("HQ"))
			{
				link.click();
			}
		}
	}
	
	/**
	 * Case 11: Identify the Element based on parent element
	 * Syntax: parent Element
	 */
	private static void relativeCSSByTagNameWithParentElement()
	{
		obrowser.findElement(By.cssSelector("div#d3 >form#frm3 >input")).sendKeys("User1");
	}
	
	/**
	 * Case 12: Identify the Element based on nth Child
	 * Syntax: :nth-child(number)
	 */
	private static void relativeCSSBynthChildConcept()
	{
		obrowser.findElement(By.cssSelector("form#frm3 > :nth-child(5)")).sendKeys("user5");
	}
	
	/**
	 * Case 13: Identify the Element based on Sibling approach
	 * Syntax: :<tagname> + <tagname> + <tagname>
	 */
	private static void relativeCSSBySiblingConcept()
	{
		obrowser.findElement(By.cssSelector("form#frm3 > input+input+input")).sendKeys("user5");
	}
	
	
	
		
}
