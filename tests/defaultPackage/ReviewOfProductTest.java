package defaultPackage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/reviewOfProduct.feature", glue="steps")
public class ReviewOfProductTest extends AbstractTestNGCucumberTests { }
