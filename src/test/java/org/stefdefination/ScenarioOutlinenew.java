package org.stefdefination;

import org.pagefactory.LoginPage;
import org.utility.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlinenew {

@Given("Browser launch")
public void browser_launch() {
	 
			CommonMethods.browserLaunchChrome();
		

}

@When("Home page")
public void home_page() {
	CommonMethods.loadUrl("https://www.facebook.com/");
}

@Then("User enter {string} and {string} and click login button")
public void user_enter_and_and_click_login_button(String Username, String Password) {
	LoginPage locator = new LoginPage();
	CommonMethods.type(locator.getUsername(), Username);
	CommonMethods.type(locator.getPassword(), Password);
}

@Then("Close the browser")
public void close_the_browser() {
	CommonMethods.closebrowser();
}
}
