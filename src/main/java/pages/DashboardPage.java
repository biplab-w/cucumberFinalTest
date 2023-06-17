package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElements
	@FindBy(how=How.CSS, using="button[onClick='myFunctionSky()']") WebElement SKY_BLUE_BUTTON_ELEM;
	@FindBy(how=How.CSS, using="button[onClick='myFunctionWhite()']") WebElement SKY_WHITE_BUTTON_ELEM;

	//interactable methods
	public void clickOnSkyBlueButtonElement() {
		SKY_BLUE_BUTTON_ELEM.click();
	}
	
	public void clickOnSkyWhiteButtonElement() {
		SKY_WHITE_BUTTON_ELEM.click();
	}
	
	public boolean validateBlueButton() {
		return SKY_BLUE_BUTTON_ELEM.isDisplayed();
	}
	
	public boolean validateWhiteButton() {
		return SKY_WHITE_BUTTON_ELEM.isDisplayed();
	}
}
