package org.stepdef.list;

import java.util.List;
import java.util.Map;

import org.pagefactory.LoginPage;
import org.utility.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDef {
	@Given("browser launch")
	public void browser_launch() {
		
			CommonMethods.browserLaunchChrome();
	}
	@When("home page")
	public void home_page() {
		CommonMethods.loadUrl("https://www.facebook.com/");
	}

	@Then("User enter username and password")
	public void user_enter_username_and_password(DataTable credentials) {
	    List<List<String>> data = credentials.asLists();
	    LoginPage locator = new LoginPage();
	    CommonMethods.type(locator.getUsername(), data.get(0).get(0));
	    CommonMethods.type(locator.getPassword(), data.get(0).get(1));
	}

	@Then("Enters Firstname and Surname")
	public void enters_Firstname_and_Surname(DataTable details) {
		LoginPage locator = new LoginPage();
		for(Map<Object, Object> data:details.asMaps(String.class, String.class)) {
			CommonMethods.type(locator.getFirstname(), (String) data.get("Firstname"));
			CommonMethods.type(locator.getSurname(), (String) data.get("Lastname"));
		}
	}
	@Then("Close the browser")
	public void Close_the_browser() {
		CommonMethods.closebrowser();
	}
}
