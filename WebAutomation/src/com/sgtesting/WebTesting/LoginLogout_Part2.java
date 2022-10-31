package com.sgtesting.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout_Part2 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
	launchBrowser();
	navigate();
	login();
	clickClose();
	logout();
	closeBrowser();
	
	}
	private static void launchBrowser()
	{ 
		try
		{System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
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
			oBrowser.get("http://localhost/login.do");
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
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
		   oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		   oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		   Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clickClose()
	{
		try
		{
		//oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
		oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
	//	oBrowser.findElement(By.id("logoutLink")).click();
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
