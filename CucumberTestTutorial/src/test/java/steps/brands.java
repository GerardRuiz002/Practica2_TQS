package steps;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class brands {
	
WebDriver driver;
	
	@Given("the user is in the principal page ready to use the brand section")
	public void theUserIsInTheIndexPageBrands() {
		System.setProperty("webdriver.chromedriver","Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com");
	}
	
	//control d'anuncis amb creu
	@When("delete addCruz if visible on brand")
	public void the_user_deletes_the_add_on_brand() {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		try {
			WebElement adElement = driver.findElement(By.id("dismiss-button"));
			
			if(adElement.isDisplayed()) {
				adElement.click();
			}		
		}catch (NoSuchElementException e) {
			
		}
	}	
	
	//class: ns-e704n-e-6 close-button
	//control d anuncis amb cerrar    
	@When("delete addCerrar if visible on brand")
	public void the_user_deletes_the_Cerrar_add_on_brand() {
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("dimiss-button")));
		WebElement closeButton = driver.findElement(By.cssSelector("dimiss-button"));
		closeButton.click();*/		
		
		try {  //(By.cssSelector("div[class^=ns][class$=16]"));
			//WebElement closeButton = driver.findElement(By.id("dismiss-button"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement closeButton = driver.findElement(By.xpath("//div[@id, 'dismiss')]"));
			/*WebElement adElement = driver.findElement(By.className("ns-e704n-e-6 close-button"));
			WebElement adElement2 = driver.findElement(By.className("ns-zllwu-e-16 button-common close-button"));
			WebElement adElement3 = driver.findElement(By.className("ns-1jp22-e-16 button-common close-button"));*/	
			//WebElement adElement = driver.findElement(By.id("dimiss-button"));
			if(closeButton.isDisplayed()) {
				closeButton.click();
			}
		
		}catch (NoSuchElementException e) {
			
		}
	}	
	
	
	//POLO
	@When("the user clicks the POLO button")
	public void theUserClicksOnPOLOButton() {		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//a[@href='/brand_products/Polo'][contains(.,'(6)Polo')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
	}	
	@Then("the title BRAND - POLO PRODUCTS appears")
	public void thePOLOBrandAppears() {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String message = driver.findElement(By.xpath("//h2[@class='title text-center'][contains(.,'Brand - Polo Products')]")).getText();
		Assert.assertTrue(message.contains("BRAND - POLO PRODUCTS"));
	}	
		
	
	
	//H&M
	@When("the user clicks the H&M button")
	public void theUserClicksOnHiMButton() {		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//a[@href='/brand_products/H&M'][contains(.,'(5)H&M')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
	}	
	@Then("the title BRAND - H&M PRODUCTS appears")
	public void theHiMBrandAppears() {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String message = driver.findElement(By.xpath("//h2[@class='title text-center'][contains(.,'Brand - H&M Products')]")).getText();
		Assert.assertTrue(message.contains("BRAND - H&M PRODUCTS"));
	}		
	
	
	
	
	//MADAME
	@When("the user clicks the MADAME button")
	public void theUserClicksOnMADAMEButton() {		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//a[@href='/brand_products/Madame'][contains(.,'(5)Madame')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
	}	
	@Then("the title BRAND - MADAME PRODUCTS appears")
	public void theMADAMEBrandAppears() {		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String message = driver.findElement(By.xpath("//h2[@class='title text-center'][contains(.,'Brand - Madame Products')]")).getText();
		Assert.assertTrue(message.contains("BRAND - MADAME PRODUCTS"));
	}	
	
	
	//MAST & HARBOUR
	@When("the user clicks the MAST & HARBOUR button")
	public void theUserClicksOnMASTiHARBOURButton() {		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//a[@href='/brand_products/Mast & Harbour'][contains(.,'(3)Mast & Harbour')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
	}	
	@Then("the title BRAND - MAST & HARBOUR PRODUCTS appears")
	public void theMASTiHARBOURBrandAppears() {		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String message = driver.findElement(By.xpath("//h2[@class='title text-center'][contains(.,'Brand - Mast & Harbour Products')]")).getText();
		Assert.assertTrue(message.contains("BRAND - MAST & HARBOUR PRODUCTS"));
	}
	
	

	//BABYHUG
	@When("the user clicks the BABYHUG button")
	public void theUserClicksOnBABYHUGButton() {		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//a[@href='/brand_products/Babyhug'][contains(.,'(4)Babyhug')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
	}	
	@Then("the title BRAND - BABYHUG PRODUCTS appears")
	public void theBABYHUGBrandAppears() {		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String message = driver.findElement(By.xpath("//h2[@class='title text-center'][contains(.,'Brand - Babyhug Products')]")).getText();
		Assert.assertTrue(message.contains("BRAND - BABYHUG PRODUCTS"));
	}	
	
	
	
	//ALLEN SOLLY JUNIOR
	@When("the user clicks the ALLEN SOLLY JUNIOR button")
	public void theUserClicksOnALLEN_SOLLY_JUNIORButton() {		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//a[@href='/brand_products/Allen Solly Junior'][contains(.,'(3)Allen Solly Junior')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
	}	
	@Then("the title BRAND - ALLEN SOLLY JUNIOR PRODUCTS appears")
	public void theAllenSollyJuniorBrandAppears() {		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String message = driver.findElement(By.xpath("//h2[@class='title text-center'][contains(.,'Brand - Allen Solly Junior Products')]")).getText();
		Assert.assertTrue(message.contains("BRAND - ALLEN SOLLY JUNIOR PRODUCTS"));
	}	
		
	//KOOKIE KIDS
	@When("the user clicks the KOOKIE KIDS button")
	public void theUserClicksOnKOOKIE_KIDSButton() {		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//a[@href='/brand_products/Kookie Kids'][contains(.,'(3)Kookie Kids')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
	}	
	@Then("the title BRAND - KOOKIE KIDS PRODUCTS appears")
	public void theKOOKIE_KIDSBrandAppears() {		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String message = driver.findElement(By.xpath("//h2[@class='title text-center'][contains(.,'Brand - Kookie Kids Products')]")).getText();
		Assert.assertTrue(message.contains("BRAND - KOOKIE KIDS PRODUCTS"));
	}	
	
	

	//MADAME
	@When("the user clicks the BIBA button")
	public void theUserClicksOnBIBAButton() {		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//a[@href='/brand_products/Biba'][contains(.,'(5)Biba')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
	}	
	@Then("the title BRAND - BIBA PRODUCTS appears")
	public void theBIBABrandAppears() {		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String message = driver.findElement(By.xpath("//h2[@class='title text-center'][contains(.,'Brand - Biba Products')]")).getText();
		Assert.assertTrue(message.contains("BRAND - BIBA PRODUCTS"));
	}	
		
	
	
	
	
}