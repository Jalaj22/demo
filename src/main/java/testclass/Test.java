package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;


public class Test {

	WebDriver driver;
	public SoftAssert softassert;
	
	@BeforeMethod
	public void setBrowser(){
		softassert = new SoftAssert();
		System.setProperty("webdriver.gecko.driver","E:\\JAR\\SeleniumJAR\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
	
	@org.testng.annotations.Test(priority=1)
	public void googletitleTest(){
		
		String f = driver.getTitle();
		softassert.assertEquals(f,"Google","Title is not same");
		softassert.assertAll();
	}
	
	/*@org.testng.annotations.Test(priority=2)
	public void googletitleTest2(){
		
		String f = driver.getTitle();
		softassert.assertEquals(f,"Google Account","Title is not same");
		softassert.assertAll();
	}*/
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
		
	}
}
