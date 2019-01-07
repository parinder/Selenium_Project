package Automate_Web_Elements;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Validate_web_Element_makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElementByXPath("//label[@class='label_text flight-trip-type']").click();
		System.out.println(driver.findElementByXPath("//input[@id='hp-widget__return']").isDisplayed());
		driver.findElementByXPath("//label[contains(text(),'multi-city')]").click();
		System.out.println(driver.findElementByXPath("//input[@id='hp-widget__return']").isDisplayed());

		Thread.sleep(3000);
		driver.close();

	}

}
