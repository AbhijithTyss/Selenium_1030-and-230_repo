package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryPage {
	//initialization
	public SkillRaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration
	@FindBy(id = "navbar-search-input")
	private WebElement searchTextField;
	
	//getters
	public WebElement getSearchTextField() {
		return searchTextField;
	}
}
