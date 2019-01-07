package Synchronization_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://www.ca.kayak.com/hotels/Toronto,ON,Canada-c11592/2019-04-19/2019-07-19/2adults?sort=rank_a");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@id='2846806-booking-bookButton']").click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();


	}

}
