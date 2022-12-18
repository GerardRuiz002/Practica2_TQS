import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/brands.feature", glue="steps")
public class RunBrandsTest extends AbstractTestNGCucumberTests{
	
}
