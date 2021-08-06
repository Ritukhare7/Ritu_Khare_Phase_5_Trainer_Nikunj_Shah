package com.sel.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestClass {
	
	public static void main(String[] args) throws MalformedURLException {
		
	//	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setBrowserName("chrome");
		
		String sURL = "http://localhost:4444/wd/hub"; 
		
		WebDriver driver = new RemoteWebDriver(new URL(sURL),capabilities);
		driver.get("https://www.simplilearn.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		
		
	}

}
