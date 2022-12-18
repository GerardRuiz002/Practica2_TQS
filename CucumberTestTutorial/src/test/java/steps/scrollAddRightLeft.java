package steps;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.Thread;
import java.time.Duration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class scrollAddRightLeft  {
	WebDriver driver;
	
	@Given("the user is in the principal page ready to scroll")
	public void theUserIsInTheIndexPageRegisterLogin() {
		System.setProperty("webdriver.chromedriver","Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com");
	}	
	
	@When("the user clicks the scrollLeft button")
	public void theUserClicksOnScrollLeftButton() {
		driver.findElement(By.xpath("(//i[contains(@class,'fa fa-angle-left')])[1]")).click(); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		WebElement lastImage = driver.findElement(By.xpath("//img[@src='/static/images/home/girl3.jpg']"));
		Assert.assertTrue(lastImage.isDisplayed());	 
		
	}
	
	@When("the user clicks the scrollRight button")
	public void theUserClicksOnScrollRightButton() {
		driver.findElement(By.xpath("(//i[contains(@class,'fa fa-angle-right')])[1]")).click(); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement secondImage = driver.findElement(By.xpath("//img[@src='/static/images/home/girl2.jpg']"));
		Assert.assertTrue(secondImage.isDisplayed());	 
		
	}	
}