package com.sgtesting.POMAssignmentSam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actipage {
	public Actipage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	private WebElement username;
	public WebElement getUser()
	{
		return username;
	}
	
	private WebElement pwd;
	public WebElement getPassUser()
	{
		return pwd;
	}
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	public WebElement getLogin()
	{
		return login;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getMinimized()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(linkText = "USERS")
	private WebElement user1;
	public WebElement getUser1()
	{
		return user1;
	}
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addu;
	public WebElement getAddu()
	{
		return addu;
	}
	
	private WebElement firstName;
	public WebElement getFirst()
	{
		return firstName;
	}
	private WebElement middleName;
	public WebElement getMidd()
	{
		return middleName;
	}
	private WebElement lastName;
	public WebElement getLast()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement getmail()
	{
		return email;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getuserLoginName()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement password;
	public WebElement getpa()
	{
		return password;
	}
	private WebElement passwordCopy;
	public WebElement getpc()
	{
		return passwordCopy;
	}
	
	private WebElement userDataLightBox_commitBtn;
	public WebElement getCreate()
	{
		return userDataLightBox_commitBtn;
	}
	
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")
	private WebElement delUser;
	public WebElement getDelUser()
	{
		return delUser;
	}
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/table") 
	private WebElement del;
	public WebElement getDel()
	{
		return del;
	}
	@FindBy(xpath="//span[text()='Gowda, Nikhil KC.']")
	private WebElement mod1;
	public WebElement getUserMod1()
	{
		return mod1;
	}
	@FindBy(xpath="//span[text()='Lakkundi, Vinayak P.']")
	private WebElement mod2;
	public WebElement getUserMod2()
	{
		return mod2;
	}
	@FindBy(xpath="//span[text()='Gowda, Samarth S.']")
	private WebElement mod3;
	public WebElement getUserMod3()
	{
		return mod3;
	}
	
	
	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']")
	private WebElement change;
	public WebElement getSaveChanges()
	{
		return change;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getDeleted()
	{
		return userDataLightBox_deleteBtn;
	}
	@FindBy(linkText ="Logout")
	private WebElement log;
	public WebElement getlogout()
	{
		return log;
	}
	@FindBy(xpath="//*[@id='welcomeScreenBoxId']/div[3]/div")
	private WebElement video;
	public WebElement getVideo()
	{
		return video;
	}
}
