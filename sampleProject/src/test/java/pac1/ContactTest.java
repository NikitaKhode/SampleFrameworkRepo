package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		System.out.println("Execute createContactTest");
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
	public void modifyContactTest() {
		System.out.println("Execute modifyContactTest");
		System.out.println("Executed createContact");
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
	public void deleteContactTest() {
		System.out.println("Execute deleteContactTest");
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
