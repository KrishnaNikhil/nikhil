package Test.MVN;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"},
		plugin = {"pretty", "html:C:\\nikhil\\cucumber-html-report"},
		glue={"Test.MVN"}
		)
public class RunCukesTest{

}
