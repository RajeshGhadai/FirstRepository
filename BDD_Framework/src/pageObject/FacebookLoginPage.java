package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	
WebDriver driver;

public FacebookLoginPage(WebDriver driver)
{
	this.driver=driver;
}

@FindBy(xpath=".//*[@id='email']")
WebElement username;

@FindBy(xpath=".//*[@id='pass']")
WebElement password;

@FindBy(xpath=".//*[@id='loginbutton']")
WebElement LoginButton;



public void enterusername(String uname)
{
	username.sendKeys(uname);
}

public void enterpassword(String pass)
{
	password.sendKeys(pass);
}
public void clickLogin()
{
	LoginButton.click();
}

}
