package com.muummy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Cselectoor {
WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Browserr/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.jcpenney.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

	}

}
