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

 class Test1 {

	@Test
	public void check() 
	{

		 WebDriver driver= new FirefoxDriver();
		  driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		  driver.manage().window().maximize();
		  driver.switchTo().frame(driver.findElement(By.id("iframeResult"))); 
		  driver.findElement(By.xpath("html/body/button")).click();
		  driver.switchTo().alert().accept();
		
	}
}
