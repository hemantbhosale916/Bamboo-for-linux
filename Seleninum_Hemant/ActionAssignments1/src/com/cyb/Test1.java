package com.cyb;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.HttpChannelState.Action;
import org.testng.annotations.BeforeTest;

public class Test1 {
	
	WebDriver driver;
	/*@Before
	public void start()
	{
		FirefoxProfile firefoxProfile=new FirefoxProfile();
		firefoxProfile.setEnableNativeEvents(true);
		driver=new FirefoxDriver(firefoxProfile);
	}
	*/
	
	
	
	//drag and drop
	
	@Test
	public void dragDropExample()
	{

		FirefoxProfile firefoxProfile=new FirefoxProfile();
		firefoxProfile.setEnableNativeEvents(true);
		driver=new FirefoxDriver(firefoxProfile);
		
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement dragElement=driver.findElement(By.id("draggable"));
		WebElement dropElement=driver.findElement(By.id("droppable"));

		Actions builder=new Actions(driver);
		org.openqa.selenium.interactions.Action dragAndDrop= builder.clickAndHold(dragElement)
					.moveToElement(dropElement)
					.release(dropElement)
					.build();
		dragAndDrop.perform();
		
	}

}
