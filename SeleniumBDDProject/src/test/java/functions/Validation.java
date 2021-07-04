package functions;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Validation extends Application{
	
	
	public void validateloginfacebookOption()
	{
		boolean fblinkpresent = homeobj.getfacebookoption().isDisplayed();
		Assert.assertTrue(fblinkpresent);
		homeobj.getcloseloginButton().click();
	}
	
	public void validatemybasketMessage(String mybasketmessage)
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(homeobj.getmybasketMessage()));
		boolean mybasketmsgmatch = homeobj.getmybasketMessage().getText().contains(mybasketmessage);
		Assert.assertTrue(mybasketmsgmatch);	
	}
	
	public void validatehomepageItems(String categoryname)
	{
		boolean categoryfoundflag = false;
		
		List<WebElement> categorylist =homeobj.gethomecategoryList();		
		for(WebElement category : categorylist)
		{
			String str2 = category.getText();
			if(str2.contains(categoryname))
			{
			categoryfoundflag = true;	
			break;	
			}
		}		
		Assert.assertTrue(categoryfoundflag);		
	}
	
	public void validateitemDetail(String itemname)
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(homeobj.getitemtypeDetails()));
		String str1 = homeobj.getitemtypeDetails().getText();
		Assert.assertTrue(itemname.contentEquals(str1));
		driver.navigate().back();
	}

	public void validateviewallcategoryPage(String categorypageheadertext)
	{
		String str1 = categoryobj.getcategorypageHeader().getText();
		categoryobj.getLogoicon().click();	
		Assert.assertTrue(categorypageheadertext.contentEquals(str1));
	}
	
	public void validateitemincategoryPage(String itemnamecheck, String categorynamecheck)
	{
		boolean itemfoundflag = false;
		int categorysize = driver.findElements(By.xpath("//div[@class='dp_headding']/a")).size();
		outer:for(int i = 1;i<categorysize;i++)
		{
			String categoryname = driver.findElement(By.xpath("//div[@class='dp_headding']["+i+"]/a")).getText();
			if(categoryname.contentEquals(categorynamecheck))
			{
				List<WebElement> itemlistcategory = driver.findElements(By.xpath("//div[@class='uiv2-search-category-listing-cover']["+i+"]/div/div/div/ul/li"));
				for (WebElement item : itemlistcategory)
				{
					if(item.getText().contentEquals(itemnamecheck))
					{
						itemfoundflag=true;
						break outer;
					}
				}
			}
		}		
		Assert.assertTrue(itemfoundflag);
		categoryobj.getLogoicon().click();	
	}


}
