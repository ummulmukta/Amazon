package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	WebDriver driver;
public void broseer() {
	System.setProperty("webdriver.chrome.driver","./Browserr/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.jcpenney.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	
}
}
