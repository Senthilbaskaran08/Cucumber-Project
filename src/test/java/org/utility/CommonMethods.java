package org.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {

	public static WebDriver driver;
	public static WebDriver browserLaunchChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Senthil B\\\\eclipse-workspace\\\\CucumberProject\\\\New Driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;	
	}
	
public static void buttonClick(WebElement element) {
element.click();
}

public static void type(WebElement element, String data) {
	element.sendKeys(data);
}

public static void loadUrl(String url) {
	driver.get(url);
}
public static void closebrowser() {
	driver.close();
}
}
