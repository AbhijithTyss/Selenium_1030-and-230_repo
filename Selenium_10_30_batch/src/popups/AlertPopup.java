package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.switchTo().alert();
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		driver.findElement(By.linkText("Log in")).click();
		
		Alert alertPopup = driver.switchTo().alert();
		Thread.sleep(2000);
		String popupMsg = alertPopup.getText();
		System.out.println(popupMsg);
//		alertPopup.accept();
		alertPopup.dismiss();
	}

}
