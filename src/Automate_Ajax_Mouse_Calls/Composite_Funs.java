package Automate_Ajax_Mouse_Calls;


import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Composite_Funs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElementByXPath("//input[@id='twotabsearchtextbox']")).click().keyDown(Keys.SHIFT)
				.sendKeys("bra for teen").doubleClick().contextClick().build().perform();

		Thread.sleep(3000);
		driver.close();

	}

}
