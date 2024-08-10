package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackGroundImageColor {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		String backGround = driver.findElement(By.xpath("//button[text()='Sign in']")).getCssValue("background-image");
		System.out.println(backGround);
	}

}
