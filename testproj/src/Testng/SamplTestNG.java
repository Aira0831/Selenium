package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.Assert;


public class SamplTestNG {
	@Test 
	public void verifyTitle(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genuinecomputer\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
			String pageTitle = driver.getTitle();
			Assert.assertEquals(pageTitle, "Gmail");
		
}
}