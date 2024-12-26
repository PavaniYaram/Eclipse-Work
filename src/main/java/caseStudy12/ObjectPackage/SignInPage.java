package caseStudy12.ObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	
	WebDriver driver;
	public SignInPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="user[email]")
	WebElement email;
	@FindBy(name="user[password]")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	@FindBy(className = "notice__form-error")
	WebElement errorMessage;
	
	public void signIn()
	{
		email.sendKeys("pavani@gmail.com");
		password.sendKeys("password");
		submit.click();
	}
	public String errorMessge()
	{
		return errorMessage.getText();
	}
	
}
