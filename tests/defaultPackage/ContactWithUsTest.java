package defaultPackage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/contactWithUs.feature", glue="steps")
public class ContactWithUsTest extends AbstractTestNGCucumberTests { }
