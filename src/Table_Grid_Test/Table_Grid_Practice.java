package Table_Grid_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table_Grid_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/21207/pak-vs-aus-1st-t20i-australia-v-pakistan-in-uae-2018");

		Thread.sleep(3000);

		WebElement table_one = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowCount = table_one.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println("Number Of Rows: " + rowCount);

		int eleColCount = table_one
				.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		System.out.println("Number Of Elements 3rd Columns Rows: " + eleColCount);

		for (int i = 0; i < eleColCount - 2; i++) {
			System.out.println(table_one
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText());

		}
		Thread.sleep(3000);
		driver.quit();
	}

}
