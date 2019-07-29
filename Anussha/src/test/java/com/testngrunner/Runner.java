package com.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="Faeture/featu.feature",
		
		glue="com.stepdef"
		
		)
public class Runner extends AbstractTestNGCucumberTests {

}
