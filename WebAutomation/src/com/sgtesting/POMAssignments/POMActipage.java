package com.sgtesting.POMAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActipage {

	public POMActipage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//Create WebElements for UserNmae Field
	private WebElement username;
	public WebElement insertuser()
	{
		return username;
	}
	//Create WebElements for Password Field
	private WebElement pwd;
	public WebElement insertpassword()
	{
		return pwd;
	}
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement aLogin;
	public WebElement clickLogin()
	{
		return aLogin;
	}
	
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement clickminimize()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(linkText = "Logout")
	private WebElement logoutLink;
	public WebElement logout()
	{
		return logoutLink;
	}
	@FindBy(linkText = "USERS")
	private WebElement auser;
	public WebElement clickuser()
	{
		return auser;
	}
	@FindBy(xpath = "//div[text()='Add User']")
	private WebElement user;
	public WebElement adduser()
	{
		return user;
	}
	private WebElement firstName;
	public WebElement addfirstname()
	{
		return firstName;
	}
	private WebElement middleName;
	public WebElement addMiddlename()
	{
		return middleName;
	}
	private WebElement  lastName;
	public WebElement addLastname()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement addEmail()
	{
		return email;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement addUsername()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement addPassword()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement addPasswordcopy()
	{
		return userDataLightBox_passwordCopyField;
	}
	@FindBy(xpath = "//span[text()='Create User']")
	private WebElement createuser;
	public WebElement ClickCreateuser()
	{
		return createuser;
	}
	@FindBy(xpath = "//span[text()='xyz, Samarth S.']")
	private WebElement clickUser;
	public WebElement clickonUser()
	{
		return clickUser;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement DeleteUser()
	{
		return userDataLightBox_deleteBtn;
	}
	@FindBy(xpath = "//span[text()='Save Changes']")
	private WebElement clickSavchanges;
	public WebElement Saveuserchanges()
	{
		return clickSavchanges;
	}
	@FindBy(xpath = "//span[text()='Gowda, niki n.']")
	private WebElement clickmodifiedUser;
	public WebElement clickModifiedUser()
	{
		return clickmodifiedUser;
	}
	
	
}