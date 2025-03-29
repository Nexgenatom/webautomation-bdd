package com.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
	WebDriver driver;
	
@FindBy(xpath="//span[contains(@data-action, 'banner-accept-all')]//input")
WebElement cookiesAcceptAll;

@FindBy(xpath="//span[contains(@data-action, 'banner-accept-all')]//input")
WebElement cookiesRejectAll;

public HomePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
public WebElement getcookiesAcceptAll(WebDriver driver) {
	
	return cookiesAcceptAll;
}
public WebElement getcookiesRejectAll(WebDriver driver) {
	
	return cookiesAcceptAll;
}


}
