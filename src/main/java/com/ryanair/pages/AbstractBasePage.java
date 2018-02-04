package com.ryanair.pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractBasePage {
	
	protected static WebDriver driver;
	
	public static void initBasePage(WebDriver driver) {
		AbstractBasePage.driver = driver;
		Element.setDriver(driver);
	}

}
