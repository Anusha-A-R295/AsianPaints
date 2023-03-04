Feature: Aspaints Homepage
	Background: user is on AsPaints Homepage
		Given user launch Chrome browser
		Then user opens URL
		
		
	Scenario Outline: Search
		Given user clicks on the search bar
		Then user enters the keywords "<keywords>"
		Examples:
		|keywords|
		|Texture |
		|Stencils|
  
	Scenario: Load Homepage
		Given user launch Chrome browser
		When user opens URL
		And user should able click on accept all cookies button
		Then user is on AsPaints Homepage
		
	Scenario: Login
		Given user is on AsPaints Homepage
		When user click on login icon should be able to see a popup window
		And user should be able to enter valid mobile number and otp
		Then user should be able to click on submit button
			
	Scenario: Register
		Given user is on AsPaints Homepage
		When user enters unregistered mobile register window should popup and should be able to enter valid name, email and Otp
		Then user should be able to click on submit button
		
	Scenario: MouseOver
		Given user is on AsPaints Homepage
		When user brings the cursors on slider objects user should be able see the modules within them and cick on them
		
	Scenario: Whislist
		Given user is on AsPaints Homepage
		When user click on whislist button should be able navigate to wishlist page
		Then user shoulb be able to naviagte back to homepage
		
	Scenario: Cart
		Given user is on AsPaints Homepage
		When user cli cks ob cart icon and should be able to see a popup window
		And user should be able click on start shopping
		Then user should be able to navigate back to the home page
		
	Scenario: HeaderHyperlinks
		Given user is on Aspaints homepage
		Then user be able to check functionality of hyperlinks present in header
		
		