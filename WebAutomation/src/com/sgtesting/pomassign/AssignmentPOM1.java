package com.sgtesting.pomassign;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPOM1 {
	public static WebDriver oBrowser=null;
	public static ActiPageDEMO oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		UserCreation();
		UserDelete();
		logout();
		closeApp();

	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiPageDEMO(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void UserCreation()
	{
		try
		{
          oPage.UserClick().click();
          Thread.sleep(2000);
          oPage.UserAdd().click();
          Thread.sleep(2000);
          oPage.FName().sendKeys("Nikhil"); 
          oPage.MName().sendKeys("KC");
          oPage.LName().sendKeys("Gowda");
          oPage.mail().sendKeys("nikhilgowdakc1999@gmail.com");
          oPage.Username().sendKeys("Nikki");
          oPage.Password().sendKeys("123");
          oPage.Repassword().sendKeys("123");
          oPage.CreateUserButton().click();
          Thread.sleep(2000);
          
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void UserDelete()
	{
		try
		{
			oPage.SelectUser().click();
			Thread.sleep(2000);
			oPage.DeleteUser().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApp()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
