package pac1_maven;

import org.testng.annotations.Test;

public class ContactTest {

	@Test(groups = "smoke")
	public void createContactTest()
	{
		System.out.println("createContactTest");
		
		String bowser = System.getProperty("browser");
		String url = System.getProperty("url");
		
		System.out.println(bowser);
		System.out.println(url);
	
	}

	@Test(groups = "regression")
	public void modifyContactTest()
	{
		System.out.println("modifyContactTest");
		String bowser = System.getProperty("browser");
		String url = System.getProperty("url");
		
		System.out.println(bowser);
		System.out.println(url);
	}
}
