package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
		}

	
	By search =By.name("q");
	By searchbtn=By.name("btnK");
	By Facebooklink=By.xpath("//h3[contains(text(),'Facebook - log in or sign up')]");
	
	public void searchgoogle(String serachinput)  {
		 try {
			 driver.findElement(search).sendKeys(serachinput);
			 Thread.sleep(3000);
			 driver.findElement(searchbtn).click();
			 Thread.sleep(2000);
			
		} catch (Exception e) {
			System.out.println("Exceptions caught"+e.getMessage());
		}
		
		
	}
	
	public void verifyFacebookLink() {
		try {
			 driver.findElement(Facebooklink).click();
			 Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Exceptions caught"+e.getMessage());
		}
	}
	
}
