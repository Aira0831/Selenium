package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GCRLogin {
	public static void main(String[] args) throws InterruptedException { 
		 String username;
		 String password;
		int o;
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\genuinecomputer\\Downloads\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	/*if(o=1; o<=2; o++) {
		if(i==1)
		{
			username="1";
			password="2";
			System.out.println("first");
		}
	}
	
	else (i==2)
		{
			username="1";
			password="2";
			System.out.println("second");
		}
	driver.get("http://www.gcreddy.com/project/admin/login.php");
	//invalid login attempts
	driver.findElement(By.name("username")).sendKeys(username);
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.id("tdb1")).click();
	
	*/
	
	
	//add items to cart & verify it is added
	driver.get("http://www.gcreddy.com/project/");
    driver.findElement(By.linkText("login")).click();
    driver.findElement(By.name("email_address")).sendKeys("labhishettya@gmail.com");
    driver.findElement(By.name("password")).sendKeys("Aira@007");
    driver.findElement(By.className("ui-button-text")).click();
    String url=driver.getCurrentUrl();
    if (url.equals("http://gcreddy.com/project/shopping_cart.php")){
    	System.out.println("positive -passed");
    }
    
    
    driver.findElement(By.name("email_address")).sendKeys("");
    driver.findElement(By.name("password")).sendKeys("");
    driver.findElement(By.className("ui-button-text")).click();
   driver.getCurrentUrl();
   if (url.equals("http://www.gcreddy.com/project/")){
    System.out.println("Negaive -passed");  
    driver.findElement(By.xpath("//*[@id=\"columnLeft\"]/div[1]/div[2]/a[1]")).click();
    driver.findElement(By.id("tdb6")).click();
   driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
  
   String amount= driver.findElement(By.xpath("//*[@id=\"columnRight\"]/div/table")).getText();
   if (amount.contains("2")) {
	   System.out.println("failed");
   }
   else {
	   System.out.println("passed");
   }
   
   }}}

