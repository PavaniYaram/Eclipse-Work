package caseStudy12.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import caseStudy12.BasePackage.BaseClass;
import caseStudy12.ObjectPackage.ClickUpFormpage;
import caseStudy12.ObjectPackage.FreeCoursePage;
import caseStudy12.ObjectPackage.HomePage;
import caseStudy12.ObjectPackage.SignInPage;

public class ModifiedClass extends BaseClass{
	
	
	public static HomePage homepage;
	
	public ModifiedClass(WebDriver driver) {
		super(driver);
		
	}
	
	@Test
	public void testmethod() throws InterruptedException, IOException
	{
		
		homepage = launchApplication();
		homepage.goTo_professionalServicePage();
		ClickUpFormpage formpage =  homepage.get_a_free_consultation();
		formpage.formfillup();
		driver.navigate().back();
		FreeCoursePage freecoursepage = homepage.goTo_freecoursepage();
		SignInPage signInpage = freecoursepage.signIn();
		signInpage.signIn();	 
		Thread.sleep(20000);		 
		String errorMessage = signInpage.errorMessge();
		System.out.println("Error Message : " + errorMessage);
	  
		
	}

//	
//	public static void main(String[] args) throws IOException, InterruptedException {
//		
//
//		homepage = launchApplication();
//		homepage.goTo_professionalServicePage();
//		ClickUpFormpage formpage =  homepage.get_a_free_consultation();
//		formpage.formfillup();
//		driver.navigate().back();
//		FreeCoursePage freecoursepage = homepage.goTo_freecoursepage();
//		SignInPage signInpage = freecoursepage.signIn();
//		signInpage.signIn();	 
//		Thread.sleep(20000);		 
//		String errorMessage = signInpage.errorMessge();
//		System.out.println("Error Message : " + errorMessage);
//		
//	}
	
}
