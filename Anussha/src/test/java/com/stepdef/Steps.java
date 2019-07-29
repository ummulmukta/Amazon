package com.stepdef;

import org.openqa.selenium.WebDriver;

import com.base.Common;

//import com.base.Base;
//import com.base.Comm;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps{
	WebDriver driver;
	@Given("^User able Go to home page$")
	public void user_able_Go_to_home_page() throws Throwable {
		
	
		driver=Common.getBrowser("chrome", driver);
		driver.get(Common.getGetURL());
	}

	@When("^Click on Signinbutton$")
	public void click_on_Signinbutton() throws Throwable {
	    
	   
	}

	@When("^put user as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void put_user_as_and_password_as(String arg1, String arg2) throws Throwable {
	    
	   
	}

	@When("^Click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
	    
	   
	}

	@Then("^login should be successfully done$")
	public void login_should_be_successfully_done() throws Throwable {
	    
	   
	}



}
