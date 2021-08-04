package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genuinecomputer\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.gcrit.com/build3/admin/");
		
	    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	    driver.manage().window().maximize();
	    driver.switchTo().frame("classFrame");
	    driver.findElement(By.xpath("//a[@href='org/openqa/selenium/devtools/idealized/browser/model/package-summary.html'][contains(.,'org.openqa.selenium.devtools.idealized.browser.model')]")).click();
	String text= driver.findElement(By.xpath("/html/body/main/div[1]/h1")).getText() ;
	System.out.println(text);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
	
	
	
	   
}
}