package Locator_Tests;


import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleValues_Scan {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElementByClassName("inputtext").sendKeys("Email - I'm scan first");
		driver.findElementByClassName("inputtext").sendKeys("Password - I'm scan first");
		Thread.sleep(3000);
		driver.close();

	}

}
