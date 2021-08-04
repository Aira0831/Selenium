package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.PropertiesFile;

public class Hello {
	
	 //static int i;
	
	public static String browserName=null;
	
	public static void main(String[] args) {
		
		PropertiesFile.getProperties();
		PropertiesFile.setProperties();
		PropertiesFile.getProperties();
		
		/*for (i=1; i<=10; i++) {
			System.out.println("Hello Java .."+i);
			*/
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\genuinecomputer\\Downloads\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
		}
		else {
			System.out.println("Browser is not chrome");
		}
	}

}
