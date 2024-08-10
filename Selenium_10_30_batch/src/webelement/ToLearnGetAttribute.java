package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://demowebshop.tricentis.com/");
//		String attributeValue = driver.findElement(By.xpath("//input[@value='Search']")).getAttribute("class");
//		System.out.println(attributeValue);
		
		driver.get("https://www.flipkart.com/");
		String toolTipText = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]")).getAttribute("title");
		System.out.println(toolTipText);
	}

}
