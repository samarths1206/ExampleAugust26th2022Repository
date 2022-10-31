package com.sgtesting.POMAssignmentSam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout {
	public static WebDriver oBrowser=null;
	public static Actipage oPage=null;
	
	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage =new Actipage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
			oPage.getUser().sendKeys("admin");
			oPage.getPassUser().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getMinimized().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void user1()
	{
		try
		{
			oPage.getUser1().click();
			Thread.sleep(1000);
			oPage.getAddu().click();
			Thread.sleep(1000);
			oPage.getFirst().sendKeys("Nikhil");
			oPage.getMidd().sendKeys("KC");
			oPage.getLast().sendKeys("Gowda");
			oPage.getmail().sendKeys("demo@gmail.com");
			oPage.getuserLoginName().sendKeys("Niki");
			oPage.getpa().sendKeys("123");
			oPage.getpc().sendKeys("123");
			oPage.getCreate().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modify()
	{
		try
		{
			oPage.getDel().click();
			Thread.sleep(2000);
			oPage.getFirst().clear();
			Thread.sleep(2000);
			oPage.getFirst().sendKeys("Samarth");
			Thread.sleep(1000);
			oPage.getSaveChanges().click();
			Thread.sleep(1000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void delUser()
	{
		try
		{
			oPage.getDel().click();
			Thread.sleep(2000);
			oPage.getDeleted().click();
			Thread.sleep(3000);
			Alert a=oBrowser.switchTo().alert();
			a.accept();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		oPage.getlogout().click();
	}
	public static void closeBrowser()
	{
		oBrowser.close();
	}

	public static void main(String[] args) {
	launchBrowser();
	navigate();
	login();
	user1();
	modify();
	delUser();
	Logout();
	closeBrowser();
	}

}
