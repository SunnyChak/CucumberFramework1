package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver WebDriveManager()
	{
		if(driver==null)
		{
		System.setProperty("webriver.chrome.driver", "/Users/jeetc/OneDrive/Documents/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}
		return driver;
	}
	
	
}
