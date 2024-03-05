package stepDefinitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetUp;

public class LandingPageGreenStepDefinition {
public WebDriver driver; 
public String landingPageproductName;
public String offerPageProductName;
TestContextSetUp testContextSetup;

public  LandingPageGreenStepDefinition(TestContextSetUp testContextSetup)
{
	this.testContextSetup=testContextSetup;
}

	@Given("User is on the GreenCart landing page")
	public void user_is_on_the_green_cart_landing_page() {
	    
		//System.setProperty("webriver.chrome.driver", "/Users/jeetc/OneDrive/Documents/chromedriver");
		//testContextSetup.driver = new ChromeDriver();
		//testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	}
	
	
	@When("User searches with shortname called {string} in the searchbox of the home page")
	public void user_searches_with_shortname_called_in_the_searchbox_of_the_home_page(String shortName) throws InterruptedException {

		LandingPage landingPage = new LandingPage(testContextSetup.driver);
		landingPage.searchItem(shortName);
		Thread.sleep(2000);
		testContextSetup.landingPageproductName = landingPage.getProductName().split("-")[0].trim();
		
		System.out.println(landingPageproductName +" is extracted from the Home page");
		
		
	}
	
	
}
