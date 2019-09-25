package org.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Senthil B\\eclipse-workspace\\CucumberProject\\New Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}

}
