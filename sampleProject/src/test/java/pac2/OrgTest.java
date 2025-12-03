package pac2;

import org.testng.annotations.Test;

public class OrgTest{
	@Test
	public void createOrgTest() {
		System.out.println("Executed createOrgTest");
		String BROWSER=System.getProperty("Browser");
		String URL=System.getProperty("Url");
		String USERNAME=System.getProperty("Username");
		String PASSWORD=System.getProperty("Password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	@Test
	public void modifyOrgTest() {
		System.out.println("Executed modifyOrgTest");
		String BROWSER=System.getProperty("Browser");
		String URL=System.getProperty("Url");
		String USERNAME=System.getProperty("Username");
		String PASSWORD=System.getProperty("Password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
}
