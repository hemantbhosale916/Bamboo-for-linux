package com.cyb;

import static org.junit.Assert.*;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import java.io.*
;public class ScreenCapture {

	WebDriver driver;
	WebElement element;


	public void captureScreenElement(WebDriver driver, WebElement element) throws IOException {
		java.io.File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Point point = element.getLocation();
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		java.awt.Rectangle rectangle = new java.awt.Rectangle(width, height);

		BufferedImage img = ImageIO.read(screenShot);
		BufferedImage dest = img.getSubimage(point.getX(), point.getY(), rectangle.width, rectangle.height);
		ImageIO.write(dest, "jpg", screenShot);
		FileUtils.copyFile(screenShot,  new java.io.File("D:\\ErrorElement.jpg"));

	}

	public void captureScreenDriver(WebDriver driver) throws IOException {
		java.io.File scrsht = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrsht, new java.io.File("D:\\ErrorDriver.jpg"));
		System.out.println("get file name :" + scrsht.getName());
	}
	
	@Before
	public void start() {
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setEnableNativeEvents(true);
		driver = new FirefoxDriver(firefoxProfile);
	}

	@Test
	public void test() throws IOException {

		this.driver.get("http://www.google.com/");
		this.driver.manage().window().maximize();
		element = driver.findElement(By.xpath("//*[@id='lst-ib']"));

		try {

			driver.findElement(By.id("testing")).sendKeys("test");

		} catch (Exception e) {
			captureScreenElement(driver, element);
			captureScreenDriver(driver);
		}
		
	}


}
