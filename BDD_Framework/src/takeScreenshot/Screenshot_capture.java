package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot_capture {
	
	public static void ss(WebDriver driver,String ssname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File fl=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl,new File("./Screenshots/"+ssname+".png"));
		System.out.println("Screenshot taken for step"+ssname);
	}
}
