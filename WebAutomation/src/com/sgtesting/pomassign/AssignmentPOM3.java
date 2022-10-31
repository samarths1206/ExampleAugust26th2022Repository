package com.sgtesting.pomassign;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPOM3 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {

		launchBrowser();
		Navigate();
		Adminlogin1();
		minimize();
		User1();
		User2();
		User3();
		Adminlogout1();
		User1login();
		User1logout();
		User2login();
		User2logout();
		User3login();
		User3logout();
		User1login2();
		User1ModifyPassword();
		User1logout2();
		User2login2();
		User2ModifyPassword();
		User2logout2();
		User3login2();
		User3ModifyPassword();
		User3logout2();
		User1newpasslogin3();
		User1logout3();
		User2newpasslogin3();
		User2logout3();
		User3newpasslogin3();
		User3logout3();
		Adminlogin2();
		ModifyUser123password();
		Adminlogout2();
		User1newpasslogin4();
		User1logout4();
		User2newpasslogin4();
		User2logout4();
		User3newpasslogin4();
		User3logout4();
		Adminlogin3();
		AdminDeleteUser123();
		Adminlogout3();


		close();
	}
	private static void launchBrowser()

	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Adminlogin1()
	{
		try
		{

			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
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
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Nikhil1");
			oBrowser.findElement(By.name("middleName")).sendKeys("KC1");
			oBrowser.findElement(By.name("lastName")).sendKeys("Gowda1");
			oBrowser.findElement(By.name("email")).sendKeys("nikhigowdakc19991@gamil.com");
			oBrowser.findElement(By.name("username")).sendKeys("Nikki1");
			oBrowser.findElement(By.name("password")).sendKeys("Nikhil@951");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Nikhil@951");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Nikhil2");
			oBrowser.findElement(By.name("middleName")).sendKeys("KC2");
			oBrowser.findElement(By.name("lastName")).sendKeys("Gowda2");
			oBrowser.findElement(By.name("email")).sendKeys("nikhigowdakc19992@gamil.com");
			oBrowser.findElement(By.name("username")).sendKeys("Nikki2");
			oBrowser.findElement(By.name("password")).sendKeys("Nikhil@952");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Nikhil@952");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Nikhil3");
			oBrowser.findElement(By.name("middleName")).sendKeys("KC3");
			oBrowser.findElement(By.name("lastName")).sendKeys("Gowda3");
			oBrowser.findElement(By.name("email")).sendKeys("nikhigowdakc19993@gamil.com");
			oBrowser.findElement(By.name("username")).sendKeys("Nikki3");
			oBrowser.findElement(By.name("password")).sendKeys("Nikhil@953");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Nikhil@953");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Adminlogout1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User1login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Nikhil@951");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User1logout()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User2login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Nikhil@952");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User2logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User3login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Nikhil@953");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User3logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User1login2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Nikhil@951");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User1ModifyPassword()
	{
		try
		{
			oBrowser.findElement(By.linkText("USERS")).click();
			oBrowser.findElement(By.xpath("//span[text()='Gowda1, Nikhil1 KC1.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345aa");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345aa");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User1logout2()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User2login2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Nikhil@952");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User2ModifyPassword()
	{
		try
		{
			oBrowser.findElement(By.linkText("USERS")).click();
			oBrowser.findElement(By.xpath("//span[text()='Gowda2, Nikhil2 KC2.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345bb");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345bb");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User2logout2()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User3login2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Nikhil@953");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User3ModifyPassword()
	{
		try
		{
			oBrowser.findElement(By.linkText("USERS")).click();
			oBrowser.findElement(By.xpath("//span[text()='Gowda3, Nikhil3 KC3.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345cc");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345cc");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User3logout2()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User1newpasslogin3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki1");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345aa");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User1logout3()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User2newpasslogin3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki2");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345bb");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User2logout3()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User3newpasslogin3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki3");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345cc");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User3logout3()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Adminlogin2()
	{
		try
		{

			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void ModifyUser123password()
	{
		try
		{
			oBrowser.findElement(By.linkText("USERS")).click();
			oBrowser.findElement(By.xpath("//span[text()='Gowda1, Nikhil1 KC1.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345aaa");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345aaa");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Gowda2, Nikhil2 KC2.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345bbb");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345bbb");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Gowda3, Nikhil3 KC3.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345ccc");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345ccc");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Adminlogout2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void User1newpasslogin4()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki1");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345aaa");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User1logout4()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User2newpasslogin4()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki2");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345bbb");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User2logout4()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User3newpasslogin4()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki3");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345ccc");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void User3logout4()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Adminlogin3()
	{
		try
		{

			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void AdminDeleteUser123()
	{
		try
		{
			oBrowser.findElement(By.linkText("USERS")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Gowda1, Nikhil1 KC1.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert1=oBrowser.switchTo().alert();
			oAlert1.accept();
			oBrowser.findElement(By.linkText("USERS")).click();
			oBrowser.findElement(By.xpath("//span[text()='Gowda2, Nikhil2 KC2.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert2=oBrowser.switchTo().alert();
			oAlert2.accept();
			oBrowser.findElement(By.linkText("USERS")).click();
			oBrowser.findElement(By.xpath("//span[text()='Gowda3, Nikhil3 KC3.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert3=oBrowser.switchTo().alert();
			oAlert3.accept();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Adminlogout3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void close()
	{
		try
		{
			oBrowser.close();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
