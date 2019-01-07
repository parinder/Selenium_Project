package Exercise_Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_Counts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.gecko.driver", "/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver  driver=new FirefoxDriver();
		driver.get("http://qaclickacademy.com/practice.php/");
		
		int count_links= driver.findElements(By.tagName("a")).size();
		System.out.println("Total links in Webpage "+count_links);
		
		WebElement footer_Links=driver.findElementById("gf-BIG");
		int count_Flinks=footer_Links.findElements(By.tagName("a")).size();
		System.out.println("Total links in Webpage's Footer "+count_Flinks);
		
		
		WebElement Col_links= driver.findElementByXPath("//tr//td[1]//ul[1]");
		int count_Clinks= Col_links.findElements(By.tagName("a")).size();
		
		for(int i=0;i<count_Clinks;i++) {
			
			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			Col_links.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			
		}
		Thread.sleep(3000);
		
		Set<String> win_Ids=driver.getWindowHandles();
		Iterator<String> It=win_Ids.iterator();
		while(It.hasNext()) {
			driver.switchTo().window(It.next());
			System.out.println("Title of WebPage "+driver.getTitle());
		}

		Thread.sleep(3000);
		driver.quit();
	}

}
