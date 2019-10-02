package org.stefdefintion;

import org.pagefactory.LoginPage;
import org.utility.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SenarioOutline {
	@Given("^Browser launch$")
	public void Browser_lunch() {
		CommonMethods.browserLaunchChrome();
	}
	@When("^Homepage$")
	public void Home_page() {
	CommonMethods.loadUrl("https://www.facebook.com/");
	}
	
	
	@Then("^User enter \"(.*)\" and \"(.*)\" and click login button$")
	public void User_enter_Username_and_Password_and_click_login_button(String Username, String Password) {
	LoginPage locator = new LoginPage();
	CommonMethods.type(locator.getUsername(), Username);
	CommonMethods.type(locator.getPassword(), Password);
	}
	@Then("^Close the browser$")
	public void Close_the_browser() {
	CommonMethods.closebrowser();
	}
	
}
