package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfWebPage {

	public static void main(String[] args) throws IOException, InterruptedException {
//		LocalDateTime systemTime = LocalDateTime.now();
//		String time = systemTime.toString().replace(":", "-");
		
		String time = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demoapp.skillrary.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File dest=new File("./screenshots/image"+time+".png");
		FileHandler.copy(temp, dest);
	}
}