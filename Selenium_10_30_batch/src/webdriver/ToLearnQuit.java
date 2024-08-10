package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnQuit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.shoppersstack.com/products_page/8");
		Thread.sleep(40000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(2000);
		driver.quit();
//		driver.close();
	}

}
