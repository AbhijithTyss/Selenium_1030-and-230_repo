package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lamborghini {
	@Test(groups = "smoke")
	public void launchLamborghini() {
		WebDriver driver=new ChromeDriver();
		Assert.fail();
		driver.get("https://www.lamborghini.com/en-en");
		
		Reporter.log("Lamborghini launched successfully",true);
	}
}
