  package Automate_Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Java {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		String alert_Msg = driver.switchTo().alert().getText();
		System.out.println(alert_Msg);
		driver.switchTo().alert().accept();

		Thread.sleep(3000);
		driver.close();

	}

}
