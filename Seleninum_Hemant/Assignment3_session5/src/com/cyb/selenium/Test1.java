package com.cyb.selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.PropertiesFile;

import com.sun.jna.platform.mac.Carbon.EventHotKeyID.ByValue;

 class Test1 {

	@Test
	public void check() throws InterruptedException 
	{

		 WebDriver driver= new FirefoxDriver();
		  driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_state_switch4");
		  driver.manage().window().maximize();
		  driver.switchTo().frame(driver.findElement(By.id("iframeResult"))); 
		  driver.findElement(By.xpath("html/body/button")).click();
		  
		  //martini
		  driver.switchTo().alert().sendKeys("Martini");
		  Thread.sleep(1000);
		  driver.switchTo().alert().accept();
		  
		  Thread.sleep(1000);
		  
		  //Cosmopolitan
		  driver.findElement(By.xpath("html/body/button")).click();
		  driver.switchTo().alert().sendKeys("Cosmopolitan");
		  Thread.sleep(1000);
		  driver.switchTo().alert().accept();
		  Thread.sleep(1000);
		  
		  //milk
		  driver.findElement(By.xpath("html/body/button")).click();
		  driver.switchTo().alert().sendKeys("Milk");
		  Thread.sleep(1000);
		  driver.switchTo().alert().accept();
		  
		  	}
}
