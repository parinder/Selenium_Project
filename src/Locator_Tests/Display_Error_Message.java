package Locator_Tests;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Display_Error_Message {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElementByCssSelector("#email").sendKeys("I'm email");
		driver.findElementByCssSelector("#pass").sendKeys("I'm Password");
		driver.findElementByCssSelector("#loginbutton").click();
		System.out.println(driver.findElementByXPath("/html/body/div[1]/div[3]/div[3]/div/div/div").getText());
	
		Thread.sleep(3000);
		driver.close();

	}

}
