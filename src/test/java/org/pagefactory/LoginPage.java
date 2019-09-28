package org.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.CommonMethods;

public class LoginPage extends CommonMethods {
public LoginPage() {
	PageFactory.initElements(driver, this);
}
@FindBy(id ="email")
private WebElement username;
@FindBy(id = "pass")
private WebElement password;
@FindBy(id ="u_0_4")
private WebElement submit;
public WebElement getSubmit() {
	return submit;
}
public void setSubmit(WebElement submit) {
	this.submit = submit;
}
public WebElement getUsername() {
	return username;
}
public void setUsername(WebElement username) {
	this.username = username;
}
public WebElement getPassword() {
	return password;
}
public void setPassword(WebElement password) {
	this.password = password;
}
}
