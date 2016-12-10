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
import org.openqa.selenium.remote.server.handler.FindElement;
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
		
		driver.get("http://marcojakob.github.io/dart-dnd/nested-elements/web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement dragElement=driver.findElement(By.xpath("html/body/div[1]/div[1]"));
		//WebElement dropElement=driver.findElement(By.xpath("html/body/div[1]/div[2]/textarea"));
		WebElement dropOnButton =driver.findElement(By.xpath("html/body/div[1]/div[2]/button"));
		Actions builder=new Actions(driver);
		org.openqa.selenium.interactions.Action dragAndDrop= builder.clickAndHold(dragElement)
					//.moveToElement(dropElement)
					.moveToElement(dropOnButton)
					.release(dragElement)
					.build();
		dragAndDrop.perform();
		
	}

}
