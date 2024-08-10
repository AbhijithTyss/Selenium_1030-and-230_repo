package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		SkillRaryPage skp=new SkillRaryPage(driver);
		skp.getSearchTextField().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(3000);
		skp.getSearchTextField().sendKeys("testng",Keys.ENTER);
		
//		 WebElement searchTF=driver.findElement(By.id("navbar-search-input"));
//		 searchTF.sendKeys("Selenium",Keys.ENTER);
//		 Thread.sleep(3000);
//		 searchTF.sendKeys("testng",Keys.ENTER);
		
	}

}
