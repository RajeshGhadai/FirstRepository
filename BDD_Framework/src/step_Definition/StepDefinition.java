package step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pageObject.FacebookLoginPage;
import pageObject.StaticVariableInitiation;
import cucumber.api.java.en.*;

public class StepDefinition {

	WebDriver driver;
	@Given("^I am a valid user$")
	public void I_am_a_valid_user() throws Throwable {
		System.setProperty("webdriver.gecko.driver", StaticVariableInitiation.LoadFirefox());
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get(StaticVariableInitiation.LoadURL());
	    takeScreenshot.Screenshot_capture.ss(driver,"loginpage");
	}

	@When("^I enter my \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_my(String uname,String pass) throws Throwable {
	   FacebookLoginPage obj=PageFactory.initElements(driver, FacebookLoginPage.class);
	   obj.enterusername(uname);
	   obj.enterpassword(pass);
	   //takeScreenshot.Screenshot_capture.ss(driver,"Entered"+uname);
	}

	@Then("^The home page should display$")
	public void The_home_page_should_display() throws Throwable {
	    driver.quit();
	}


}
