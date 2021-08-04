package pkg;

//import java.
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
	
public static void main(String[] args){
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\genuinecomputer\\Downloads\\chromedriver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get("http://www.gcrit.com/build3/admin/");
//=================================================================================================================================		
	    /* To take the screenshot & right click
//==================================================================================================================================	     *
	     * driver.get("https://mail.google.com/mail/u/0/#inbox");
	    driver.manage().window().maximize();
	    driver.findElement(By.name("identifier")).sendKeys("labhishettya@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		driver.findElement(By.xpath("//div[@class='u7land']")).click();
		driver.findElement(By.xpath("//*[@class='ry3kXd Ulgu9']")).click();
		driver.findElement(By.xpath("//*[@class='OA0qNb ncFHed']")).click();
		Actions action = new Actions(driver);
		WebElement rightclick= driver.findElement(By.linkText("Sign in"));
		action.contextClick(rightclick).build().perform();
		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotFile, new File("C:\\Users\\genuinecomputer\\Desktop\\test.png"));*/
		 //WebElement Menu=driver.findElement(By.linkText("Open link in new tab"));
		 //action.moveToElement(Menu).build().perform();
		 //Menu.click();
		 //FileUtils.copyFile(screenshotFile, new File("C:\\Users\\genuinecomputer\\Desktop\\test2.png"));
//=====================================================================================================================================		
		//to double click the element
//====================================================================================================================================		
		/*driver.get("http://api.jquery.com/dblclick/");
	    driver.manage().window().maximize();
	    Actions builder=new Actions(driver);
	    driver.switchTo().frame(0);
	    WebElement ele = driver.findElement(By.xpath("/html/body/div"));
	    builder.doubleClick(ele).build().perform();
	    File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotFile, new File("C:\\Users\\genuinecomputer\\Desktop\\test1.png"));
	  */  
//=====================================================================================================================================
		//drag and drop
		
//=====================================================================================================================================
	/*	
		driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	    Actions builder=new Actions(driver);
	    driver.switchTo().frame(0);
	    WebDriverWait wait = new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		builder.dragAndDrop(source, target).build().perform();
	*/	
//=====================================================================================================================================
	//To highlight an element	
//=====================================================================================================================================		
		/* driver.get("https://www.gmail.com");
	    driver.manage().window().maximize();
WebElement element= driver.findElement(By.name("identifier"));
element.sendKeys("Test@gmail.com");
JavascriptExecutor  js =(JavascriptExecutor) driver;
js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 6px solid green;');", element);
*/		
//===================================================================================================================================
	//to delete all cookies	& scroll up and down
//====================================================================================================================================		
	/*	//driver.get("https://www.gmail.com");
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.softwaretestingmaterial.com");
		 //to perform Scroll on application using  Selenium
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)", "");  --- to scroll down
		 js.executeScript("window.scrollBy(0,-1000)", "");  --- to scroll up

          js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); ---to the bottom of the web page
	*/
//===================================================================================================================================		
		//To disable info bars on Chrome browser eg: A popup like google wants to know your location at top left corner of the browser
//====================================================================================================================================
		//driver.get("https://www.gmail.com");
		//driver.manage().window().maximize();
//ChromeOptions options = new ChromeOptions();
//options.addArguments("disable-infobars");
//WebDriver player = new ChromeDriver(options);
//===================================================================================================================================
		//TO PRESSS enter key
		
	//driver.findElement(By.xpath("//div[@class='u7land']")).sendKeys(Keys.RETURN);
		//ctrl+shift+o ---to import all the relevant classes
//===================================================================================================================================		
	//Desired capabilities is a class used to set browser name& version.
		
//================================================================================================================================
	/*  DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		WebDriver driver1=new InternetExplorerDriver(caps);
		driver1.get("https://google.com");
		*/
//====================================================================================================================================
	//testng.xml is used to control the executio of testng tests	
		
//===================================================================================================================================
		//Exception handling
//====================================================================================================================================
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\genuinecomputer\\Downloads\\chromedriver\\chromedriver.exe");
		//WebDriver driver1=new ChromeDriver();
		//driver.get("http://www.gcrit.com/build3/admin/");
	/*	
		try{
			System.out.println("hello world");
			int i=1/0;
		}
		catch(Exception Exce){
			System.out.println("i am inside catch block");
			System.out.println(Exce.getMessage());
			System.out.println(Exce.getCause());
			Exce.printStackTrace();
		}
		finally {
			System.out.println("i am inside finaly block");
		}
	*/

//===========================================================================================================================
	/*Text from Autoit file (.au3 extension). it is created using finder tool (au3info in autoit folder)
//===============================================================================================================
	 * ControlFocus("Open","","Edit1")
	ControlSetText("Open","","Edit1","download.jpg")
	ControlClick("Open","","Button1")*/
//==================================================================================================================================	
		//Auto IT execution//	
//==================================================================================================================
	//Runtime.getRuntime().exec("Path of the AutoIT script file")
//====================================================================================================================	
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}