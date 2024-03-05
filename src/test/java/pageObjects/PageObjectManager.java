package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	
	public LandingPage landingPage;
	public WebDriver driver;
	public PageObjectManager(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	public LandingPage getLandingPage()
	{
		LandingPage landingPage= new LandingPage(driver);
		return landingPage;		
	}
	
	
	public pageObjects.OfferPage OfferPage()
	{
		OfferPage offerPage = new OfferPage(driver);
		return offerPage;
	}
	
}
