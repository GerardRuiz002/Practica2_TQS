import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/scrollAddRightLeft.feature", glue="steps")
public class RunScrollAddRightLeftTest extends AbstractTestNGCucumberTests{
	
}
