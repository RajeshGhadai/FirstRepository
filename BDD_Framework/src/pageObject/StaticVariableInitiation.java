package pageObject;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Test;

public class StaticVariableInitiation {
	
	public static Properties pro;

	@Test
	public static String LoadFirefox() throws Exception
	{
		File source=new File("./UtilityFolder/staticvalues.property");
		
		FileInputStream fis=new FileInputStream(source);
		
		pro=new Properties();
		
		pro.load(fis);
		
		String firefoxpath=pro.getProperty("FirefoxDriverPath");
		
		return firefoxpath;
	}
	
	public static String LoadURL()
	{
		String websiteurl=pro.getProperty("URL");
		return websiteurl;
	}
}
