package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {

	public static void main(String[] args) {
		ChromeDriver driver	=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More")) {
			System.out.println("user navigated successfully");
		}else {
			System.out.println("User failed to navigate");
		}
	}
}