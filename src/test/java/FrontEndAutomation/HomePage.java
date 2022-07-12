package FrontEndAutomation;

import java.io.IOException;
import org.testng.annotations.Test;

import resources.Base;

public class HomePage extends Base{
	
	@Test
	public void basePageNavigation() throws IOException
	{
		initializeDriver("https://automationexercise.com");
	}
	
	@Test
	public void userLogin() throws IOException
	{
		//driver = initializeDriver();
		//driver.get("https://automationexercise.com");
		LoginPage.login("abcd", "abcd");
	}

}
