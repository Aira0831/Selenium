package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import pkg.Hello;

public class PropertiesFile {

	public static Properties prop=new Properties();
	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();

	}

	public static void getProperties() {

		try {

			InputStream input=new FileInputStream("C:/Users/genuinecomputer/eclipse-workspace/testproj/src/config/config.properties");
			//Properties prop=new Properties();
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			Hello.browserName=browser;
			//String result=prop.getProperty("result");
			//System.out.println(result);
		} 
		catch (IOException exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	public static void setProperties() {

		try {

			OutputStream output=new FileOutputStream("C:/Users/genuinecomputer/eclipse-workspace/testproj/src/config/config.properties");
			prop.setProperty("result", "Pass");
			prop.store(output, null);
		} 
		catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}


	}
}
