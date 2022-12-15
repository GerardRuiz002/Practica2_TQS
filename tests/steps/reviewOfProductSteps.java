package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class reviewOfProductSteps {
	WebDriver driver;
	
	@Given("user in the index page to do review")
	public void userInTheIndexPegeToDoReview() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com");
	}
	
	
	@When("user clicks view product of one product")
	public void userClicksViewProductOfOneProduct() {
		driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
	}
	
	@When("in the review user fills in the name field putting name")
	public void inTheReviewUserFillsInTheNameFieldPuttingName() {
		driver.findElement(By.id("name")).sendKeys("Gerard");
	}
	
	@When("in the review user fills in the email field putting email")
	public void inTheReviewUserFillsInTheEmailFieldPuttingEmail() {
		driver.findElement(By.id("email")).sendKeys("gerardTQS@gmail.com");
	}
	
	@When("in the review user fills in the review fiels putting review")
	public void inTheReviewUserFillsInTheReviewFieldPuttingReview() {
		driver.findElement(By.id("review")).sendKeys("El Blue top es d'una llana molt fina");
	}
	
	@When("in the review user click in submit button")
	public void inTheReviewUserClickInSubmitButton() {
		driver.findElement(By.id("button-review")).click();
	}
}
