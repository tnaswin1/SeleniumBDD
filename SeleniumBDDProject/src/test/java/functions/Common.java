package functions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
	
	public static WebDriver driver = null;
	
	public void launchApplication()
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String url = geturl();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public String geturl()
	{
		Properties prop = new Properties();
		FileInputStream file = null;
		try {
			file = new FileInputStream("url.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(file);
			System.out.println(prop.getProperty("url"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop.getProperty("url");
	}
	
	public void threadwait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void quitDriver()
	{
		driver.quit();
	}

}
