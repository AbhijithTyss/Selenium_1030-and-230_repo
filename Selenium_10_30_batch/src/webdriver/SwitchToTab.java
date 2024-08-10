package webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author abhijith
 */
public class SwitchToTab {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String parentId = driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		
		switchToWindow(driver, "Facebook");
		String title = driver.getTitle();
		System.out.println(title);
		switchToWindow(driver, "demowebshop");
		driver.close();
	}
	/**
	 * 
	 * @param driver
	 * @param url
	 */
	public static void switchToWindow(WebDriver driver,String url) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			String actUrl=driver.switchTo().window(id).getCurrentUrl();
			if (actUrl.contains(url)) {
				break;
			}
		}
	}
}
