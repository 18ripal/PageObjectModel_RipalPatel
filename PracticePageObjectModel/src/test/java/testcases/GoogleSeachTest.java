package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.FacebookPage;
import pages.GoogleSearchPage;
import pages.SearchPage;

public class GoogleSeachTest {
	
	
	

	WebDriver driver;
	pages.GoogleSearchPage objectRepo;
	pages.FacebookPage objectRepo1;
	pages.SearchPage pagefactory;

	@BeforeTest
	public void beforetest() {
		
	

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.get("https://www.google.com/");

	}

	@Test(priority = 1)
	public void GoogleSearchList() throws InterruptedException {
		//GoogleSearchPage page = new GoogleSearchPage(driver);
		//page.searchgoogle("facebook");
		pagefactory=new SearchPage(driver);
		pagefactory.searchgoogle("facebook");

	}

	
	@Test(priority = 2)
	public void Facebookpage() {
		objectRepo= new pages.GoogleSearchPage(driver);
		objectRepo.verifyFacebookLink();
	}

	@Test(priority = 3 )
	public void verifylogin() {
		FacebookPage objectRepo1=new FacebookPage(driver);
		objectRepo1.Enterusername();
		objectRepo1.Enterpassword();
		objectRepo1.Clickonnextbutton();
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}

}
