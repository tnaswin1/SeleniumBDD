package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import functions.Common;

public class Categorylocators extends Common{
	
	By categorypageheader = By.xpath("//div[@class='uiv2-tabbed-content ']/h3");
	By logoicon = By.xpath("//div[contains(@class,'bb-logo')]");
	
	public WebElement getcategorypageHeader()
	{
		return driver.findElement(categorypageheader);
	}
	
	public WebElement getLogoicon()
	{
		return driver.findElement(logoicon);
	}

}
