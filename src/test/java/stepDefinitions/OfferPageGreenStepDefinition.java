package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetUp;

public class OfferPageGreenStepDefinition {
public String offerPageProductName;
TestContextSetUp testContextSetup;
PageObjectManager pageObjectManager;

public  OfferPageGreenStepDefinition(TestContextSetUp testContextSetup)
{
	this.testContextSetup=testContextSetup;
}

	@Then("User searches with the shortname called {string} in the deals page to check if the product exist")
	public void user_searches_with_the_shortname_called_in_the_deals_page_to_check_if_the_product_exist(String shortName) throws InterruptedException {


		switchToDealPage();
		OfferPage offerPage = new OfferPage(testContextSetup.driver);
		offerPage.searchItem(shortName);
		
		//testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		Thread.sleep(2000);
		offerPageProductName =offerPage.getProductName();
		
		System.out.println(offerPageProductName +" is extracted from the Deal page");
		
		Assert.assertEquals(offerPageProductName, testContextSetup.landingPageproductName);
		
		
	}

	public void switchToDealPage()
	{
		pageObjectManager= new PageObjectManager(testContextSetup.driver);
		LandingPage landingPage = new LandingPage(testContextSetup.driver);
		landingPage.selectTopDeals();
		
		testContextSetup.genericUtils.SwitchWindowToChild();
		
	}
		
}
