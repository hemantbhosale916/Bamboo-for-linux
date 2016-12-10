package com.cyb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import com.google.common.base.Function;

public class FluentWait {

	WebDriver driver;

	@Before
	public void start() {
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setEnableNativeEvents(true);
		driver = new FirefoxDriver(firefoxProfile);
	}

	@Test
	public void test() throws InterruptedException {

		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='content']/div")).click();

		driver.findElement(By.xpath(".//*[@id='from_city_data_box']")).sendKeys("pune");

		// Thread.sleep(1000);

		org.openqa.selenium.support.ui.FluentWait<WebDriver> waitF = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(
				driver).withTimeout(1, TimeUnit.SECONDS).pollingEvery(11, TimeUnit.MILLISECONDS)
						.ignoring(NoSuchElementException.class);

		WebElement modifySearch = waitF.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement modifySearch = driver
						.findElement(By.xpath(".//*[@class='pull-right modify_search_toggle ng-scope']"));
				return modifySearch;

			}
		});

		WebElement element1 = driver.findElement(By.xpath(".//*[@class='tt-suggestions']/div[1]/p"));

		Actions builder = new Actions(driver);

		Actions action1 = builder.moveToElement(element1).click();
		action1.build().perform();

	}

}
