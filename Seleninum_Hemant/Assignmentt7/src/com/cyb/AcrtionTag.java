package com.cyb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class AcrtionTag {

	
	WebDriver driver;
	
	@Before
	public void start()
	{
		FirefoxProfile firefoxProfile=new FirefoxProfile();
		firefoxProfile.setEnableNativeEvents(true);
		driver=new FirefoxDriver(firefoxProfile);
	}
	
	@Test
	public void test() throws InterruptedException {
	

		
		  driver.get("http://www.makemytrip.com");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath(".//*[@id='content']/div")).click();
		 
		  driver.findElement(By.xpath(".//*[@id='from_city_data_box']")).sendKeys("pune");
		  Thread.sleep(1000);
		  WebElement element1=driver.findElement(By.xpath(".//*[@class='tt-suggestions']/div[1]/p"));
		
		  Actions builder=new Actions(driver);

		 
		  Actions action1=builder.moveToElement(element1).click();
		  action1.build().perform();
		 
		  
			}

}
