package com.cyb;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	
	WebDriver driver;
	java.util.List<WebElement> elements;

	@Before
	public void start()
	{
		FirefoxProfile firefoxProfile=new FirefoxProfile();
		firefoxProfile.setEnableNativeEvents(true);
		driver=new FirefoxDriver(firefoxProfile);
	}
	
	
	void dragAndDrop(WebElement drag,WebElement drop)
	{
		Actions builder=new Actions(driver);
		org.openqa.selenium.interactions.Action dragAndDrop= builder.clickAndHold(drag)
		//	.moveToElement(dropElement)
				.moveToElement(drop)
					.release(drag)
					.build();
		dragAndDrop.perform();
		
	}
	
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get("http://marcojakob.github.io/dart-dnd/nested-elements/web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement dragElement=driver.findElement(By.xpath("html/body/div[1]/div[1]"));
		WebElement dropElement=driver.findElement(By.xpath("html/body/div[1]/div[2]/textarea"));
		WebElement dropOnButton =driver.findElement(By.xpath("html/body/div[1]/div[2]/button"));
		dragAndDrop(dragElement, dropElement);
		Thread.sleep(1000);
		dragAndDrop(dragElement, dropOnButton);
		
		
		
		
		driver.get("http://executeautomation.com/demosite/Dragging.html");
		driver.manage().window().maximize();
	
		
		WebElement dragElement2=driver.findElement(By.id("item1"));
		WebElement dropElement2=driver.findElement(By.id("item4"));
		
		dragAndDrop(dragElement2, dropElement2);
		
		java.util.List<WebElement> ele=driver.findElements(By.className("ui-sortable"));
		
		Thread.sleep(1000);
	
	  for (WebElement webElement : ele) {
		  System.out.println(webElement.getText());
		  
	}
	  
	  Assert.assertEquals( driver.findElements(By.id("sortable")), ele);
	
	  
	}
	
}

