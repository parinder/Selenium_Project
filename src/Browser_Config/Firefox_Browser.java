package Browser_Config;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

	}

}
