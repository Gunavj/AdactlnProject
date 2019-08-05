package com.adactlncucumber.pom;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BassClassAdact;

public class AdactlnTestRunner extends BassClassAdact{
	
	
	
	public static  WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver=getBrowser("chrome");
		getUrl("https://www.adactin.com/HotelApp/");
		
		SigninPage sk=new SigninPage(driver);
		
		inputValuestoWebelement(sk.getUserName(), "testusername09");
		inputValuestoWebelement(sk.getPassword(), "test11");
		clickonWebelement(sk.getlogin());

	}

}
