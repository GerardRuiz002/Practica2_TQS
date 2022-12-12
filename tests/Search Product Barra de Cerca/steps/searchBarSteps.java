package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchBarSteps {
WebDriver driver;
	
	@Given("the user is in the index page")
	public void theUserIsInTheIndexPage() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com");
	}
	
	@When("the user clicks the products option")  
	public void theUserClicksTheProductsOption() {
		driver.findElement(By.partialLinkText("Products")).click();
	}
	
	@When("the user enters in the search bar putting jeans")  
	public void theUserEntersInTheSeatchBarPuttingPants() {
		driver.findElement(By.id("search_product")).sendKeys("jeans");
	}
	
	@When("the user enters in the search bar putting cucumber")  
	public void theUserEntersInTheSeatchBarPuttingCucumber() {
		driver.findElement(By.id("search_product")).sendKeys("cucumber");
	}
	
	@When("the user clicks the search button")  
	public void theUserClicksTheSeatchButton() {
		driver.findElement(By.id("submit_search")).click();
	}
	
	@Then("the product list appears")
	public void theDressListAppears() {
		String title = driver.findElement(By.className("feature_items")).getText();
		Assert.assertTrue(title.contains("SEARCHED PRODUCTS"));
	}
}
