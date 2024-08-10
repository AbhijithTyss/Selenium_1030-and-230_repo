package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGet {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals(" Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			System.out.println("User navigated successfully");
		}else {
			System.out.println("User failed to navigate");
		}
	}
}