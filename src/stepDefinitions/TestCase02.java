package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCase02 
{

	@When("^user selects (.*) from to port$")
	
	public void selectDropdown(String countryName)
	{
		AbstractStepDefination.driver.findElement(By.xpath("//select[@name='toPort']"+"/option[@value='"+countryName+"']")).click();
	}
	
	@Then("^paris should be selected in to port option$")
	public void verifyDropDown()
	{
				
		//Assert.assertEquals(AbstractStepDefination.driver.findElement(By.xpath("//option[contains(text(),'Paris')]")), "Paris");
		//Assert.assertEquals();
	}
}
