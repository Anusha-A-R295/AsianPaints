package com.demo.Asian;

import org.openqa.selenium.By;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;

//import dev.failsafe.internal.util.Assert;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class homepageStepdefinition {
	

	@Given("user launch Chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
		WebDriver driver;
	    
		System.setProperty("Webdriver.chrome.driver", "‪C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
     	driver.get("https://www.asianpaints.com/");
     	
     	//Validation of url
     	String currentUrl=driver.getCurrentUrl();
     	if(currentUrl.equals("https://www.asianpaints.com/")) {
     		System.out.println("Website URL is corect");
     		
     	}else {
     		System.out.println("Website URL is incorrect");
     	}
	    
     	
     	driver.manage().window().maximize();

		
		Thread.sleep(2000);
		WebElement handle=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		handle.click();
		Thread.sleep(10000);
		
		//Validation of handle button
		if(handle.isSelected()) {
			System.out.println("handle button is clicked");
		}
		else {
			System.out.println("Handle button is not clicked");
		}
		Thread.sleep(4000);
		
		
		
		
	    //Search bar
	    WebElement searchfield=driver.findElement(By.xpath("//input[@name='q']"));
	    searchfield.sendKeys("Texture");
	    
	    Thread.sleep(5000);
	    //Validation of search field
	    if(searchfield.getAttribute("value").equals("Texture")) {
	    	System.out.println("In search field");
	    }
	    else {
	    	System.out.println("not matching");
	    }
	    //Validation of search bar	
	    driver.findElement(By.xpath("(//span[@class='spriteIcon-Firstfold searchSpriteIcon'])[1]")).click();
	   
	    driver.quit();
	
	
      
	}
	
	//Created By=Anusha A R
	//Modified By=
	//Reviewed By=Roopanand Kommi Naidu
	//Method is verifying the loading of homepage and search functionality
	

	@When("user opens URL")
	public void user_opens_url() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriver driver;

	    
		System.setProperty("Webdriver.chrome.driver", "‪C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
     	driver.get("https://www.asianpaints.com/");
		WebElement handle=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		
		
		
		
	   
	
    
		
	}

	@When("user should able click on accept all cookies button")
	public void user_should_able_click_on_accept_all_cookies_button() throws InterruptedException {
	    
		
	}

	
	

	@Given("user is on AsPaints Homepage")
	public void user_is_on_as_paints_homepage() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "‪C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
     	driver.get("https://www.asianpaints.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(4000);
		
	    
		WebElement icon=driver.findElement(By.xpath("//span[@class='spriteIcon-Firstfold profileIcon']"));
		icon.click();
		//validation of login 
		
	   
		
	
		Thread.sleep(4000);
		 WebElement mobileNumberField = driver.findElement(By.id("loginMobile"));
		 mobileNumberField.sendKeys("9742190947");
		 //validation of mobile number field
		 if(mobileNumberField.getAttribute("value").equals("9742190947")) {
		    	System.out.println("data entered in the corretfield");
		    }
		    else {
		    	System.out.println("data was not entered in the correct text field");
		    }
		 
		
		 WebElement submitButton = driver.findElement(By.xpath("//button[@class='ctaText modal__variant-login--submit']"));
		 submitButton.click();
		 WebElement otpField = driver.findElement(By.id("loginOtp"));
		 //Validation of otp field
		 if(mobileNumberField.getAttribute("value").equals("")) {
		    	System.out.println("This is otp field and is empty");
		    }
		    else {
		    	System.out.println("This is not Otp field");
		    }
		 
		 Thread.sleep(20000);
		 WebElement submitButton2 = driver.findElement(By.xpath("//button[@class='ctaText validate-login  modal__variant-login--submit']"));
		 submitButton2.click();
		 
      
		
	    
		
	    
	
	    
	}

	@When("user click on login icon should be able to see a popup window")
	public void user_click_on_login_icon_should_be_able_to_see_a_popup_window() throws InterruptedException {
		

	}

	@When("user should be able to enter valid mobile number and otp")
	public void user_should_be_able_to_enter_valid_mobile_number_and_otp() throws InterruptedException {

		 
		 
	    
		
	}

	@Then("user should be able to click on submit button")
	public void user_should_be_able_to_click_on_submit_button() throws InterruptedException {



	}

	@When("user enters unregistered mobile register window should popup and should be able to enter valid name, email and Otp")
	public void user_enters_unregistered_mobile_register_window_should_popup_and_should_be_able_to_enter_valid_name_email_and_otp() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		WebDriver driver;
//		System.setProperty("Webdriver.chrome.driver", "‪C:\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//     	driver.get("https://www.asianpaints.com/");
//	    driver.manage().window().maximize();
//	    Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
//		Thread.sleep(4000);
//		WebElement nameField = driver.findElement(By.id("registerName"));
//		 nameField.sendKeys("Harisha");
//	    WebElement emailField = driver.findElement(By.id("registerEmail"));
//		 emailField.sendKeys("harishsgowda573@gmail.com");
//		 WebElement otpField = driver.findElement(By.id("registerOtp"));
//		 otpField.click();
//		 Thread.sleep(20000);
//		 driver.close();
//		
	}
	//registration

	
	@When("user brings the cursors on slider objects user should be able see the modules within them and cick on them")
	public void user_brings_the_cursors_on_slider_objects_user_should_be_able_see_the_modules_within_them_and_cick_on_them() throws InterruptedException {
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "‪C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
     	driver.get("https://www.asianpaints.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(4000);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath( "//span[@class='iconTextLinks__text visible-in-Desktop']"))).perform();
		Thread.sleep(2000);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(driver.findElement(By.xpath("//a[@data-target='#SERVICES']"))).perform();
		Thread.sleep(2000);

		

	}

	@When("user click on whislist button should be able navigate to wishlist page")
	public void user_click_on_whislist_button_should_be_able_navigate_to_wishlist_page() throws InterruptedException {
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "‪C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
     	driver.get("https://www.asianpaints.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(4000);
	WebElement wishlist=driver.findElement(By.xpath("//span[@class='spriteIcon-Firstfold wishListIcon']"));
	
	wishlist.click();
		driver.findElement(By.linkText("CONTINUE SHOPPING")).click();
	Thread.sleep(10000);
	driver.navigate().back();
		
	    // Write code here that turns the phrase above into concrete actions
		
	
	}

	@Then("user shoulb be able to naviagte back to homepage")
	public void user_shoulb_be_able_to_naviagte_back_to_homepage() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		
	
	}
	//whislist

	@When("user cli cks ob cart icon and should be able to see a popup window")
	public void user_cli_cks_ob_cart_icon_and_should_be_able_to_see_a_popup_window() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "‪C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
     	driver.get("https://www.asianpaints.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(4000);
		
	WebElement cart=driver.findElement(By.xpath("//button[@class='iconLinks iconLinks__cart cart-js-handle spriteIcon-Firstfold cartIcon border-0 bg-transparent track_minicart']"));
	cart.click();
	Thread.sleep(4000);
	
	WebElement startshopping=driver.findElement(By.xpath("//a[@class='ctaText']"));
	startshopping.click();
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.quit();
	}

	@When("user should be able click on start shopping")
	public void user_should_be_able_click_on_start_shopping() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
	   
	}

	@Then("user should be able to navigate back to the home page")
	public void user_should_be_able_to_navigate_back_to_the_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
	    
	}
	//cart_icon

	@Given("user is on Aspaints homepage")
	public void user_is_on_aspaints_homepage() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "‪C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
     	driver.get("https://www.asianpaints.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(4000);
		driver.quit();
	    
	}

	@Then("user be able to check functionality of hyperlinks present in header")
	public void user_be_able_to_check_functionality_of_hyperlinks_present_in_header() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "‪C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
     	driver.get("https://www.asianpaints.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(4000);
		WebElement link3=driver.findElement(By.xpath("//a[@href='https://www.asianpaints.com/resources/tools/mobile-app.html']"));
		link3.click();
		                                                     
		Thread.sleep(20000);
		driver.navigate().back();
		WebElement link4=driver.findElement(By.xpath("//a[@href='https://www.asianpaints.com/painting-contractors.html']"));
		link4.click();
		Thread.sleep(10000);
		driver.navigate().back();
		
		//Find a store
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='initialText js-initialText']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='form-global__field form-text-input__field commonTextComp']"))
		.click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='form-global__field form-text-input__field commonTextComp']")).sendKeys("573201");
	
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='header-store-locator-submit-arrow-icon-on-button']")).click();
	    
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='spriteIcon-Aprevamp  closeIcon track_login_close']")).click();
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[1]/div/div[1]/a[3]")).click();
		
		Thread.sleep(3000);
		WebElement link6=driver.findElement(By.xpath("//a[@href='https://www.asianpaints.com/store-locator.html']"));
		link6.click();
		                                                     
		Thread.sleep(5000);
		driver.navigate().back();
		
		
		driver.quit();
	}
	//headerlinksfunctionality
}
