package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		// passing data to username textfield
		WebElement usernameTF = driver.findElement(By.id("username"));
		usernameTF.clear();
		usernameTF.sendKeys("selenium");
		
		// passing data to password textfield
		WebElement passwordTF = driver.findElement(By.id("password"));
		passwordTF.clear();
		passwordTF.sendKeys("testing123");
		
		// clicking on signIn button
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		
		// capturing error message
		String errorMsg = driver.findElement(By.id("validationMessage")).getText();
		System.out.println(errorMsg);
	}
}