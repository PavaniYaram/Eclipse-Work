package caseStudy12.ObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeCoursePage {
	
	WebDriver driver;
	public FreeCoursePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText ="Sign In")
	WebElement signIn;
	public SignInPage signIn()
	{
		signIn.click();
		  SignInPage signInpage = new SignInPage(driver);
		  return signInpage;
	}


}
