
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/searchBar.feature", glue="steps")
public class SearchBarTest extends AbstractTestNGCucumberTests { }
