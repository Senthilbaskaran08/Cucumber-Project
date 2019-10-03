package org.stepdefination.normal;

import org.pagefactory.LoginPage;
import org.utility.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	@Given("Browser launch")
	public void browser_launch() {
		CommonMethods.browserLaunchChrome();
	}

	@When("User is in homepage")
	public void user_is_in_homepage() {
		CommonMethods.loadUrl("https://www.facebook.com/");
	}

	@Then("user enter \"(.*)\" and \"(.*)\"")
	public void user_enter_and(String Username, String Password) {
		LoginPage locator = new LoginPage();
		CommonMethods.type(locator.getUsername(), Username);
		CommonMethods.type(locator.getPassword(), Password);
	   
	}

	@Then("Browser close")
	public void browser_close() {
		CommonMethods.closebrowser();
	}

}
