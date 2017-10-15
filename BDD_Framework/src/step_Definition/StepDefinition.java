package step_Definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	    //takeScreenshot.Screenshot_capture.ss(driver,"loginpage");
	}

	@When("^I enter my \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_my(String uname,String pass) throws Throwable {
	   FacebookLoginPage obj=PageFactory.initElements(driver, FacebookLoginPage.class);
	   obj.enterusername(uname);
	   obj.enterpassword(pass);
	   obj.select_day("20");
	   //takeScreenshot.Screenshot_capture.ss(driver,"Entered"+uname);
	}

	@Then("^The home page should display$")
	public void The_home_page_should_display() throws Throwable {
		Thread.sleep(3000);
	    driver.quit();
	}
	
	@Given("^I am a valid chrome user$")
	public void I_am_a_valid_chrome_user() throws Throwable {
		System.setProperty("webdriver.chrome.driver", StaticVariableInitiation.LoadChrome());
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to(StaticVariableInitiation.LoadURL());
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_and(String cuname, String cpass) throws Throwable {
		FacebookLoginPage chrobj=PageFactory.initElements(driver, FacebookLoginPage.class);
		chrobj.enterusername(cuname);
		chrobj.enterpassword(cpass);
	}

	@Then("^I should get the home page$")
	public void I_should_get_the_home_page() throws Throwable {
	   driver.quit();
	}
	@Given("^I am a valid MMT user$")
	public void I_am_a_valid_MMT_user() throws Throwable {
	 System.out.println("I am a valid user");   
	}

	@When("^I enter my MMT username and password$")
	public void I_enter_my_MMT_username_and_password() throws Throwable {
	   System.out.println("I entered username and password");
	}

	@Then("^The MMT home page should display$")
	public void The_MMT_home_page_should_display() throws Throwable {
		System.out.println("The home page is displayed");
	}


	@Given("^I am a valid goibibo user$")
	public void I_am_a_valid_goibibo_user() throws Throwable {
		System.out.println("I am a valid user");
	}

	@When("^I enter my GoIBibo username and password$")
	public void I_enter_my_GoIBibo_username_and_password() throws Throwable {
		System.out.println("I logged in");
	}

	@Then("^The goibibo home page should display$")
	public void The_goibibo_home_page_should_display() throws Throwable {
		System.out.println("The test passed");
		//*[@id="hp-widget__depart"]
	}
}
