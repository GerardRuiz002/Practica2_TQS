package steps;

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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
	}
	
	@When("wait seconds")
	public void waitSeconds() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	@When("user go to cart")
	public void userGoToCart() {
		driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")).click();
	}
	
	@When("user clicks continue shopping") 
	public void userClicksContunueShupping() {
		driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
	}
	
	@When("user clicks view product to add cart")
	public void userClicksViewProductToAddCart() {
		driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
	}
	
	@When("user add quantity")
	public void userAddQuantity() {
		driver.findElement(By.id("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("2");
	}
	
	@When("user add to cart product with quantity")
	public void userAddToCartProductWithQuantity() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
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
	
	@Then("the product with quantity added in the list")
	public void theProductWithQuantityAddedInTheList() {
		String valorEsperat1 = driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[2]/h4/a")).getText();
		Assert.assertTrue(valorEsperat1.contains("Blue Top"));
		
		String valorEsperat2 = driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[4]/button")).getText();
		Assert.assertTrue(valorEsperat2.contains("2"));
	}
	
	@When("checkExternAd if visible on cart")
	public void checkExternAd_if_visible_on_cart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("var ads = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate');"
		                + "while(ads.length > 0) {"
		                + "  ads[0].parentNode.removeChild(ads[0]);"
		                + "}");
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
		
	}
	
}
