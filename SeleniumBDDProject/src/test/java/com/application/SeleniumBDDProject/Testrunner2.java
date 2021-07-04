package com.application.SeleniumBDDProject;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import functions.Common;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * This Runner class will execute scenarios that have tag with @smoke
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
				 glue = "stepdef",
				 tags="@smoke",
				 monochrome= true,
				 plugin= {"pretty","html:target/cucumber.html"})


public class Testrunner2 extends Common{
	
	@AfterClass
	public static void test()
	{
		driver.quit();
	}

}
