package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UserMethods {
	public static WebDriver driver;
	//Launch Browser
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genuinecomputer\\Downloads\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	//admin loginto gcradmin
   public void adminlogin() {
   driver.get("http://www.gcreddy.com/project/");
   driver.findElement(By.linkText("login")).click();
   driver.findElement(By.name("email_address")).sendKeys("labhishettya@gmail.com");
   driver.findElement(By.name("password")).sendKeys("Aira@007");
   driver.findElement(By.id("tdb1")).click();
	
   }
   
 //admin loginto gcradmin with parameters
   public void adminloginwithparameters(String username, String password) {
   driver.get("http://www.gcreddy.com/project/");
   driver.findElement(By.linkText("login")).click();
   driver.findElement(By.name("email_address")).sendKeys(username);
   driver.findElement(By.name("password")).sendKeys(password);
   driver.findElement(By.id("tdb1")).click();
	
   }
	
	public void Closebrowser() {
		driver.close();
	}
	
	public static void main(String [] args) {
		UserMethods obj=new UserMethods();
		obj.launchbrowser();
		obj.adminlogin();
		obj.Closebrowser();
		obj.launchbrowser();
		obj.adminloginwithparameters("labhishettya@gmail.com", "Aira@007");
		obj.Closebrowser();
		
	}
}
