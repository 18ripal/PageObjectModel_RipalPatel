package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class FacebookPage {
	
WebDriver driver;
	
	public FacebookPage(WebDriver driver) {
		this.driver = driver;
		}

	By Usename=By.xpath("//input[@id='email']");
	By Password=By.xpath("//input[@id='pass']");
	By NextButton=By.name("login");
	



public void Enterusername() {
	driver.findElement(Usename).clear();
	driver.findElement(Usename).sendKeys("PomTest");
}

public void Enterpassword() {
	driver.findElement(Password).clear();
	driver.findElement(Password).sendKeys("Test890");
}

public void Clickonnextbutton() {
	driver.findElement(NextButton).click();
	String title=driver.getTitle();
	assertEqual(title,"Facebook - log in or sign up");
	

}

private void assertEqual(String title, String string) {
	// TODO Auto-generated method stub
	
}





}