package Exercise_Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookie_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize(); //Maximize the size of window
		
		//Delete Cookie
		driver.manage().deleteAllCookies();
		
		//Delete Particular Cookie
		driver.manage().deleteCookieNamed("google");
		
		driver.get("https://www.google.com/");
	}

}
