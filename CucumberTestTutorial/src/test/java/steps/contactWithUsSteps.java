package steps;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.name("submit"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
	}
	
	@When("user click ok in alert")
	public void userClickOkInAlert() {
		driver.switchTo().alert().accept();
	}
	
	@When("user wait seconds to click ok")
	public void userWaitSecondsToClickOk() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	@When("user add a file") 
	public void userAddAFile() {
		File file = new File("C:\\Users\\guill\\OneDrive\\Escriptori\\3r Carrera\\QS\\Eclipse workspace\\CucumberTestTutorial\\src\\test\\java\\FilesTest\\prova1.txt");
		String path = file.getAbsolutePath();
		driver.findElement(By.name("upload_file")).sendKeys(path);
	}
	
	@Then("successful contact with us")
	public void successfulContactWithUs() {
		String valorEsperat = driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]")).getText();
		Assert.assertTrue(valorEsperat.contains("Success! Your details have been submitted successfully."));
	}
	
	@Then("message completa este campo in email, contact with us") 
	public void messageCompletaEsteCampoInEmailContactWithUs() {
		WebElement nombreField = driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input"));
		String valorEsperat = nombreField.getAttribute("validationMessage");
		System.out.print(valorEsperat);
		Assert.assertTrue(valorEsperat.contains("Completa este campo"));
	}
	
	@Then("message completa este campo in name, contact with us") 
	public void messageCompletaEsteCampoInNomContactWithUs() {
		WebElement nombreField = driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input"));
		String valorEsperat = nombreField.getAttribute("validationMessage");
		System.out.print(valorEsperat);
		Assert.assertTrue(valorEsperat.contains("Completa este campo"));
	}
	
	@Then("message completa este campo in subject, contact with us") 
	public void messageCompletaEsteCampoInSubectContactWithUs() {
		WebElement nombreField = driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input"));
		String valorEsperat = nombreField.getAttribute("validationMessage");
		System.out.print(valorEsperat);
		Assert.assertTrue(valorEsperat.contains("Completa este campo"));
	}
	
	@Then("message completa este campo in messaje, contact with us") 
	public void messageCompletaEsteCampoInMessajeContactWithUs() {
		WebElement nombreField = driver.findElement(By.xpath("//*[@id=\"message\"]"));
		String valorEsperat = nombreField.getAttribute("validationMessage");
		System.out.print(valorEsperat);
		Assert.assertTrue(valorEsperat.contains("Completa este campo"));
	}
}
