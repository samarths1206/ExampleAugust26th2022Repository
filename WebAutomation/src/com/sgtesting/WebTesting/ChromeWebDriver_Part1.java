package com.sgtesting.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriver_Part1 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
	launchBrowser();
	navigate();
	closeBrowser();
	}

private static void launchBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\drivers\\chromedriver.exe" );
		//if not provided illegal exception occurs
		oBrowser =new ChromeDriver();
		
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void navigate() {
	try
	{
		oBrowser.get("http://sgtestinginstitute.com/");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void closeBrowser()
{
	try
	{
		oBrowser.close();
		Thread.sleep(5000);
	}
	catch(Exception d)
	{
		d.printStackTrace();
	}
}

}
