package org.stefdefintion;

import org.pagefactory.LoginPage;
import org.utility.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageLogin {
	@Given("Browser launch")
	public void browser_launch() {
	   CommonMethods.browserLaunchChrome();
	   CommonMethods.loadUrl("https://www.facebook.com/");
	}

	@When("Enter user name and password")
	public void enter_user_name_and_password() {
	LoginPage locator = new LoginPage();
	CommonMethods.type(locator.getUsername(), "senthilbaskaran08@gmail.com");
	CommonMethods.type(locator.getPassword(), "sengi12345");
	}

	@Then("logout")
	public void logout() {
	 CommonMethods.closebrowser();
	}

}
