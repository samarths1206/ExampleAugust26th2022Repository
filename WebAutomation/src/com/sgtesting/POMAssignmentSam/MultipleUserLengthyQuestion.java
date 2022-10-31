package com.sgtesting.POMAssignmentSam;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleUserLengthyQuestion {
	public static WebDriver oBrowser=null;
	public static Actipage oPage=null;
		
	private static void launchBrowser()
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
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage.getUser().sendKeys("admin");
			oPage.getPassUser().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(3000);
			oPage.getMinimized().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void users()
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
			Thread.sleep(3000);
			
						
			oPage.getAddu().click();
			Thread.sleep(1000);
			oPage.getFirst().sendKeys("Vinayak");
			oPage.getMidd().sendKeys("P");
			oPage.getLast().sendKeys("Lakkundi");
			oPage.getmail().sendKeys("demo1@gmail.com");
			oPage.getuserLoginName().sendKeys("Vini");
			oPage.getpa().sendKeys("456");
			oPage.getpc().sendKeys("456");
			oPage.getCreate().click();
			Thread.sleep(3000);
			
			oPage.getAddu().click();
			Thread.sleep(1000);
			oPage.getFirst().sendKeys("Samarth");
			oPage.getMidd().sendKeys("S");
			oPage.getLast().sendKeys("Gowda");
			oPage.getmail().sendKeys("demo2@gmail.com");
			oPage.getuserLoginName().sendKeys("Sam");
			oPage.getpa().sendKeys("789");
			oPage.getpc().sendKeys("789");
			oPage.getCreate().click();
			Thread.sleep(3000);
			
			oPage.getlogout().click();
			Thread.sleep(2000);
			
			oPage.getUser().sendKeys("Niki");
			oPage.getPassUser().sendKeys("123");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getVideo().click();
			Thread.sleep(2000);
			oPage.getlogout().click();
			Thread.sleep(2000);
			
			oPage.getUser().sendKeys("Vini");
			oPage.getPassUser().sendKeys("456");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getVideo().click();
			Thread.sleep(2000);
			oPage.getlogout().click();
			Thread.sleep(2000);
			
			oPage.getUser().sendKeys("Sam");
			oPage.getPassUser().sendKeys("789");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getVideo().click();
			Thread.sleep(2000);
			oPage.getlogout().click();
			Thread.sleep(5000);
					
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUsersPass()
	{
		try
		{
			oPage.getUser().sendKeys("Niki");
			oPage.getPassUser().sendKeys("123");
			Thread.sleep(3000);
			oPage.getLogin().click();
			oPage.getUser1().click();
             Thread.sleep(2000);
			oPage.getUserMod1().click();
			Thread.sleep(2000);
			oPage.getpa().sendKeys("1234");
			Thread.sleep(2000);
			oPage.getpc().sendKeys("1234");
			Thread.sleep(1000);
			oPage.getSaveChanges().click();
			Thread.sleep(1000);
			oPage.getlogout().click();
			Thread.sleep(2000);
			
			oPage.getUser().sendKeys("Vini");
			oPage.getPassUser().sendKeys("456");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getUser1().click();
			Thread.sleep(1000);
			
			oPage.getUserMod2().click();
			Thread.sleep(2000);
			oPage.getpa().sendKeys("4567");
			Thread.sleep(2000);
			oPage.getpc().sendKeys("4567");
			Thread.sleep(1000);
			oPage.getSaveChanges().click();
			Thread.sleep(1000);
			oPage.getlogout().click();
			Thread.sleep(2000);
			
			oPage.getUser().sendKeys("Sam");
			oPage.getPassUser().sendKeys("789");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getUser1().click();
			Thread.sleep(1000);
			oPage.getUserMod3().click();
			Thread.sleep(2000);
			oPage.getpa().sendKeys("6789");
			Thread.sleep(2000);
			oPage.getpc().sendKeys("6789");
			Thread.sleep(1000);
			oPage.getSaveChanges().click();
			Thread.sleep(1000);
			oPage.getlogout().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginWithModifiedPass()
	{
		try
		{
			oPage.getUser().sendKeys("Niki");
			oPage.getPassUser().sendKeys("1234");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getlogout().click();
			Thread.sleep(2000);
			
			oPage.getUser().sendKeys("Vini");
			oPage.getPassUser().sendKeys("4567");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getlogout().click();
			Thread.sleep(2000);
			
			oPage.getUser().sendKeys("Sam");
			oPage.getPassUser().sendKeys("6789");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getlogout().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void loginAsAdmin()
	{
		try
		{
			oPage.getUser().sendKeys("admin");
			oPage.getPassUser().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			
			oPage.getUser1().click();
			oPage.getUserMod1().click();
			Thread.sleep(1000);
			oPage.getpa().sendKeys("123");
			Thread.sleep(2000);
			oPage.getpc().sendKeys("123");
			Thread.sleep(1000);
			oPage.getSaveChanges().click();
			Thread.sleep(1000);
			
			oPage.getUserMod2().click();
			Thread.sleep(1000);
			oPage.getpa().sendKeys("456");
			Thread.sleep(2000);
			oPage.getpc().sendKeys("456");
			Thread.sleep(1000);
			oPage.getSaveChanges().click();
			Thread.sleep(1000);
			
			oPage.getUserMod3().click();
			Thread.sleep(1000);
			oPage.getpa().sendKeys("789");
			Thread.sleep(2000);
			oPage.getpc().sendKeys("789");
			Thread.sleep(1000);
			oPage.getSaveChanges().click();
			Thread.sleep(1000);
			
			oPage.getlogout().click();
			Thread.sleep(2000);
			
			oPage.getUser().sendKeys("Niki");
			oPage.getPassUser().sendKeys("123");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getlogout().click();
			Thread.sleep(2000);
			
			oPage.getUser().sendKeys("Vini");
			oPage.getPassUser().sendKeys("456");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getlogout().click();
			Thread.sleep(2000);
			
			oPage.getUser().sendKeys("Sam");
			oPage.getPassUser().sendKeys("789");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getlogout().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUsers()
	{
		try
		{
			oPage.getUser().sendKeys("admin");
			oPage.getPassUser().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getUser1().click();
			Thread.sleep(1000);
			
			oPage.getUserMod1().click();
			Thread.sleep(2000);
			oPage.getDeleted().click();
			Thread.sleep(3000);
			Alert a=oBrowser.switchTo().alert();
			a.accept();
			Thread.sleep(1000);
			
			oPage.getUserMod2().click();
			Thread.sleep(2000);
			oPage.getDeleted().click();
			Thread.sleep(3000);
			a.accept();
			Thread.sleep(1000);
			
			oPage.getUserMod3().click();
			Thread.sleep(2000);
			oPage.getDeleted().click();
			Thread.sleep(3000);
		    a.accept();
			Thread.sleep(1000);
			oPage.getlogout().click();
			Thread.sleep(2000);
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeBrowser()
	{
		oBrowser.close();
	}


	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		users();
		modifyUsersPass();
		loginWithModifiedPass();
		loginAsAdmin();
		deleteUsers();
		closeBrowser();
	
	}

}
