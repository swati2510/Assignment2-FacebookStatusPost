package com.project01.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn {
	@FindBy(id="email")
	private WebElement usernameEdt;
	
	@FindBy(id="pass")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginButton;

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginToApp(String userName,String password)
	{
		usernameEdt.sendKeys(userName);
		passwordEdt.sendKeys(password);
		loginButton.click();
		
	}

}
