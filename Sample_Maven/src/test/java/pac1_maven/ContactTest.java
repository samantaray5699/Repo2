package pac1_maven;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContactTest()
	{
		System.out.println("createContactTest");
		
		String bowser = System.getProperty("browser");
		System.out.println(bowser);
	
	}

	@Test
	public void modifyContactTest()
	{
		System.out.println("modifyContactTest");
	}
}
