package com.cyb.selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.internal.PropertiesFile;

 class Test1 {
	 WebDriver driver;
	
	public void check() throws IOException
	{
		PropertiesFile propertiesFile=new PropertiesFile("browser.properties");
		Properties properties=new Properties();
		properties=propertiesFile.getProperties();
		
		System.out.println("browser ="+properties.getProperty("browser"));
		System.out.println("Url is ="+properties.getProperty("url"));
		
		//WebDriver driver=new FirefoxDriver();
		
		
		
		
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		
		switch (browser) {
		case "firefox":
			 
		
			   driver= new FirefoxDriver();
			  driver.get(url);
			 
			
			break;
		 
		case "chrome":
			//System.setProperty(webdriver.driver.chrome.driver,"C:\\SeleniumServer\\chromedriver.exe");
			 driver= new ChromeDriver();
			  driver.get(url);
		
			
			break;

		default:
			break;
		}
		
		
		
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("career"));
		driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[1]/a")).click();

		System.out.println("title is ="+driver.getTitle());
		
		
	
		
		
	}
}
