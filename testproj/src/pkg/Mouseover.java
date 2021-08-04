package pkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genuinecomputer\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.carmax.com");
		driver.manage().window().maximize();
		Actions Builder=new Actions(driver);
		WebElement Menu= driver.findElement(By.xpath("//*[@id=\"header-helpful-links-button\"]/span"));
		Builder.moveToElement(Menu).build().perform();
		driver.findElement(By.xpath("//*[@id=\"header-helpful-links-menu\"]/ul/li[5]/a")).click();
		String window = driver.getWindowHandle();
		System.out.println(window);
		
		Set<String> Handles = driver.getWindowHandles();
		int size= Handles.size();
		System.out.println(size);
		
}
}