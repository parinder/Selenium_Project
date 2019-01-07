package Automate_Web_Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript_Executor_Hidden_Element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://ksrtc.in/oprs-web/");
		driver.findElementById("fromPlaceName").click();
		driver.findElementById("fromPlaceName").sendKeys("BEN");
		driver.findElementById("fromPlaceName").sendKeys(Keys.DOWN);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String capture_text=(String) js.executeScript(script);
		
		while (!capture_text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT"))

		{
			driver.findElementById("fromPlaceName").sendKeys(Keys.DOWN);
			capture_text = (String) js.executeScript(script);
			System.out.println(capture_text);

		}
		Thread.sleep(3000);
		driver.close();

	}
}