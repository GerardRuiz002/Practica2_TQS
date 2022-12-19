package steps;

import io.cucumber.java.en.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	
	@When("the user enters in the search bar putting je")  
	public void theUserEntersInTheSeatchBarPuttingJe() {
		driver.findElement(By.id("search_product")).sendKeys("je");
	}
	
	@When("the user enters in the search bar putting cucumber")  
	public void theUserEntersInTheSeatchBarPuttingCucumber() {
		driver.findElement(By.id("search_product")).sendKeys("cucumber");
	}
	
	@When("the user clicks the search button")  
	public void theUserClicksTheSeatchButton() {
		driver.findElement(By.id("submit_search")).click();
	}
	
	@When("the user closes the ad in search bar")
	public void theUserClosesTheAdInSearchBar() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var ads = document.getElementByClassName('adsbygoogle adsbygoogle-noablate');"
				+ "while(ads.length > 0) { "
				+ "ads[0].parentNode.removeChild(ads[0]);"
				+ "}");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));	
	}
	
	
	@Then("the product list appears")
	public void theDressListAppears() {
		String title = driver.findElement(By.className("feature_items")).getText();
		Assert.assertTrue(title.contains("SEARCHED PRODUCTS"));
	}
	
	@Then("the product list with nothing appears")
    public void theDressListWithNothingAppears() {
        String title = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2")).getText();
        Assert.assertTrue(title.contains("SEARCHED PRODUCTS"));
    }
	
	@Then("the product list appears with all products")
	public void theDressListAppearsWithAllProducts() {
		String title = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2")).getText();
		Assert.assertTrue(title.contains("ALL PRODUCTS"));
	}
	
	@Then("the product list with jeans appears")
	public void theDressListWithJeansAppears() {
		String title = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/p")).getText();
		Assert.assertTrue(title.contains("Soft Stretch Jeans"));
	}
}
