package com.sgtesting.xpathtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	
		private static WebDriver obrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
		//	absoluteXPath();
		//	relativeXPathUsingTagName();
			relativeXPathUsingTagNameandIndex();
		//	relativeXPathUsingTagNameWithAttributeNameValue();
		//	relativeXPathUsingTagNameWithAttributeValueAlone();
			relativeXPathUsingTagNameWithMultipleAttributeNameValue();
		//	relativeXPathUsingTagNameWithMultipleAttributeNameValueOROperator();
		//	relativeXPathUsingTagNameWithMultipleAttributeNameValueAndOperator();
			relativeXPathUsingAttributeNameValueCombination();
			relativeXPathUsingPartialMatchingOfAttributeValue();
		//	relativeXPathUsingTagNameWithAttributeName();
		//	relativeXPathUsingTagNameWithAttributeName_1();
		//	relativeXPathUsingTagNameWithAttributeName_2();
		//	relativeXPathUsingTagNameWithAttributeName_3();
		//	relativeXPathUsingTagNameWithTextContent();
		//	relativeXPathUsingTagNameWithPartialTextContent();
		}
		private static void launchBrowser()
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
				obrowser.get("file:\\E:\\ActiTime_Software\\Actitime\\sample.html");
				Thread.sleep(4000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void absoluteXPath()
		{
			obrowser.findElement(By.xpath("html//body//div//form//input")).sendKeys("admin");
			obrowser.findElement(By.xpath("html//body//div//form//input[2]")).sendKeys("manager");
			obrowser.findElement(By.xpath("html/body/div/form/input[3]")).click();//works fine for single slash
		}
		
		/**
		 * case 1: Identify the Element using <tagname>
		 * Syntax: //<tagname>
		 */
		
		private static void relativeXPathUsingTagName()
		{
			obrowser.findElement(By.xpath("//input")).sendKeys("admin");
			obrowser.findElement(By.xpath("//select")).click();
			obrowser.findElement(By.xpath("//select//option")).click();
		}
		
		/**
		 * case 2: Identify the Element using <tagname> with index
		 * Syntax: //<tagname>[index]
		 */
		
		private static void relativeXPathUsingTagNameandIndex()
		{
			obrowser.findElement(By.xpath("//input[1]")).sendKeys("admin");
		}
		
		/**
		 * case 3: Identify the Element using <tagname> with 
		 * Attribute name and attribute value combination
		 * Syntax: //<tagname>[@attributename='attributevalue']
		 */
		private static void relativeXPathUsingTagNameWithAttributeNameValue()
		{
			obrowser.findElement(By.xpath("//input[@name='user1name1']")).sendKeys("admin");
		}
		
		/**
		 * case 4: Identify the Element using <tagname> with 
		 * Attribute name and attribute value combination
		 * Syntax: //<tagname>[@*='attributevalue']
		 */
		private static void relativeXPathUsingTagNameWithAttributeValueAlone()
		{
			obrowser.findElement(By.xpath("//input[@*='pass1word1']")).sendKeys("manager");
		//	obrowser.findElement(By.xpath("//input[2][@*='pass1word1']")).sendKeys("manager");//if Value of username attribute is same as password attribute value
		}
		
		/**
		 * case 5: Identify the Element using <tagname> with 
		 * Multiple Attribute name and attribute value combination
		 * Syntax: //<tagname>[@attributename='attributevalue'][@attributename='attributevalue']
		 */
		private static void relativeXPathUsingTagNameWithMultipleAttributeNameValue()
		{
			obrowser.findElement(By.xpath("//input[@name='pass1word1'][@id='pwd1pass1word1']")).sendKeys("manager");
		}
		
		/**
		 * case 6: Identify the Element using <tagname> with 
		 * Multiple Attribute name and attribute value combination using or operator
		 * Syntax: //<tagname>[@attributename='attributevalue' or @attributename='attributevalue']
		 */
		
		private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueOROperator()
		{
			obrowser.findElement(By.xpath("//input[@name='pass1word1'or @id='pwd1pass1word1']")).sendKeys("manager");
		}
		
		/**
		 * case 7: Identify the Element using <tagname> with 
		 * Multiple Attribute name and attribute value combination using and operator
		 * Syntax: //<tagname>[@attributename='attributevalue' and @attributename='attributevalue']
		 */
		private static void relativeXPathUsingTagNameWithMultipleAttributeNameValueAndOperator()
		{
			obrowser.findElement(By.xpath("//input[@type='button' and @id='btn1submit1button1']")).click();
		}
		
		/**
		 * case 8: Identify the Element using 
		 * Attribute name and attribute value combination 
		 * Syntax: //*[@attributename='attributevalue']
		 */
		private static void relativeXPathUsingAttributeNameValueCombination()
		{
			obrowser.findElement(By.xpath("//*[@id='btn1submit1button1']")).click();
		}
		
		/**
		 * case 9: Identify the Element using <tagname> with
		 * partial matching of attribute value 
		 * starts-with(@attributename,'partialattributevalue')
		 * ends-with(@attributename,'partialattributevalue')
		 * contains(@attributename,'partialattributevalue')
		 * Syntax: //<tagname>[starts-with(@attributename,'partialattributevalue')]
		 * Syntax: //<tagname>[ends-with(@attributename,'partialattributevalue')]
		 * Syntax: //<tagname>[contains(@attributename,'partialattributevalue')]
		 */
		private static void relativeXPathUsingPartialMatchingOfAttributeValue()
		{
			obrowser.findElement(By.xpath("//select[starts-with(@id,'to')]")).click();
		}
		

		/**
		 * case 10: Identify the Element using <tagname> with Attribute name 
		 * Syntax: //<tagname>[@attributename]
		 */
		private static void relativeXPathUsingTagNameWithAttributeName()
		{
			
		}
		

		/**
		 * case 11: Identify the Element using text content
		 * Syntax: //<tagname>[text()='text content']
		 */
		private static void relativeXPathUsingTagNameWithTextContent()
		{
		}
		
		/**
		 * case 12: Identify the Element using partial matching of text content
		 * starts-with(text(),'partial text content')
		 * ends-with(text(),'partial text content')
		 * contains(text(),'partial text content')
		 * Syntax: //<tagname>[starts-with(text(),'partial text content')]
		 * Syntax: //<tagname>[ends-with(text(),'partial text content')]
		 * Syntax: //<tagname>[contains(text(),'partial text content')]
		 */
		private static void relativeXPathUsingTagNameWithPartialTextContent()
		{
		}
}