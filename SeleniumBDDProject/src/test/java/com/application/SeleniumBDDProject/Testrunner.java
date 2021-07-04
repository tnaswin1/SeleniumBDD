package com.application.SeleniumBDDProject;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import functions.Common;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * This Runner class will execute all scenarios in the feature files
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
				 glue = "stepdef",				 
				 monochrome= true,
				 plugin= {"pretty","html:target/cucumber.html"})


public class Testrunner extends Common{
	
	@AfterClass
	public static void test()
	{
		driver.quit();
	}

}
