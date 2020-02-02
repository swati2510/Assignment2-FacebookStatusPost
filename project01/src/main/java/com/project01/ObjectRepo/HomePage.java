package com.project01.ObjectRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath="//div[contains(@class,'_1mwp navigationFocus')]")
	
	private WebElement statusboxEdt;
	
	

	@FindBy(xpath="//button[@data-testid='react-composer-post-button']")
	private WebElement postButton;
	
	@FindBy(id="userNavigationLabel")
	private WebElement usernavigationEdt;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logoutButton;


	
	public WebElement getStatusboxEdt() {
		return statusboxEdt;
	}


	public WebElement getPostButton() {
		return postButton;
	}
	
	public WebElement getUsernavigationEdt() {
		return usernavigationEdt;
	}


	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	public void enterMsg(String msg) throws InterruptedException
	{
		statusboxEdt.click();
		Thread.sleep(5000);
		statusboxEdt.sendKeys(msg);
		postButton.click();
		
		
	}
	
	
	public void logout() throws InterruptedException
	{
		usernavigationEdt.click();
		Thread.sleep(2000);
		logoutButton.click();
	}
}
