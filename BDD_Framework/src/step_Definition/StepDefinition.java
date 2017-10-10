package step_Definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;

public class StepDefinition {

	@Given("^I am a valid user$")
	public void I_am_a_valid_user() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "/Users/rajeshkumar/Desktop/Rajesh/Selenium Jars and Drivers/Drivers/geckodriver");
	    WebDriver driver;
	    driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com");
	    takeScreenshot.Screenshot_capture.ss(driver);
	}

	@When("^I enter my \"([^\"]*)\"$")
	public void I_enter_my(String uname) throws Throwable {
	    
	}

	@Then("^The home page should display$")
	public void The_home_page_should_display() throws Throwable {
	  
	}


}
