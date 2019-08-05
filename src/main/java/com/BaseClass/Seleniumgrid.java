package com.BaseClass;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Seleniumgrid {

	public static void main(String[] args) {
		DesiredCapabilities chrome= DesiredCapabilities.chrome();
		chrome.setPlatform(Platform.WIN10);
		//URL url=new URL("http://192.168.43.444/wd/hub");
		//driver= new RemoteWebDriver(url, chrome)	;
		
		
	}
	
	
}
