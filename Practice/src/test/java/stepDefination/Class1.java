package stepDefination;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Class1 {
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    WebDriver driver;
    ExtentTest test;

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=" +
                "_O1aeBqq0YFtBotaweHKJiebUr1qdrwTLPCwHvXfAUO_qbVEW4hi3gQKR_GGiEBNDYpn74jn8qS_QSkarXNXeQ");
    }

    public String getBase64Screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }

    @AfterStep
    public void af(Scenario scenario) {
//        if(scenario.isFailed())
//        {
//            test.addScreenCaptureFromBase64String(getBase64Screenshot());
//        }
        test.addScreenCaptureFromBase64String(getBase64Screenshot());
    }

    @Before
    public void extent() {
        setup();
        // initialize the HtmlReporter
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/testReport.html");

        //configuration items to change the look and feel
        //add content, manage tests etc
        htmlReporter.config().setDocumentTitle("Simple Automation Report");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        //OS details
        String osName = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");
        extent.setSystemInfo("OS", osName);
        extent.setSystemInfo("Java Version", javaVersion);

        //browser Details using capabilities class in selenium
        Capabilities browserdetails = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = browserdetails.getBrowserName();
        String browserVersion = browserdetails.getVersion();
        extent.setSystemInfo("Browser", browserName + "  " + browserVersion);
    }

    @Given("user opens website")
    public void user_opens_website() {
        test = extent.createTest("login to academy");
        test.log(Status.INFO, "step 1");
        System.out.println("given");
    }


    @When("user enters credentials")
    public void user_enters_credentials() {
        test.info("Enter email");

        driver.findElement(By.id("email")).sendKeys("harsh.awasthi");
        test.info("Enter pasword");
        driver.findElement(By.id("password")).sendKeys("harsh");
        test.info("Enter submit");
        driver.findElement(By.name("commit")).click();
    }


    @Then("verify the results")
    public void verify_the_results() {
        test.info("verification");
        WebDriverWait w = new WebDriverWait(driver, 10);
        WebElement ele = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3//following-sibling::div")));

        boolean x = ele.isDisplayed();

        try {
            Assert.assertFalse(x);
            test.pass("test pass");
        } catch (Throwable throwable) {

            test.fail("test fail");
        }
        test.fail("test fail");
//            System.out.println("error prone");
    }

    @After
    public void term() {
        extent.flush();
        driver.close();
    }
}



