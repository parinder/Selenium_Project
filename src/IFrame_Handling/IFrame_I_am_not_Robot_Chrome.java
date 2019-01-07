package IFrame_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrame_I_am_not_Robot_Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://www.textnow.com/signup");
		Thread.sleep(2000);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/div[1]/div[3]/div/div[2]/div/div/iframe"));
		driver.findElementByClassName("recaptcha-checkbox-checkmark").click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElementByXPath("/html/body/div[3]/div[4]/iframe"));
		
		Thread.sleep(3000);
		driver.close();

	}

}
