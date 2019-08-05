package com.AdactlnHelper;

import org.openqa.selenium.WebDriver;

import com.adactlncucumber.pom.SigninPage;

public class PageObjectManagerAdactln {
	
	public   WebDriver driver;
	
	public static SigninPage sk;
	
	public SigninPage getsk() {
		
		if(sk==null) {
			sk=new SigninPage(driver);
		}
		return sk;
		

}
	public  PageObjectManagerAdactln (WebDriver idriver){
		
	}

}
