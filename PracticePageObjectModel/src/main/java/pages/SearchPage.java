package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(name="q")
	public WebElement search;
	
	@FindBy(name="btnK")
	public WebElement searchbtn;
	
	@FindBy(xpath="//h3[contains(text(),'Facebook - log in or sign up')]")
	public WebElement Facebooklink;
	
	@FindBy(xpath="//input[@id='email']") 
	WebElement Usename;
	
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement  NextButton;
	
	
	
	
	public void searchgoogle(String serachinput)  {
		 try {
			 search.sendKeys(serachinput);
			 searchbtn.click();
		} catch (Exception e) {
			System.out.println("Exceptions caught"+e.getMessage());
		}
		
		
	}
	
	public void verifyFacebookLink() {
		try {
			 Facebooklink.click();
		} catch (Exception e) {
			System.out.println("Exceptions caught"+e.getMessage());
		}
	}
	
}


