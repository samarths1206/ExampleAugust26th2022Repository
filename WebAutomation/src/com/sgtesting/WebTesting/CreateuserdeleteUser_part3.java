package com.sgtesting.WebTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateuserdeleteUser_part3 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		clickClose();
		createUser();
		deleteUser();
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
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		
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
			Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		//oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		oBrowser.findElement(By.xpath("//div[text()=\"Add User\"]")).click();
		oBrowser.findElement(By.name("firstName")).sendKeys("Nikhil");
		oBrowser.findElement(By.name("middleName")).sendKeys("K C");
		oBrowser.findElement(By.name("lastName")).sendKeys("Gowda");
		oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("Nikhil");
		oBrowser.findElement(By.name("password")).sendKeys("123456");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456");
		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void deleteUser() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[2]")).click();
			Thread.sleep(2000);			
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}





