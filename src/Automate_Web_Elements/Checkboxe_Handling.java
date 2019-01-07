package Automate_Web_Elements;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Checkboxe_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://spicejet.com/");
		System.out.println(driver.findElementById("ctl00_mainContent_chk_friendsandfamily").isSelected());
		driver.findElementById("ctl00_mainContent_chk_friendsandfamily").click();
		System.out.println(driver.findElementById("ctl00_mainContent_chk_friendsandfamily").isSelected());
		
		Thread.sleep(3000);
		driver.close();

	}

}
