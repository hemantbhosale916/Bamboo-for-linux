package com.cyb.selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.PropertiesFile;

 class Test1 {

	
	public void AutoITPopUpExample() throws IOException
	{

		
		  WebDriver driver= new FirefoxDriver();
		  driver.get("http://cybintranet:8085/HomePage_Applications/Submit%20a%20photo.aspx");
		 // driver.manage().window().maximize();
		  String[] param=new String[]{"C:\\Users\\trng7\\Desktop\\Seleninum_Hemant\\fileupload.exe","File Upload","C:\\Users\\trng7\\Desktop\\sample.jpg"};
		  Runtime.getRuntime().exec(param);
		
		
	}
}
