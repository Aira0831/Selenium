package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectModel {
	
	WebDriver driver;
	
	//Create Elements of Login Page
	
	By user=By.name("email_address");
	By pwd=By.name("password");
	By button=By.id("tdb1");
	By error=By.className("messageStackError");
	By Logo=By.xpath("//*[@id=\"storeLogo\"]/a/img");
	
	
	//Create Constructor - This keyword is used to invoke on instantiate current class constructor
	//A cnstructor a block of code like a method, that's called on instance of an object
	
	public PageObjectModel(WebDriver driver) {
		this.driver=driver;
	}
	
//create user actions;
	
	public void TypeUsername(String uname) {
		driver.findElement(user).sendKeys(uname);
	}
	public void TypeUserpassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}
	public void ClickLoginButton() {
		driver.findElement(button).click();
	}
	
	public void CaptureErrorMessage() {
		String Em = driver.findElement(error).getText();
		System.out.println(Em);
	}
	
	public void ClickLogo() {
		driver.findElement(Logo).click();
		
	}
}

