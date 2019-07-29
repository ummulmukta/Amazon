package com.muummy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iifram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Browserr/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dezlearn.com/testingpage/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.switchTo().frame("contact-iframe");
		Thread.sleep(3000);
		driver.findElement(By.className("mob-icon-menu-1 mob-menu-icon")).click();
//driver.switchTo().parentFrame();

	}

}
