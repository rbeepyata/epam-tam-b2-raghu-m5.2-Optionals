package com.ryanair.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

/**
 * Custom implementation of the WebElement, basically a wrapper on the webdriver actions.
 * @author Raghunandan_Beepyata
 *
 */
public class Element implements WebElement{
	
	private static WebDriver driver;
	private By by;
	
	public Element(By by) {
		this.by = by;
	}
	
	public static Element getElement (By by) {
		return new Element(by);
	}
	
	public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
		return driver.findElement(by).getScreenshotAs(target);
	}

	public void click() {
		driver.findElement(by).click();
	}

	public void submit() {
		driver.findElement(by).submit();		
	}

	public void sendKeys(CharSequence... keysToSend) {
		driver.findElement(by).sendKeys(keysToSend);		
	}

	public void clear() {
		driver.findElement(by).clear();		
	}

	public String getTagName() {
		return driver.findElement(by).getTagName();
	}

	public String getAttribute(String name) {
		return driver.findElement(by).getAttribute(name);
	}

	public boolean isSelected() {
		return driver.findElement(by).isSelected();
	}

	public boolean isEnabled() {
		return driver.findElement(by).isEnabled();
	}

	public String getText() {
		return driver.findElement(by).getText();
	}

	public List<WebElement> findElements(By by) {
		return driver.findElement(this.by).findElements(by);
	}

	public WebElement findElement(By by) {
		return driver.findElement(this.by).findElement(by);
	}

	public boolean isDisplayed() {
		return driver.findElement(by).isDisplayed();
	}

	public Point getLocation() {
		return driver.findElement(by).getLocation();
	}

	public Dimension getSize() {
		return driver.findElement(by).getSize();
	}

	public Rectangle getRect() {
		return driver.findElement(by).getRect();
	}

	public String getCssValue(String propertyName) {
		return driver.findElement(by).getCssValue(propertyName);
	}


	public By getBy() {
		return by;
	}


	public void setBy(By by) {
		this.by = by;
	}

	public static void setDriver(WebDriver driver) {
		Element.driver = driver;
	}
	

}
