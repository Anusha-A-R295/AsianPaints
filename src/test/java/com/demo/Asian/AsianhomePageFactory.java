package com.demo.Asian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AsianhomePageFactory {
	 WebDriver driver = null;
	 @FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	 WebElement handle;
	 @FindBy(xpath="//input[@name='q']")
	 WebElement searchfield;
	 
	 
	 @FindBy(xpath="//span[@class='spriteIcon-Firstfold profileIcon']")
	 public WebElement icon;
	 @FindBy(xpath="//button[@class='ctaText modal__variant-login--submit']")
	 WebElement submitButton;
	 
	 @FindBy(xpath="//span[@class='spriteIcon-Firstfold wishListIcon']")
	 WebElement wishlist;
	 @FindBy(xpath="//a[@class='ctaText']")
	 WebElement startshopping;
	 @FindBy(xpath="//button[@class='iconLinks iconLinks__cart cart-js-handle spriteIcon-Firstfold cartIcon border-0 bg-transparent track_minicart']")
	 WebElement cart;
	 @FindBy(xpath="//a[@href='https://www.asianpaints.com/resources/tools/mobile-app.html']")
	 WebElement link3;
	 @FindBy(xpath="//button[@class=' etr0e9l11 css-1q1dxei-StyledButton-StyledButton e1wp3nh0']")
	 WebElement link4;
	 
	 
	 
	 public AsianhomePageFactory(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }
	 public void handle() {
		 handle.click();
		 
	 }
	 public void searchfield()
	 {
		 searchfield.click();
	 }
	 public void icon() {
		 icon.click();
	 }
	 public void submitButton() {
		 submitButton.click();
	 }
	 
	 public void wishlist() {
		 wishlist.click();
	 }
	 public void startshopping() {
		 startshopping.click();
	 }
	 public void cart() {
		 cart.click();
	 }
	 public void link3() {
		 link3.click();
	 }
	 public void link4() {
		 link4.click();
	 }
	
	 

}

