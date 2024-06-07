package pac2_maven;

import org.testng.annotations.Test;

public class OrgTest {

		@Test(groups = "smoke")
		public void createOrgTest()
		{
			System.out.println("createOrgTest");
		
		}

		@Test(groups = "regression")
		public void modifyOrgTest()
		{
			System.out.println("modifyOrgTest");
		}
	
}
