package com.project01.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebDriverUtils {
	
public void waitForPageToLoad()
{
BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

public void waitForElementPresent(WebElement element)
{
 WebDriverWait wait=new WebDriverWait(BaseClass.driver, 20);
 wait.until(ExpectedConditions.visibilityOf(element));
}




}



