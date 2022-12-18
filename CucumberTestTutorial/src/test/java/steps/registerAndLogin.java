package steps;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class registerAndLogin {	
	
	WebDriver driver;
	
	@Given("the user is in the principal page")
	public void theUserIsInTheIndexPageRegisterLogin() {
		System.setProperty("webdriver.chromedriver","Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com");
	}
	
	
	//COMPROVACIO DEL REGISTER CORRECTE
	@When("the user clicks the Signup_login button")
	public void theUserClicksOnSignUpLoginButton() {
		driver.findElement(By.partialLinkText("Signup / Login")).click();  
	}
	
	@When("^the user enters (.*) in the name of New user signup")  
	public void theUserEntersNameOnNewUserSignup(String nom) {
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys(nom);  
	}
	
	@When("^the user enters (.*) in the Email address of New user signup")
	public void theUserEntersEmailOnNewUserSignup(String mail) {
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(mail);
	}
	
	
	@When("the user clicks the signup button")
	public void theUserClicksOnSignUpButton() {
		driver.findElement(By.xpath("//button[contains(.,'Signup')]")).click(); 
	}	
	
	
	@When("the user clicks the gender1 button")
	public void the_user_clicks_on_the_gender1_button(){
		driver.findElement(By.id("id_gender1")).click();
	}
	
	@When("^the user enters (.*) in the password field")
	public void theUserEntersPasswordInPasswordField(String password) {
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(password);
	}
	
	
	@When("the user clicks on the day of Date_of_Birth")
	public void the_user_clicks_on_the_day_of_date_of_birth() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.id("days"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
		driver.findElement(By.xpath("//select/option[text()='3']")).click();
	}
	
	@When("the user clicks on the month of Date_of_Birth")
	public void the_user_clicks_on_the_month_of_date_of_birth() {
		driver.findElement(By.id("months")).click();
		driver.findElement(By.xpath("//select/option[text()='October']")).click();
	}
	
	@When("the user clicks on the year of Date_of_Birth")
	public void the_user_clicks_on_the_year_of_date_of_birth() {
		driver.findElement(By.id("years")).click();
		driver.findElement(By.xpath("//select/option[text()='2002']")).click();
	}	
	
	@When("^the user enters (.*) on the first_name field")
	public void theUserEntersFirstNameField(String FirstName) {
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(FirstName);
	}
	
	@When("^the user enters (.*) on the last_name field")
	public void theUserEntersLastNameField(String LastName) {
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(LastName);
	}	
	
	@When("^the user enters (.*) on the address field")
	public void theUserEntersAddressField(String Address) {
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(Address.toString());
	}	
	
	@When("the user clicks on the Country field")
	public void the_user_clicks_on_the_Country_button() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("country"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		driver.findElement(By.xpath("//select/option[text()='United States']")).click();
	}		
	
	@When("^the user enters (.*) on the state field")
	public void theUserEntersStateField(String State) {
		driver.findElement(By.xpath("//input[contains(@id,'state')]")).sendKeys(State);
	}
	
	@When("^the user enters (.*) on the city field")
	public void theUserEntersCityField(String City) {
		driver.findElement(By.xpath("//input[contains(@id,'city')]")).sendKeys(City);
	}
	
	@When("^the user enters (.*) on the zipcode field")
	public void theUserEntersZipCodeField(String Zipcode) {
		driver.findElement(By.xpath("//input[contains(@id,'zipcode')]")).sendKeys(Zipcode);
	}
	
	@When("^the user enters (.*) on the mobileNumber field")
	public void theUserEntersMobileNumberField(String mobileNumber) {
		driver.findElement(By.xpath("//input[contains(@id,'mobile_number')]")).sendKeys(mobileNumber);
	}
	
	
	@When("the user clicks on CreateAccount button")
	public void the_user_clicks_on_the_CreateAccount_button() {
		driver.findElement(By.xpath("//button[contains(@data-qa,'create-account')]")).click();
		
	}	
	
	@Then("the account is created")
	public void theCreatedAccountMessageIsVisible() {
		String message = driver.findElement(By.xpath("//b[contains(.,'Account Created!')]")).getText();
		Assert.assertTrue(message.contains("ACCOUNT CREATED!"));
	}			
	
	
	@When("the user clicks continueButton")
	public void the_user_clicks_on_the_Continue_button() {
		driver.findElement(By.xpath("//a[@href='/'][contains(.,'Continue')]")).click();
	}
	
	@When("the user clicks delateAccountButton")
	public void the_user_clicks_on_delate_button() {
		driver.findElement(By.xpath("//a[@href='/delete_account'][contains(.,'Delete Account')]")).click();
	}
	
	
	@When("the user clicks continue2Button")
	public void the_user_clicks_on_the_Continue2_button() {
		driver.findElement(By.xpath("//a[@href='/'][contains(.,'Continue')]")).click();
	}
	
	@Then("the account is delated")
	public void delatedAccountMessageIsVisible() {
		String message = driver.findElement(By.xpath("//b[contains(.,'Account Deleted!')]")).getText();
		Assert.assertTrue(message.contains("ACCOUNT DELETED!"));
	}		
	
	@When("delete addCruz if visible")
	public void the_user_deletes_the_add() {
		try {
			WebElement adElement = driver.findElement(By.id("dismiss-button"));
			
			if(adElement.isDisplayed()) {
				adElement.click();
			}
		
		}catch (NoSuchElementException e) {
			
		}
	}	
	
	@When("delete addCerrar if visible")
	public void the_user_deletes_the_Cerrar_add() {
		try {
			WebElement adElement = driver.findElement(By.className("ns-b6cq3-e-17"));
			
			if(adElement.isDisplayed()) {
				adElement.click();
			}
		
		}catch (NoSuchElementException e) {
			
		}
	}	
	
	
	@Then("the account cant be created because of empty password")  
	public void check_obligatory_password_required() {
		WebElement nombreField = driver.findElement(By.id("password"));
		String valorEsperat = nombreField.getAttribute("validationMessage");
		System.out.print(valorEsperat);
		Assert.assertTrue(valorEsperat.contains("Completa este campo"));
	}	
	
	//COMPROVACIO DEL LOGIN  CORRECTE
	@When("^the user enters (.*) in the Email address of Login to your account")
	public void theUserEntersEmailOnLoginToYourAccount(String mail) {
		driver.findElement(By.xpath("//input[contains(@data-qa,'login-email')]")).sendKeys(mail);
	}	
	
	@When("^the user enters (.*) in the login password field")
	public void theUserEntersPasswordOnLoginToYourAccount(String mail) {
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(mail);
	}	
	
	@When("the user clicks the Login button")
	public void the_user_clicks_on_the_Login_button() {
		driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]")).click();
	}
	
	@Then("the user cant Login")
	public void usuariIConstrasenyaIncorrectes() {
		String message = driver.findElement(By.xpath("//p[contains(.,'Your email or password is incorrect!')]")).getText();
		Assert.assertTrue(message.contains("Your email or password is incorrect!"));
	}	
	
	@Then("the user can Login")
	public void usuariIConstrasenyaCorrectes() {
		String message = driver.findElement(By.xpath("//a[@href='/logout'][contains(.,'Logout')]")).getText();
		Assert.assertTrue(message.contains("Logout"));
	}	
	
	//And 
	@When("the user logs out")
	public void usuariTancaSessio() {
		WebElement logout = driver.findElement(By.xpath("//a[@href='/logout'][contains(.,'Logout')]"));
		logout.click();
	}	
	
}
