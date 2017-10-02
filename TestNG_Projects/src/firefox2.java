import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class firefox2 {

WebDriver driver;

@Test
public void testfirefox() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "/Users/rajeshkumar/Desktop/eclipse/geckodriver");
	driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(5000);
	//driver.close();
}
@Test
public void testfirefox2() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("Rajesh");
	String title=driver.getTitle();
	System.out.println("The title of the webpage is : "+title);
	Thread.sleep(3000);
	driver.quit();
}
}
