package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("www.flipkart.com/")) {
			System.out.println("user navigated successfully");
		}else {
			System.out.println("user failed to navigate");
		}
	}
}