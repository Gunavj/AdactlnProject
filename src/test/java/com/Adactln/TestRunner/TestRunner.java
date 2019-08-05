package com.Adactln.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BassClassAdact;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\AdactlnFeature\\AutomationAdctln.Feature",
                 glue="com.Adactln.Stepdef")
                

public class TestRunner {
   
	public static WebDriver driver;
    
	@BeforeClass
	
	public static  void Setup() throws Exception {
		driver=BassClassAdact.getBrowser("chrome");
   
	}
	@AfterClass
	public static  void driver() {
//		driver.quit();

	}
}
