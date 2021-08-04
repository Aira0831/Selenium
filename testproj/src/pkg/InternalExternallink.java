package pkg;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternalExternallink {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genuinecomputer\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		try { 
			if (driver.findElement(By.linkText("Create accountn")).isDisplayed());
			System.out.println("link");
			}
		catch (NoSuchElementException e){
			System.out.println("exception catched");
		}
}


}