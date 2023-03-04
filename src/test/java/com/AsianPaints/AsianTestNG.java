package com.AsianPaints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AsianTestNG {
  @Test
  public void f() {
	  
	  System.setProperty("Webdriver.chrome.driver", "‪C:\\Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
   	  driver.get("https://www.asianpaints.com/");
	  driver.manage().window().maximize();
  }
}
