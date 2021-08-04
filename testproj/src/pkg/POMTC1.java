package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMTC1 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genuinecomputer\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver Tc1driver=new ChromeDriver();
		
		Tc1driver.get("http://www.gcreddy.com/project/");
		Tc1driver.findElement(By.linkText("login")).click();
		PageObjectModel TC1obj=new PageObjectModel(Tc1driver);
		
		TC1obj.TypeUsername("labhishettya@gmail.com");
		TC1obj.TypeUserpassword("Aira@007");
		TC1obj.ClickLoginButton();
		TC1obj.CaptureErrorMessage();
		
		String currUrl=Tc1driver.getCurrentUrl();
		if (currUrl.equals("https://gcreddy.com/project/login.php?action=process")){
			TC1obj.ClickLogo();
			String Url2= Tc1driver.getCurrentUrl();
			if (Url2.equals("http://gcreddy.com/project/index.php")) {
				System.out.println("Clicked on Logo-Passed");
			}
			
		}
		Tc1driver.close();
	}
	
	
}
