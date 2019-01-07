package IFrame_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class IFrame_DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",
				"/home/parinder/Downloads/geckodriver-v0.22.0-linux64/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		int Count = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Enter to frame");
		
		driver.switchTo().frame(driver.findElementByXPath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElementById("draggable");
		WebElement target = driver.findElementById("droppable");
		a.dragAndDrop(source, target).build().perform();
		
		
		driver.switchTo().defaultContent();
		System.out.println("Back from frame");
		
		Thread.sleep(3000);
		driver.close();

	}

}
