package Basic_Selenium_Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

}
