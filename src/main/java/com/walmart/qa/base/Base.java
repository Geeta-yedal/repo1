package com.walmart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public Base()
	{
		try
		{
		prop=new Properties();
		FileInputStream fileinput=new FileInputStream("C:\\JavaPrograms\\WalmartPom\\src\\main\\java\\com\\walmart\\qa\\config\\config.properties");
		prop.load(fileinput);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		}
	
	public void initialzation()
	{
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\allwebdriver\\cromedriver\\Chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\allwebdriver\\Firefoxdriver\\geckodriver.exe");
			driver=new ChromeDriver();
		}
		else
			System.out.println("Driver name is not given");
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		
		
		
		
	}
}
