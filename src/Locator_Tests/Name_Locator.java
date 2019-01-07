package Locator_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Name_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("I'm Email");
		driver.findElementByName("pass").sendKeys("I'm Password");
		Thread.sleep(3000);
		driver.close();

	}

}
