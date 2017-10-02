import org.testng.annotations.Test;


public class testNGProg {
	
	@Test(description="This is the first test")
	public void OpenBrowser()
	{
		System.out.println("The test passes");
	}
	
	@Test(description="This is the second test")
	public void CloseBrowser()
	{
		System.out.println("The test fails");
	}
}
