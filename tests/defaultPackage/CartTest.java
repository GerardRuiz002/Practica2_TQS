package defaultPackage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/cart.feature", glue="steps")
public class CartTest extends AbstractTestNGCucumberTests { }
