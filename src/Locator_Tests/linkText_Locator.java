package Locator_Tests;


import org.openqa.selenium.firefox.FirefoxDriver;

public class linkText_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElementByLinkText("Forgot account?").click();
		Thread.sleep(3000);
		driver.close();

	}

}
