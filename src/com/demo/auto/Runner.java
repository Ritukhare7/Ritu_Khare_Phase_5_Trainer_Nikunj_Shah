package com.demo.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.simplilearn.com/");
		driver.findElement(By.xpath("//a[@title='Log in']")).click();
		
	}

}
