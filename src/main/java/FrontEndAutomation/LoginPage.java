package FrontEndAutomation;

import objectRepository.ElementsLoginPage;
import resources.Base;

public class LoginPage {

	public static void login(String email, String password)
	{
		Base.getDriver().findElement(ElementsLoginPage.loginSignUpXpath).click();
		Base.getDriver().findElement(ElementsLoginPage.loginEmailAddress).sendKeys(email);
		Base.getDriver().findElement(ElementsLoginPage.loginPassword).sendKeys(password);
		Base.getDriver().findElement(ElementsLoginPage.loginSubmit).click();
	}
}
