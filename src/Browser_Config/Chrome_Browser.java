package Browser_Config;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/parinder/Downloads/chromedriver_linux64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
