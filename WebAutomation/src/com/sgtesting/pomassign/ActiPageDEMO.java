package com.sgtesting.pomassign;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPageDEMO {

	public ActiPageDEMO(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//Create WebElement for UserName field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Create WebElement for Password Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//Create WebElement for Login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}

	//Create WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Create WebElement for ClickUser
	@FindBy(linkText="USERS")
	private WebElement ClickUser;
	public WebElement UserClick()
	{
		return ClickUser;
	}

	//create WebElement for AddUser
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement AddUser;
	public WebElement UserAdd()
	{
		return AddUser;
	} 

	//create webelement for Firstname
	private WebElement firstName;
	public WebElement FName()
	{
		return firstName;
	}

	//create webelement for middlename
	private WebElement middleName;
	public WebElement MName()
	{
		return middleName;
	}

	//create webelement for lastName
	private WebElement lastName;
	public WebElement LName()
	{
		return lastName;
	}

	//create webelement for email
	private WebElement email;
	public WebElement mail()
	{
		return email;
	}

	//create webelement for username
	private WebElement userDataLightBox_usernameField;
	public WebElement Username()
	{
		return userDataLightBox_usernameField;
	}

	//create webelement for password
	private WebElement userDataLightBox_passwordField;
	public WebElement Password()
	{
		return userDataLightBox_passwordField;
	}

	//create webelement for re-password
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement Repassword()
	{
		return userDataLightBox_passwordCopyField;
	}

	//create webelement for CreateUserButton
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement CUserButton;
	public WebElement CreateUserButton()
	{
		return CUserButton;
	}

	//create webelement for UserSelection
	@FindBy(xpath="//span[text()='Gowda, Nikhil KC.']")
	private WebElement UserSelection;
	public WebElement SelectUser()
	{
		return UserSelection;
	}
	
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement UserModify;
	public WebElement ModifyUser()
	{
		return UserModify;
	}
	
	@FindBy(xpath="//span[text()='gowda, Samarth S.']")
	private WebElement selectUserModify;
	public WebElement selectModifyUser()
	{
		return selectUserModify;
	}

	//create webelement for DeleteUser
	private WebElement userDataLightBox_deleteBtn;
	public WebElement DeleteUser()
	{
		return userDataLightBox_deleteBtn;
	}
	

	//Create WebElement for Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	
	
	

}
