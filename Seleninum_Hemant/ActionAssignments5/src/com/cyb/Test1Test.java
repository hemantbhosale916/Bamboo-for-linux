// just to test by junit


package com.cyb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test1Test {

	WebDriver driver;
	
	
	
	
	@Test
	public void testDragDropExample() {
		ProfilesIni profile=new ProfilesIni();
		FirefoxProfile firefoxProfile=profile.getProfile("HemantProfile");
		driver=new FirefoxDriver(firefoxProfile);
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		
	}

}
