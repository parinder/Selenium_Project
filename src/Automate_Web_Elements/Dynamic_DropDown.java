package Automate_Web_Elements;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Dynamic_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://spicejet.com/");
		driver.findElementById("divpaxinfo").click();
		
		int i=1;
		while(i<5)
		{
			driver.findElementByXPath("//span[@id='hrefIncAdt']").click();
			i++;
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
