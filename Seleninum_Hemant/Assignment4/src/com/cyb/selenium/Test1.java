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

	
	public void check() throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://cybage.com");
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='txtSearch']")).click();
		
			
		//Select select=new Select(driver.findElement(By.xpath(".//*[@id='WebPartWPQ1']/div[1]/ul/li[5]/a")));
		//select.selectByValue("Automation");
		
		
		/*driver.findElement(By.xpath(".//*[@id='archive-link']/a")).click();;
		
		Select select= new Select(driver.findElement(By.xpath(".//*[@id='lang-chooser']")));
		select.selectByValue("hi");
		driver.findElement(By.xpath(".//*[@id='archive-list']/li[1]/div[1]/div[1]/a/img")).click();;
				*/
		
	}
}
