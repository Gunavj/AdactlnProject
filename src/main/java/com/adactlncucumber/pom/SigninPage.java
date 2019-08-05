package com.adactlncucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SigninPage  {
	
	public  static WebDriver driver;
	public SigninPage(WebDriver idriver) {
		this.driver=idriver;

    	PageFactory.initElements(driver, this);

	}
	@FindBy(id="username")
	
	private WebElement Username;
	
	public WebElement getUserName() {
		return  Username;
		
	}
	
	@FindBy(id="password")
	private WebElement Password;
	public WebElement getPassword() {
		return Password;
		
	}
	@FindBy(id="login")
	private WebElement Login;
	public WebElement getlogin() {
		return Login;
		
	}
	
	
	
	

}
