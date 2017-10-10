package step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;

public class StepDefinition {

	WebDriver driver;
	@Given("^I am a valid user$")
	public void I_am_a_valid_user() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "/Users/rajeshkumar/Desktop/Rajesh/Selenium_Jars_and_Drivers/Drivers/geckodriver");
	    driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com");
	    takeScreenshot.Screenshot_capture.ss(driver,"loginpage");
	}

	@When("^I enter my \"([^\"]*)\"$")
	public void I_enter_my(String uname) throws Throwable {
	    driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(uname);
	    takeScreenshot.Screenshot_capture.ss(driver,"Entered"+uname);
	}

	@Then("^The home page should display$")
	public void The_home_page_should_display() throws Throwable {
	  System.out.println("Hola");
	  driver.quit();
	}


}
