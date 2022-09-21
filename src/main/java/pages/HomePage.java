package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) { // constructor generate by source file.
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchbox;

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	WebElement logo;

	public void searchboxfield() {
		searchbox.click();

	}
}
