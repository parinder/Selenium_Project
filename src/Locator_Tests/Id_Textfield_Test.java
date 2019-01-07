package Locator_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Id_Textfield_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("I'm Id Locator Test");
		driver.close();

	}

}
