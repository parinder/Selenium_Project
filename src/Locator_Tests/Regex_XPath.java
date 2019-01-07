package Locator_Tests;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Regex_XPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElementByXPath("//input[@id='email']").sendKeys("I'm Email");
		driver.findElementByXPath("//input[@id='pass']").sendKeys("I'm Password");
		driver.findElementByXPath("//input[contains(@id,'u_')]").click();
	
		Thread.sleep(3000);
		driver.close();

	}

}
