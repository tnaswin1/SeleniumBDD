package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import functions.Common;


public class Homelocators extends Common{
	
	/*
	WebDriver driver;
	
	public Homelocators(WebDriver driver)
	{
		this.driver = driver;
	}
	*/
	
	By loginButton = By.linkText("Login");
	By mybasketIcon = By.xpath("//a[@qa='myBasket']");
	By facebookoption = By.xpath("//div/a[@class='facebookBtn smGlobalBtn']");
	By mybasketmessage = By.xpath("//div[@class='empty-basket']/p");
	By facebookbutton = By.xpath("//div/a[@class='facebookBtn smGlobalBtn']");
	By closeloginbutton = By.xpath("//button[@class='close'][1]");
	By homecategorylist = By.xpath("//div[@id='dynamicDirective']/carousel-only-image");
	By itemtypedetails = By.xpath("//h2[@qa='pageName']/span");
	By viewallcategory = By.xpath("//a[@qa='categoryDD']");
	By viewalllink = By.linkText("View All");
	
	public WebElement getLoginbutton()
	{
		return driver.findElement(loginButton);
	}
	
	public WebElement getmybasketIcon()
	{
		return driver.findElement(mybasketIcon);
	}

	public WebElement getfacebookoption()
	{
		return driver.findElement(facebookoption);
	}
	
	public WebElement getmybasketMessage()
	{
		return driver.findElement(mybasketmessage);
	}
	
	public WebElement getfacebookButton()
	{
		return driver.findElement(facebookbutton);
	}
	
	public WebElement getcloseloginButton()
	{
		return driver.findElement(closeloginbutton);
	}
	
	public List<WebElement> gethomecategoryList()
	{
		return driver.findElements(homecategorylist);
	}
	
	public WebElement getitemtypeDetails()
	{
		return driver.findElement(itemtypedetails);
	}
	
	public WebElement getviewallCategory()
	{
		return driver.findElement(viewallcategory);
	}
	
	public WebElement getviewallLink()
	{
		return driver.findElement(viewalllink);
	}
}
