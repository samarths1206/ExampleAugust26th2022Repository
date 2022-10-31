package com.sgtesting.WebTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyuseraandAllAssignments {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		clickClose();
		createUser();
		modifyUser();
		deleteUser();
		custo();
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
			oBrowser.manage().window().maximize();
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
			oBrowser.findElement(By.xpath("//span[text()='Gowda, Samarth K C.']")).click();
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
	private static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Gowda, Nikhil K C.']")).click();
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("firstName")).sendKeys("Samarth");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void custo()
	{
		try
		{// create customer
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")).click();
		oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		Thread.sleep(2000);
		//Alert o=oBrowser.switchTo().alert();
		//o.sendKeys("virat");
		oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("virat");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
		Thread.sleep(2000);
		
		//create project
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")).click();
		oBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Batsman");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div")).click();
		Thread.sleep(2000);
			
		//modify project
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("virat is a great batsman");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
		Thread.sleep(2000);
		
		//create task
		oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
		oBrowser.findElement(By.xpath("//div[text()='Create new tasks']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys("Score 100");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Create Tasks']")).click();
		Thread.sleep(2000);
		 
		//delete task
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[3]/div/div/div[4]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("deleteTaskPopup_deleteConfirm_submitTitle")).click();
		Thread.sleep(2000);
		 
		//delete Project			
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitBtn']/div")).click();
		Thread.sleep(2000);
		   
		//Modify customer
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("my name is virat");
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(2000);
			
		//Delete Customer
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
		oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
