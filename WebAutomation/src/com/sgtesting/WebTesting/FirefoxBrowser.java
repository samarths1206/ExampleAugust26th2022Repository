package com.sgtesting.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
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
			System.setProperty("webdriver.gecko.driver","D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.google.com/");
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
			Thread.sleep(5000);// It sometimes takes more time to navigate so to wait for that time we must give thread .sleep(milliseconds)
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
