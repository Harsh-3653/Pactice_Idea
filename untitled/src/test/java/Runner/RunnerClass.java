package Runner;

import StepDefination.VerifyPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static StepDefination.VerifyPage.*;

//@RunWith(Cucumber.class)

@CucumberOptions(
        features={"src/test/resources/Scenario.feature","src/test/resources/Scenario2.feature"},
        plugin ={"pretty" , "html:test-output/OUTPUTS/main.html" ,"json:test-output/OUTPUTS/main1.json"},
        glue={"StepDefination"},
        tags = " @Feature1",
        publish = true

)
public class RunnerClass extends AbstractTestNGCucumberTests {
    @BeforeSuite
    public static void extent() {
        //where report is stored
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/testReport.html");

        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);


        String osName = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");
        extent.setSystemInfo("OS", osName);
        extent.setSystemInfo("Java Version", javaVersion);

        WebDriverManager.chromedriver().setup();
        VerifyPage.driver=new ChromeDriver();

    }
    @AfterSuite

        public void end()
        {
            driver.close();
        }

}