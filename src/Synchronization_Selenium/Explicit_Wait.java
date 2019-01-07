package Synchronization_Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://www.ca.kayak.com/hotels/Toronto,ON,Canada-c11592/2019-04-19/2019-07-19/2adults?sort=rank_a");
		WebDriverWait delay=new WebDriverWait(driver,10);
		delay.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='3630985-booking-bookButton']")));
		driver.findElementByXPath("//button[@id='3630985-booking-bookButton']").click();

		
		Thread.sleep(3000);
		driver.close();
		driver.quit();


	}

}
