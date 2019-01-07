package Locator_Tests;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Rel_Abs_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElementByXPath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]").click(); //Absolute Xpath
		driver.findElementByXPath("//li[@id='tablist1-tab3']").click(); //Relative Path
		
		Thread.sleep(3000);
		driver.close();

	}

}
