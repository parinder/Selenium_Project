package Windows_Handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_To_Child_To_Parent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/parinder/Downloads/chromedriver_linux64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
        
		driver.findElementByXPath("//a[contains(text(),'Privacy')]").click();
		System.out.println("Before Switching to Child-window/tab");
		System.out.println(driver.getTitle());
		
		
		Set<String>Win_Ids= driver.getWindowHandles();
		Iterator<String>It=Win_Ids.iterator();
		String parent_win=It.next();
		String child_win=It.next();
		
		driver.switchTo().window(child_win);
		System.out.println("After Switching to Child-window/tab");
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parent_win);
		System.out.println("After Switching Back to Parent-window/tab");
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.quit();
	}

}
