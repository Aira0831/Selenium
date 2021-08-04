package pkg;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentreportDemo {
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlreporter=new ExtentHtmlReporter("extent.html");
		
	//create extent reports & attach reporters
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
	}

}
