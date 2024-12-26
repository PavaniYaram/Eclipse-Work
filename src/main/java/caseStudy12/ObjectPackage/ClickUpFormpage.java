package caseStudy12.ObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import caseStudy12.BasePackage.BaseClass;

public class ClickUpFormpage {

	public WebDriver driver;
	public ClickUpFormpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="control-0")
	WebElement name;
	@FindBy(id="control-1")
	WebElement email;
	@FindBy(id="control-2")
	WebElement job_title;
	@FindBy(id="control-3")
	WebElement company_name;
	@FindBy(id="control-4")
	WebElement message;

	@FindBy(xpath="//button[@data-test='form__submit-btn']")
	WebElement submit;
	public void formfillup()
	{
		name.sendKeys("pavani");
		email.sendKeys("pavani@gmail.com");
		job_title.sendKeys("programmer Analyst Trainee");
		company_name.sendKeys("CTS");
		message.sendKeys("I am from QEA Domain");
		submit.click();
	}
}
