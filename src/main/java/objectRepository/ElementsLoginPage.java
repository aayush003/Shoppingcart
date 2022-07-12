package objectRepository;

import org.openqa.selenium.By;

public class ElementsLoginPage {

	public static By loginSignUpXpath = By.xpath("(//ul[contains(@class, 'nav navbar')]//li/a[contains(text(), 'Signup')])");
	public static By loginEmailAddress = By.xpath("//div[@class ='login-form']/form//input[@type ='email']");
	public static By loginPassword = By.xpath("//div[@class ='login-form']/form//input[@type ='password']");
	public static By loginSubmit = By.xpath("//div[@class ='login-form']/form//button[@type ='submit']");
}
