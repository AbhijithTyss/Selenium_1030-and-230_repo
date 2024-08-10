package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--disable-notifications");
		option.addArguments("--incognito");
		option.addArguments("--start-maximized");
		
		WebDriver driver=new ChromeDriver(option);
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.redbus.in/");
	}

}
