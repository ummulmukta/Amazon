package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class adhbjm extends Base {
@Test
	public void asd() throws Throwable {
	broseer();
	driver.findElement(By.linkText("Store Ads")).click();
	Thread.sleep(3000);
	/*//driver.findElement(By.xpath("(//a[contains(text(),'Store Ads')])[2]")).click();
	driver.findElement(By.cssSelector("input#searchInputId")).click();
	Thread.sleep(3000);
	Actions ac = new Actions (driver);
	  WebElement we = driver.findElement(By.xpath("//*[@class='rendernavList' and contains(text(),'Clearance')]"));
	  Thread.sleep(5000);
	  ac.moveToElement(we).moveToElement(driver.findElement(By.xpath("//a[@class='_3B53C _1cRgw'and contains(text(),'Women')]"))).click().build().perform();
	  	}
	//driver.findElement(By.xpath("//*[@class=\"rendernavList\"and contains(text(),'Clearance')]"));


*/
}}


