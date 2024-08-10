package webdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/8");	
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String id:allWindowIds) {
			String url = driver.switchTo().window(id).getCurrentUrl();
			System.out.println(url);
			if (url.contains("amazon")) {
				driver.manage().window().maximize();
				driver.close();
			}
		}
	}
}