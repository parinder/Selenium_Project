package Automate_Web_Elements;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_DropDown_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://spicejet.com/");

		Select s = new Select(driver.findElementByXPath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		s.selectByIndex(1);
		s.selectByVisibleText("USD");
		s.selectByValue("AED");

		Thread.sleep(3000);
		driver.close();

	}

}
