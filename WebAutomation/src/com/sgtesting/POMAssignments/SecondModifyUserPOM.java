package com.sgtesting.POMAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondModifyUserPOM {
	public static WebDriver oBrowser=null;
	public static POMActipage oPage=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		login();		
		minimize();
		user();
		AddUSer();
		ModifyUSer();
		DeleteUSer();
		Logout();
		CloseBrowser();

	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new POMActipage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			oBrowser.manage().window().maximize();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void login()
	{
		try
		{
			oPage.insertuser().sendKeys("admin");
			oPage.insertpassword().sendKeys("manager");
			oPage.clickLogin().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void minimize()
	{
		try
		{
			
			oPage.clickminimize().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void AddUSer()
	{
		try
		{
			
			oPage.addfirstname().sendKeys("Samarth");
			oPage.addMiddlename().sendKeys("S");
			oPage.addLastname().sendKeys("xyz");
			oPage.addUsername().sendKeys("abcxyz");
			oPage.addEmail().sendKeys("abc@gmail.com");
			oPage.addPassword().sendKeys("123456");
			oPage.addPasswordcopy().sendKeys("123456");
			oPage.ClickCreateuser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void ModifyUSer()
	{
		try
		{
			
			oPage.clickonUser().click();
			oPage.addfirstname().clear();
			Thread.sleep(1000);
			oPage.addfirstname().sendKeys("niki");
			Thread.sleep(1000);
			oPage.addMiddlename().clear();
			Thread.sleep(1000);
			oPage.addMiddlename().sendKeys("n");
			Thread.sleep(1000);
			oPage.addLastname().clear();
			Thread.sleep(1000);
			oPage.addLastname().sendKeys("Gowda");
			Thread.sleep(1000);
			oPage.addUsername().clear();
			Thread.sleep(1000);
			oPage.addUsername().sendKeys("Nikhilkc");
			Thread.sleep(1000);
			oPage.addEmail().clear();
			Thread.sleep(1000);
			oPage.addEmail().sendKeys("qwer@gmail.com");
			Thread.sleep(1000);
			oPage.addPassword().clear();
			Thread.sleep(1000);
			oPage.addPassword().sendKeys("789456");
			Thread.sleep(1000);
			oPage.addPasswordcopy().clear();
			Thread.sleep(1000);
			oPage.addPasswordcopy().sendKeys("789456");
			Thread.sleep(1000);
			oPage.Saveuserchanges().click();
			Thread.sleep(1000);
			
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void DeleteUSer()
	{
		try
		{
			
			oPage.clickModifiedUser().click();
			Thread.sleep(2000);
			oPage.DeleteUser().click();
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
	private static void Logout()
	{
		try
		{
			
			oPage.logout().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void user()
	{
		try
		{
			oPage.clickuser().click();
			oPage.adduser().click();
		}catch(Exception e)
		{
			
		}
	}
	private static void CloseBrowser()
	{
		try
		{
			oBrowser.close();
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
