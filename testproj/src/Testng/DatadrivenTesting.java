package Testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.testng.Assert;

import junit.framework.Test;

public class DatadrivenTesting<Workbook> {
	
	public WebDriver driver;
	
	@Test (dataprovider="testdata")
	public void login(String user, String password) {
		driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
		Assert.assertEquals("http://www.gcrit.com/build3/admin/index.php", driver.getCurrentUrl());
		driver.close();
	}
	
	@Dataprovider (name="testdata")
	public Object [] [] readExcel() throws WebDriverException, IOException {
	File f=new File("C:/Users/genuinecomputer/Desktop/test.xlsx");
	Workbook W = Workbook.getWorkbook(f);
	Sheet s=w.getsheet(sheet1);
	cell c=s.getcell;
    int rows= s.getrows();
    int columns=s.getcolumns();
    
    String inputdata[][]=new String [Rows][Columns];
    for(i=0; i<rows; i++) {
    	for(j=0; j<rows; j++){
    		cell c=s.getcell(j,i);
    		inputdata [i][j]=c.getcontents();
    		System.out.println(inputdata [i][j]);
    	}}
    	return inputdata;
    		
    		
    	}
    }
*/
    
   



