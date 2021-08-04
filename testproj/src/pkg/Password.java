package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Password {
	//Enter Password in to 2nd Password Edit box in www.infibeam.com Registration page.
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genuinecomputer\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.infibeam.com");
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/div/ul/li[1]/a")).click();
		//Select dropdown=new Select(dropdown.selectByVisibleText("Corporate Policies");
		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-infi_page_widget-48\"]/a")).click();
		driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/a")).click();

}
}