package Locator_Tests;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Child_To_Parent_XPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElementByXPath("//li[@id='tablist1-tab1']").click(); 
		driver.findElementByXPath("//li[@id='tablist1-tab1']/following-sibling::li[3]").click();
		System.out.println(driver.findElementByXPath("//li[@id='tablist1-tab1']/parent::ul").getAttribute("role"));
		
		Thread.sleep(3000);
		driver.close();

	}

}
