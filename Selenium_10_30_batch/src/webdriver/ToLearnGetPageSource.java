package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		String source = driver.getPageSource();
		System.out.println(source);
	}
}
