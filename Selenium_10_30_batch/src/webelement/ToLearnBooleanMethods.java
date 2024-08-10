package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("====before sending data=====");
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
		
		driver.findElement(By.name("username")).sendKeys("selenium");
		driver.findElement(By.name("password")).sendKeys("test@1234");
		
		System.out.println("====after sending data=====");
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
		
		loginButton.click();
	}

}
