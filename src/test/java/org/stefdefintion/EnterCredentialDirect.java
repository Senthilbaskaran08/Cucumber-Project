package org.stefdefintion;

import org.pagefactory.LoginPage;
import org.utility.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnterCredentialDirect {
	@Given("Login url")
	public void login_url() {
		CommonMethods.browserLaunchChrome();
		CommonMethods.loadUrl("https://www.facebook.com/");
	}

	@When("User enter {Username} and {Password} and click login button")
	public void user_enter_and_and_click_login_button(String Username, String Password) {
		LoginPage locator = new LoginPage();
		CommonMethods.type(locator.getUsername(), Username);
		CommonMethods.type(locator.getPassword(), Password);
	}

	@Then("close the browser")
	public void close_the_browser() {
	CommonMethods.closebrowser();
	}
}
