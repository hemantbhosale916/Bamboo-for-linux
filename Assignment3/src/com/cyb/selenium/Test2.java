package com.cyb.selenium;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Test2 {

	public static void main(String[] args) {
		
		
		HtmlUnitDriver driver=new HtmlUnitDriver();
		
		driver.get("http://www.cybage.com");
		System.out.println(driver.getTitle());
		
	}
}
