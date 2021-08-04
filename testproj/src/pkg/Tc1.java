package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Tc1 extends UserMethods {

	// Redirect to user Interface from Admin Interface
	public static void main(String[] args){
		Tc1 obj1=new Tc1();
		obj1.launchbrowser();
		
		obj1.adminlogin();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String error=driver.findElement(By.className("messageStackError")).getText();
		System.out.println(error);
		
		obj1.Closebrowser();
		
}}
