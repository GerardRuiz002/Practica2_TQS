package steps;

import io.cucumber.java.en.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.id("search_product"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.sendKeys("jeans");
	}
	
	@When("the user enters in the search bar putting je")  
	public void theUserEntersInTheSeatchBarPuttingJe() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.id("search_product"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.sendKeys("je");
	}
	
	@When("the user enters in the search bar putting cucumber")  
	public void theUserEntersInTheSeatchBarPuttingCucumber() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.id("search_product"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.sendKeys("cucumber");
	}
	
	@When("the user clicks the search button")  
	public void theUserClicksTheSeatchButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.id("submit_search"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
	}
	
	@Then("the product list appears")
	public void theDressListAppears() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.className("feature_items"));
		String title = driver.findElement(By.className("feature_items")).getText();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Assert.assertTrue(title.contains("SEARCHED PRODUCTS"));
	}
	
	@Then("the product list with jeans appears")
	public void theDressListWithJeansAppears() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/p"));
		String title = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/p")).getText();
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Assert.assertTrue(title.contains("Soft Stretch Jeans"));
	}
	
	@When("checkExternAd if visible on search")
	public void checkExternAd_if_visible() {
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("var ads = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate');"
		                + "while(ads.length > 0) {"
		                + "  ads[0].parentNode.removeChild(ads[0]);"
		                + "}");
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
	}
	
	@When("wait one second on search") 
	public void waitOneSecond_on_search() throws InterruptedException {
		Thread.sleep(3000);
	}
}
