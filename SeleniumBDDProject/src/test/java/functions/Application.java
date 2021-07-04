package functions;

import org.openqa.selenium.By;

import pageobject.Categorylocators;
import pageobject.Homelocators;

public class Application extends Common {
	
	Homelocators homeobj = new Homelocators();
	Categorylocators categoryobj = new Categorylocators();
	
	public void homePage()
	{
		if (driver == null)
		{
		launchApplication();
		threadwait();
		}
	}
	
	public void loginOption()
	{
		homeobj.getLoginbutton().click();
	}
	
	public void myBasket()
	{
		homeobj.getmybasketIcon().click();
	}
	
	public void productoptionsStaples(String categoryname)
	{
		
		int size= homeobj.gethomecategoryList().size();
		for(int i=1;i<=size;i++)
		{		
			String str2 = driver.findElement(By.xpath("//div[@id='dynamicDirective']/carousel-only-image[" + i + "]/section/div/h2")).getText();
			if(str2.contains(categoryname))
			{
				//Item in home page under category is image. Thus hardcoded element XPATH for item(Rice & Rice Products)
				driver.findElement(By.xpath("//div[@id='dynamicDirective']/carousel-only-image["+i+"]/section/section/div[2]")).click();
				break;	
			}
		}
		
	}
	
	public void viewallCategory()
	{
		homeobj.getviewallCategory().click();
		homeobj.getviewallLink().click();
	}
	

}
