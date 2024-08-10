package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement computersLink = driver.findElement(By.partialLinkText("COMPUTERS"));
		Actions act=new Actions(driver);
		act.moveToElement(computersLink).perform();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Desktops")).click();
	}

}
