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
	public void check() throws IOException {

		WebDriver driver = new FirefoxDriver();

		String[] param = new String[] {
				"C:\\Users\\trng7\\Desktop\\Seleninum_Hemant\\UserAuthentication.exe",
				"Authentication Required", "hemantbh", "sonu]916" };
		Runtime.getRuntime().exec(param);
		driver.get("http://helpdesk.cybage.com/HldMvc/Department/Selection");

		driver.manage().window().maximize();
		
		
		
		

	}
}
