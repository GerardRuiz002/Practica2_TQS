package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cartSteps {
	WebDriver driver;
	
	@Given("user in the index page to add a product to cart")
	public void userInTheIndexPageToAddAProductToCart() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com");
	}
	
	@When("user clicks products section")
	public void userClicckProductSection() {
		driver.findElement(By.partialLinkText("Products")).click();
	}
	
	
	@When("user clicks add to cart")
	public void userClicksAddToCart() {
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a")).click();
	}
	
	@When("wait seconds")
	public void waitSeconds() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	@When("user go to cart")
	public void userGoToCart() {
		driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")).click();
	}
	
	@Then("the product added is in the list")
	public void theProductAddedIsInTheList() {
		String valorEsperat = driver.findElement(By.className("cart_description")).getText();
		Assert.assertTrue(valorEsperat.contains("Blue Top"));
	}
	
	@When("user delete product")
	public void userDeleteProduct() {
		driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[6]/a")).click();
	}
	
	@Then("void cart")
	public void voidCart() {
		String valorEsperat = driver.findElement(By.xpath("//*[@id=\"empty_cart\"]/p/b")).getText();
		Assert.assertTrue(valorEsperat.contains("Cart is empty!"));
	}
	
}
