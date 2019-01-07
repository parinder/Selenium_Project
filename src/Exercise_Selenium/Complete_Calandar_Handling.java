package Exercise_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Complete_Calandar_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/parinder/Downloads/chromedriver_linux64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");

		// SELECT DATE: 31-Jan-2019

		driver.findElementByXPath("//input[@id='travel_date']").click();

		driver.findElementByCssSelector("[class='datepicker-days'] th[class='datepicker-switch']").click();
		
		driver.findElementByCssSelector("[class='datepicker-months'] th[class='datepicker-switch']").click();
		
		driver.findElementByCssSelector("[class='datepicker-years'] th[class='datepicker-switch']").click();
		
		int Count_Years = driver.findElements(By.className("year")).size();
		int Count_Months = driver.findElements(By.className("month")).size();
		int Count_Days = driver.findElements(By.className("day")).size();

		for (int i = 0; i<Count_Years; i++) {
			String year_select = driver.findElements(By.className("year")).get(i).getText();
			if (year_select.equalsIgnoreCase("2019")) {
				driver.findElements(By.className("year")).get(i).click();
				for (int j = 0; j<Count_Months; j++) {
					String Month_Select = driver.findElements(By.className("month")).get(j).getText();
					if (Month_Select.equalsIgnoreCase("Jan")) {
						driver.findElements(By.className("month")).get(j).click();
						for (int k = 0; k<Count_Days; k++) {
							String Day_Select = driver.findElements(By.className("day")).get(k).getText();
							if (Day_Select.equalsIgnoreCase("31")) {
								driver.findElements(By.className("day")).get(k).click();
								break;
							}
						}
						
					  }
					
				}

			}

		}
		Thread.sleep(3000);
		driver.quit();
	}
}
