package com.cyb.selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.PropertiesFile;

 class Test1 {

	 WebDriver driver;
	
	public void check() throws IOException, InterruptedException
	{
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumServer\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(""));
		
		
		
		/*WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.squarespace.com/tour/ecommerce-website/");
		driver.manage().window().maximize();
		
		Actions builder=new Actions(driver);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('hello world')");
		js.executeScript("window.scrollTO(0,1800)");
		
		WebElement vieweWebElement=driver.findElement(By.xpath(".//*[@id='commerce-page']article[2]/div/ul/li[2]/a"));
		builder.moveToElement(vieweWebElement).build().perform();
		vieweWebElement.click();
		
		*/
	}
}
