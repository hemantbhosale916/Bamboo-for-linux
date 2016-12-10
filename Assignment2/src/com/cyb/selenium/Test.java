package com.cyb.selenium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

class Test1 {

	@Test
	public void chrome() throws Exception {
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\hemantbh\\Desktop\\SeleniumServer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		*/
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hemantbh\\Desktop\\SeleniumServer\\chromedriver.exe");
		DesiredCapabilities cp=DesiredCapabilities.chrome();
		URL url=new URL("http","localhost",4444,"/wd/hub");
		cp.setJavascriptEnabled(true);
		
		
		WebDriver driver= new RemoteWebDriver(url,cp);
		//opening cybage.com
		driver.get("http://www.cybage.com");
		
		//navigating to careers
		driver.navigate().to("http://www.cybage.com//career");
	
		//maximizing and getting title as carrers
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
		//back and verifying titile
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		//navigating and getting title
		driver.navigate().to("http://www.cybage.com//worldwide-locations");
		System.out.println(driver.getTitle());
		
		
		
		
	}
	
	

}
