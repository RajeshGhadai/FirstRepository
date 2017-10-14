package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

@FindBy(xpath="//select[@id='day']")
WebElement selectday;


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

public void select_day(String date)
{
	Select day=new Select(selectday);
	day.selectByValue(date);
}

}
