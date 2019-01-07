package Locator_Tests;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Parent_Child_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElementByXPath("//div[@class='lst-c']/div/div/div/input").sendKeys("Parent_Child_Test");
		Thread.sleep(3000);
		driver.close();

	}

}
