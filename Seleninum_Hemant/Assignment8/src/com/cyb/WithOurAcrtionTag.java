package com.cyb;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class WithOurAcrtionTag {

	
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
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@class='tabs_list clearfix']/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='from_city_data_box']")).sendKeys("pune");

		//WebElement select = driver.findElement(By.tagName("input"));
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div[1]/div[3]/div/div[4]/div/div/div/span/span/div/span/div[1]/p"));
		Thread.sleep(1000);
		element.click();
	}
}
