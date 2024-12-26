package caseStudy12.BasePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import caseStudy12.ObjectPackage.HomePage;

public class BaseClass {

	public static WebDriver driver;
	public static HomePage homepage;
	public BaseClass(WebDriver driver)
	{
		this.driver= driver;
	}

	public static WebDriver intializeDriver() throws IOException
	{

//		Properties prop = new  Properties();
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Global.properties");
//		//C:\Users\2143082\eclipse-workspace\PageObjectModel\src\test\resources\Global.properties
//		prop.load(fis);
//		String browserName = prop.getProperty("browser");
		String browserName = "chrome";
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			 driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}

	@BeforeTest
	public static HomePage launchApplication() throws IOException
	{
		driver = intializeDriver();
		homepage = new HomePage(driver);
		homepage.goTo_homepage();
		return homepage;
	}

//	public void tearDown()
//	{
//		driver.close();
//	}

}
