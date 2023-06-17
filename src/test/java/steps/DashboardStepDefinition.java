package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.TestBase;

public class DashboardStepDefinition extends TestBase{
	DashboardPage dashboardPage;
	
	@Before
	public void beforeRunner() {
		initDriver();
		driver.get("https://techfios.com/test/107");
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}
	
	@Given("{string} button exists")
	public void button_exists(String button_type) {
		if(button_type.equalsIgnoreCase("Set SkyBlue Background")) {
			Assert.assertTrue(dashboardPage.validateBlueButton());
			dashboardPage.clickOnSkyBlueButtonElement();
		} else if(button_type.equalsIgnoreCase("Set White Background")) {
			Assert.assertTrue(dashboardPage.validateWhiteButton());
			dashboardPage.clickOnSkyWhiteButtonElement();
		}else {
			System.out.println("Sorry please check the string" + button_type);
		}
		
	}
	@When("I click on the button")
	public void i_click_on_the_button() {
		
	}
	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
	    
	}

	@Then("the background color will change to white")
	public void the_background_color_will_change_to_white() {
	    
	}

	
}
