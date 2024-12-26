/*Application Information
We will be using a web page (https://ultimateqa.com/consulting/) for this exercise.

Points to note down while creating solution:
1.  Automation Framework should have the following package structure,
   a) Base package (for web driver)
   b) Test Package (for all test classes)
   c) Object package (for main class to call the test classes)
2. Should make use of OOPs concept in the framework
3. Use Page Factory class to locate the elements.

Tasks:
1.	Go to the URL given above.
2.	Choose “Professional Services” and click on “get a free consultation”.
3.	Fill in the form and submit it.
4.	Go to the home page.
5.	Click on “learning” tab and choose “free courses”.
6.	Click on the “Sign in” button. Give any username and password and click on the login button.
7.	Capture the error message.
8.	Close the browser.
*/
package caseStudy12.TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.beust.jcommander.JCommander.Builder;

import caseStudy12.ObjectPackage.SignInPage;

public class standaloneclass {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.get("https://ultimateqa.com/consulting");
			////ul[@id='menu-home-page-menu']/li/a[1] 
			driver.findElement(By.linkText("Professional Services")).click();
			driver.findElement(By.xpath("(//a[contains(@class,'et_pb_button')])[1]")).click();
			driver.findElement(By.id("control-0")).sendKeys("pavani");

			driver.findElement(By.id("control-1")).sendKeys("pavani@gmail.com");
			driver.findElement(By.id("control-2")).sendKeys("Tester");
			driver.findElement(By.id("control-3")).sendKeys("CTS");
			driver.findElement(By.id("control-4")).sendKeys("TestNG and Selenium");
			//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
			//driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
			//Thread.sleep(3000);
//			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("recaptcha-checkbox-border")));
		//	driver.findElement(By.className("recaptcha-checkbox-border")).click();
			driver.switchTo().defaultContent();
		//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='form__submit-btn']")));
			driver.findElement(By.xpath("//button[@data-test='form__submit-btn']")).click();
			driver.navigate().back();
			Actions action = new Actions(driver);
			 WebElement element = driver.findElement(By.linkText("Learning"));
			 WebElement freeCourses = driver.findElement(By.xpath("//*[@id=\"menu-home-page-menu\"]/li[3]/ul/li[1]/a"));
			 action.moveToElement(element).click(freeCourses).build().perform();
			 Thread.sleep(3000); 
			 
			 driver.findElement(By.linkText("Sign In")).click();
			 driver.findElement(By.id("user[email]")).sendKeys("Pavani@gmail.com");
			 driver.findElement(By.name("user[password]")).sendKeys("password");
			// driver.findElement(By.xpath("//*[@id=\"sign_in_d25f688bd1\"]/div[6]/button")).submit();
			 
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
			 driver.findElement(By.xpath("//button[@type='submit']")).click();
    	// String errorMessage = driver.findElement(By.className("form-error__list-item")).getText();
			// System.out.println("after submit");
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notice__form-error")));
			 String errorMessage = driver.findElement(By.className("notice__form-error")).getText();
	 System.out.println("Error Message : " + errorMessage);
	 driver.quit();




	}

}
