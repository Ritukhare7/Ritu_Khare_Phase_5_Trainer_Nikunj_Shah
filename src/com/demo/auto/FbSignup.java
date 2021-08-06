package com.demo.auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
WebElement CreateAccount = driver.findElement(By.xpath("//*[text()='Create New Account']"));
        
        CreateAccount.click();
        
        WebElement Month = driver.findElement(By.xpath("//*[@id='month']"));
        
        Select MonthDropDown = new Select(Month);
        
        MonthDropDown.selectByVisibleText("Feb");
        
       
       // MonthDropDown.selectByValue("1");
        //MonthDropDown.selectByIndex(1);

	}

}
