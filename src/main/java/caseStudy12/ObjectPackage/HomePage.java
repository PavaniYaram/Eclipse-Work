package caseStudy12.ObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
	WebDriver driver ;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Professional Services")
	WebElement professionalServices;
	@FindBy(linkText="Learning")
	WebElement learning;
	@FindBy(xpath="(//a[contains(@class,'et_pb_button')])[1]")
	WebElement freeConsultation;
	@FindBy(xpath="//*[@id='menu-home-page-menu']/li[3]/ul/li[1]/a")
	WebElement freeCourses;
	
	
	public FreeCoursePage goTo_freecoursepage()
	{
		Actions action = new Actions(driver);
		
		 action.moveToElement(learning).click(freeCourses).build().perform();
		 FreeCoursePage freecoursepage = new FreeCoursePage(driver);
		 return freecoursepage;
	}
	public void goTo_professionalServicePage()
	{
		professionalServices.click();
	}
	public ClickUpFormpage  get_a_free_consultation()
	{
		freeConsultation.click();
		ClickUpFormpage formpage = new ClickUpFormpage(driver);
		return formpage;
		
	}
	public void goTo_homepage()
	{
		driver.get("https://ultimateqa.com/consulting");
	}

}
