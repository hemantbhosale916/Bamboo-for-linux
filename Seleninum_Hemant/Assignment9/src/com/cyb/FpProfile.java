package com.cyb;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FpProfile {

WebDriver driver;
	
	
	
	
	@Test
	public void testDragDropExample() throws InterruptedException {
		FirefoxProfile firefoxProfile=new FirefoxProfile();
		firefoxProfile.setPreference("browser.download.folderList", 2);
		firefoxProfile.setPreference("browser.download.dir","C:\\");
		DesiredCapabilities dp=DesiredCapabilities.firefox();
		dp.setCapability(FirefoxDriver.PROFILE,firefoxProfile);
		WebDriver driver=new FirefoxDriver(dp);
		driver.manage().window().maximize();
		driver.get("http://www.cybage.com/");
		
		(new Actions(driver)).moveToElement(driver.findElement(By.xpath("//*[@id='WebPartWPQ2']/div[1]/ul/li[2]/a/span[1]"))).build().perform();
		
		driver.findElement(By.xpath("//*[@id='78']/li[5]/a")).click();
		
		
		String str=driver.findElement(By.xpath(".//*[@id='ctl00_PlaceHolderMain_LeftPageContent__ControlWrapper_RichHtmlField']/ul[2]")).getText();
		String[] array=str.split("\n");
		Assert.assertEquals(6,array.length);
		
		
		Thread.sleep(1000);
		
		driver.get("http://www.seleniumhq.org/");
		driver.findElement(By.xpath("//*[@id='menu_download']/a")).click();
		driver.findElement(By.xpath("//*[@id='mainContent']/p[3]/a")).click();
		//driver.switchTo().alert().accept();
	}
}
