import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/registerAndLogin.feature", glue="steps")
public class RunRegisterAndLoginTest extends AbstractTestNGCucumberTests{
	
}
