package com.Adactln.Stepdef;

import org.openqa.selenium.WebDriver;

import com.AdactlnHelper.PageObjectManagerAdactln;
import com.BaseClass.BassClassAdact;
import com.adactlncucumber.pom.AdactlnTestRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactlnStepdefination  extends BassClassAdact{
	public static WebDriver driver;
	public static PageObjectManagerAdactln 
	pom=new PageObjectManagerAdactln(driver);
	@Given("^Launch hotel reservation application using URL as in test data$")
	public void launch_hotel_reservation_application_using_URL_as_in_test_data() throws Throwable {
		getUrl("https://www.adactin.com/HotelApp/");
	
	}

	@When("^Login to the Application Using Username and Password as in Test Data$")
	public void login_to_the_Application_Using_Username_and_Password_as_in_Test_Data() throws Throwable {
		inputValuestoWebelement(pom.getsk().getUserName(), "testusername09");
					 inputValuestoWebelement(pom.getsk().getPassword(), "test11");
					 clickonWebelement(pom.getsk().getlogin());
}
}