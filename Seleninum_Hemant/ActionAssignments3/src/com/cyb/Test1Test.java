// just to test by junit


package com.cyb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class Test1Test {

	WebDriver driver;
	
	
	@Before
	public void start()
	{
		FirefoxProfile firefoxProfile=new FirefoxProfile();
		firefoxProfile.setEnableNativeEvents(true);
		driver=new FirefoxDriver(firefoxProfile);
	}
	
	
	@Test
	public void testDragDropExample() {
		driver.get("http://www.ehow.com/");
		driver.manage().window().maximize();
		(new Actions(driver))
		.moveToElement(driver.findElement(By.xpath(".//*[@id='Header']/section/div/div[1]/span/label")))
		.click(driver.findElement(By.xpath(".//*[@id='Header']/section/div/div[1]/span/div/div[1]/ul[3]/li[2]/a")))
		.build()
		.perform();
		
	}

}
