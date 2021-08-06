package com.demo.auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement Username= driver.findElement(By.xpath("//input[@name='email']"));
		WebElement Password= driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement LoginButton= driver.findElement(By.xpath("//button[@name='login']"));
		
		Username.sendKeys("rituk@gmail.com");
		Password.sendKeys("1234@ritu");
		LoginButton.click();
		
		//driver.quit();

	}

}
