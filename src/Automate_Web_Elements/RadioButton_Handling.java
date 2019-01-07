package Automate_Web_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RadioButton_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElementByXPath("//input[@value='radio1']").click();
		driver.findElementByXPath("//input[@value='radio2']").click();
		driver.findElementByXPath("//input[@value='radio3']").click();
		
		driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
		int count = driver.findElements(By.xpath("//input[@type='radio']")).size();
		
		for(int i=0;i<count;i++) {
			driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value"));
		}
		Thread.sleep(3000);
		driver.close();

	}

}
