package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class contactWithUsSteps {
	WebDriver driver;
	
	@Given("user in the index page")
	public void userInTheIndexPage() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com");
	}
	
	@When("user clicks the contact us option")
	public void userClicksTheContactUsOption() {
		driver.findElement(By.partialLinkText("Contact us")).click();
	}
	
	@When("user fills in the name field putting name")
	public void userFillsInTheNameFieldPuttingName() {
		driver.findElement(By.name("name")).sendKeys("Gerard");
	}
	
	@When("user fills in the email field putting email")
	public void userFillsInTheEmailFieldPuttingEmail() {
		driver.findElement(By.name("email")).sendKeys("gerardTQS@gmail.com");
	}
	
	@When("user fills in the subject field putting subject")
	public void userFillsInTheSubjectFieldPuttingSubject() {
		driver.findElement(By.name("subject")).sendKeys("Pregunta sobre preu");
	}
	
	@When("user fills in the message fiels putting message")
	public void userFillsInTheMessageFieldPuttingMessage() {
		driver.findElement(By.name("message")).sendKeys("Quin es el preu de la samarreta vermella?");
	}
	
	@When("user click in submit button")
	public void userClickInSubmitButton() {
		driver.findElement(By.name("submit")).click();
	}
	
	@When("user click ok in alert")
	public void userClickOkInAlert() {
		driver.switchTo().alert().accept();
	}
	
	@When("user wait seconds to click ok")
	public void userWaitSecondsToClickOk() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	@Then("successful contact with us")
	public void successfulContactWithUs() {
		String valorEsperat = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]")).getText();
		Assert.assertTrue(valorEsperat.contains("Success! Your details have been submitted successfully."));
	}
}
