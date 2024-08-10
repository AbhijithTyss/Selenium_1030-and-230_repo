package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectListbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/books");
		WebElement sortByDropdown = driver.findElement(By.id("products-orderby"));
		Select sortBySelect = new Select(sortByDropdown);
//		sortBySelect.selectByIndex(1);
//		sortBySelect.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
//		sortBySelect.selectByVisibleText("Name: Z to A");
		List<WebElement> allOptions = sortBySelect.getOptions();
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		System.out.println(sortBySelect.isMultiple());
	}
}