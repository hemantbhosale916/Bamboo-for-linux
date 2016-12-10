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
		
		driver.get("http://www.google.com");
		
	}
	
	

}
