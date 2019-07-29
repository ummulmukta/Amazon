package com.muummy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Browserr/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		String alert_message = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept(); 
		System.out.println(alert_message);
		driver.quit();
		
	}

}
