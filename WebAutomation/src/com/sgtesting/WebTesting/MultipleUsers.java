package com.sgtesting.WebTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleUsers {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		clickClose();
		createUser();
		logout();
		loginLogoutUsers();
		modifyPass();
		loginLogoutUsers1();
		loginLogoutAdminlast();
		loginLogoutUserslast();
		delUsers();
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
			oBrowser.manage().window().maximize();
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
		oBrowser.findElement(By.name("password")).sendKeys("123");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("123");
		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		Thread.sleep(3000);
			
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		oBrowser.findElement(By.xpath("//div[text()=\"Add User\"]")).click();
		oBrowser.findElement(By.name("firstName")).sendKeys("vinayak");
		oBrowser.findElement(By.name("middleName")).sendKeys("P");
		oBrowser.findElement(By.name("lastName")).sendKeys("Lakkundi");
		oBrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("vini");
		oBrowser.findElement(By.name("password")).sendKeys("456");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("456");
		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		Thread.sleep(3000);
		
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		oBrowser.findElement(By.xpath("//div[text()=\"Add User\"]")).click();
		oBrowser.findElement(By.name("firstName")).sendKeys("Samarth");
		oBrowser.findElement(By.name("middleName")).sendKeys("S");
		oBrowser.findElement(By.name("lastName")).sendKeys("Gowda");
		oBrowser.findElement(By.name("email")).sendKeys("demo2@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("Sam");
		oBrowser.findElement(By.name("password")).sendKeys("789");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("789");
		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginLogoutUsers()
	{
		try
		{
		oBrowser.findElement(By.id("username")).sendKeys("Nikhil");
		oBrowser.findElement(By.name("pwd")).sendKeys("123");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.id("username")).sendKeys("vini");
		oBrowser.findElement(By.name("pwd")).sendKeys("456");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.id("username")).sendKeys("Sam");
		oBrowser.findElement(By.name("pwd")).sendKeys("789");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyPass()
	{
		try
		{
		oBrowser.findElement(By.id("username")).sendKeys("Nikhil");
		oBrowser.findElement(By.name("pwd")).sendKeys("123");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();		   
		oBrowser.findElement(By.xpath("//span[text()='Gowda, Nikhil K C.']")).click();
		oBrowser.findElement(By.name("password")).sendKeys("1234");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
			
			
		oBrowser.findElement(By.id("username")).sendKeys("vini");
		oBrowser.findElement(By.name("pwd")).sendKeys("456");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();		   
		oBrowser.findElement(By.xpath("//span[text()='Lakkundi, vinayak P.']")).click();
		oBrowser.findElement(By.name("password")).sendKeys("4567");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("4567");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
				
				
		oBrowser.findElement(By.id("username")).sendKeys("Sam");
		oBrowser.findElement(By.name("pwd")).sendKeys("789");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();		   
		oBrowser.findElement(By.xpath("//span[text()='Gowda, Samarth S.']")).click();
		oBrowser.findElement(By.name("password")).sendKeys("6789");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("6789");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginLogoutUsers1()
	{
		try
		{
		oBrowser.findElement(By.id("username")).sendKeys("Nikhil");
		oBrowser.findElement(By.name("pwd")).sendKeys("1234");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.id("username")).sendKeys("vini");
		oBrowser.findElement(By.name("pwd")).sendKeys("4567");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.id("username")).sendKeys("Sam");
		oBrowser.findElement(By.name("pwd")).sendKeys("6789");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginLogoutAdminlast()
	{
		try
		{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		oBrowser.findElement(By.xpath("//span[text()='Gowda, Nikhil K C.']")).click();
		oBrowser.findElement(By.name("password")).sendKeys("123");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("123");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(2000);
		
		oBrowser.findElement(By.xpath("//span[text()='Lakkundi, vinayak P.']")).click();
		oBrowser.findElement(By.name("password")).sendKeys("456");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("456");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(2000);
			
		oBrowser.findElement(By.xpath("//span[text()='Gowda, Samarth S.']")).click();
		oBrowser.findElement(By.name("password")).sendKeys("789");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("789");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(2000);
			
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginLogoutUserslast()
	{
		try
		{
		oBrowser.findElement(By.id("username")).sendKeys("Nikhil");
		oBrowser.findElement(By.name("pwd")).sendKeys("123");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.id("username")).sendKeys("vini");
		oBrowser.findElement(By.name("pwd")).sendKeys("456");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.id("username")).sendKeys("Sam");
		oBrowser.findElement(By.name("pwd")).sendKeys("789");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void delUsers()
	{
		try
		{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		oBrowser.findElement(By.xpath("//span[text()='Gowda, Nikhil K C.']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		Alert oAlert=oBrowser.switchTo().alert();
		String content=oAlert.getText();
		System.out.println(content);
		oAlert.accept();
		Thread.sleep(2000);
			
		oBrowser.findElement(By.xpath("//span[text()='Lakkundi, vinayak P.']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		oAlert.accept();
		Thread.sleep(2000);
			
			
		oBrowser.findElement(By.xpath("//span[text()='Gowda, Samarth S.']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		oAlert.accept();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
					   
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
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
