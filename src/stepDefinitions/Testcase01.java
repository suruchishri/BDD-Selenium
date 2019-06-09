package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Testcase01 
{

	@When("^user selects oneway radio$")
	public void SelectRadios()
	{
		AbstractStepDefination.driver.findElement(By.xpath("//input[@value='oneway']")).click();
	}
	
	@Then("^only one way radio button should be selected$")
	public void verifyRadio()
	{
		Assert.assertTrue(AbstractStepDefination.driver.findElement(By.xpath("//input[@value='roundtrip']")).isSelected());
	}
}

