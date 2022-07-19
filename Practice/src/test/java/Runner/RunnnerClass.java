package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/data.feature",
        //plugin ={"pretty" , "html:test-output/OUTPUTS/main.html"},
        glue={"stepDefination"},
        publish = true
)
public class RunnnerClass
{



}
