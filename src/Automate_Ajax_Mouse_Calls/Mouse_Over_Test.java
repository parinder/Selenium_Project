package Automate_Ajax_Mouse_Calls;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_Over_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElementByXPath("//*[@id='nav-link-accountList']")).build().perform();
		
		Thread.sleep(3000);
		driver.close();

	}

}
