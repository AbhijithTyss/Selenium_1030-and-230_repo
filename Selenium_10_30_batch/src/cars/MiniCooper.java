package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MiniCooper {
	@Test(groups = "system")
	public void launchMiniCooper() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.mini.in/en_IN/home.html");
		Reporter.log("MiniCooper launched successfully",true);
	}
}
