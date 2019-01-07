package Locator_Tests;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Sibling_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElementByXPath("//li[@id='tablist1-tab1']").click(); 
		driver.findElementByXPath("//li[@id='tablist1-tab1']/following-sibling::li[3]").click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
