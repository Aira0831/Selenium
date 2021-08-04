package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class clas {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genuinecomputer\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.gcrit.com/build3/admin/");
		
	    driver.get("http://www.gcreddy.com/project/");
	    driver.findElement(By.linkText("login")).click();
		driver.findElement(By.id("tdb2")).click();
	String url=driver.getCurrentUrl();
	if (url.equals("https://gcreddy.com/project/create_account.php")){
		System.out.println("Correct URL");
	}
		WebElement RadioButton= driver.findElement(By.xpath(".//*[@value='f']"));
		Boolean displayed= RadioButton.isDisplayed();
		System.out.println(displayed);
		Boolean Enabled= RadioButton.isEnabled();
		System.out.println(Enabled);
		Boolean Selected= RadioButton.isSelected();
		System.out.println(Selected);
		RadioButton.click();
		System.out.println(RadioButton.isSelected());
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("test");
		driver.findElement(By.id("dob")).sendKeys("20/07/2020");
		driver.findElement(By.name("email_address")).sendKeys("labhishettya@gmail.com");
		driver.findElement(By.name("street_address")).sendKeys("test");
		driver.findElement(By.name("postcode")).sendKeys("65936");
		driver.findElement(By.name("city")).sendKeys("test");
		driver.findElement(By.name("state")).sendKeys("test");
		Select dropdown=new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("India");
		driver.findElement(By.name("telephone")).sendKeys("6593698767");
		System.out.println(driver.findElement(By.name("telephone")).getAttribute("value"));
		//driver.findElement(By.name("password")).sendKeys("Aira@007");
		//driver.findElement(By.name("confirmation")).sendKeys("Aira@007");
		//driver.findElement(By.className("ui-button-text")).click();
		//System.out.println("Login Success ");
		driver.navigate().to("http://www.google.com/");
		driver.get("https://www.gmail.com");
		//driver.findElement(By.className("gb_P")).click();
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("mail")).click();
		//driver.findElement(By.cssSelector(".gb_P")).click();
		//driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div
		WebElement Link = driver.findElement(By.className("VfPpkd-vQzf8d"));
		boolean linkStatus = Link.isDisplayed();
		System.out.println(linkStatus);//true

		linkStatus = Link.isEnabled();
		System.out.println(linkStatus);//true
		System.out.println(Link.getText());

	
		
}
}