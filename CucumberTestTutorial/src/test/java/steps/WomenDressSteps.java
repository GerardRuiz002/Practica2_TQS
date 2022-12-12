package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WomenDressSteps {
	
	
	WebDriver driver;
	
	@Given("the user is in the index page")
	public void theUserIsInTheIndexPage() {
		System.setProperty("webdriver.chromedriver","Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com");
	}
	
	@When("the user clicks the product options")
	public void theUserClicksOnProductOptions() {
		driver.findElement(By.partialLinkText("Products")).click();
	}
	
	@When("^the user enters (.*) in the search bar")
	public void theUserEntersDressInTheSearchBar(String article) {
		driver.findElement(By.id("search_product")).sendKeys(article);
	}
	
	@When("the user clicks the search button")
	public void theUserClicksTheSearchBarButton() {
		driver.findElement(By.id("submit_search")).click();
	}
	
	@Then("^the (.*) list appears")
	public void theDressListAppears() {
		String title = driver.findElement(By.className("features_items")).getText();
		Assert.assertTrue(title.contains("SEARCHED PRODUCTES"));
	}
}
