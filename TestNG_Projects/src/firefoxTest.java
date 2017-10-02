import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testNG_Listener.class)
public class firefoxTest {
	
	WebDriver driver;
	@Test
	public void OpenFacebook() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "/Users/rajeshkumar/Desktop/eclipse/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void OpenfbChrome() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshkumar/Desktop/eclipse/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.facebok.com");
		Thread.sleep(3000);
		driver.quit();
		Assert.assertTrue(false);
	}
}
