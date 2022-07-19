package steps;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class StepsDefination
{
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    WebDriver driver;
    ExtentTest test;

    @Before

    public void extent(){

        // initialize the HtmlReporter
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");

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
        extent.setSystemInfo("OS",osName);
        extent.setSystemInfo("Java Version",javaVersion);

        //browser Details using capabilities class in selenium
        Capabilities browserdetails = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = browserdetails.getBrowserName();
        String browserVersion = browserdetails.getVersion();
        extent.setSystemInfo("Browser",browserName+"  "+browserVersion);
    }
    @Given("user opens website")
    public void user_opens_website()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=_O1aeBqq0YFtBotaweHKJiebUr1qdrwTLPCwHvXfAUO_qbVEW4hi3gQKR_GGiEBNDYpn74jn8qS_QSkarXNXeQ");


    }



    @When("user enters credentials")
    public void user_enters_credentials() {
       driver.findElement(By.id("email")).sendKeys("harsh.awasthi");
       driver.findElement(By.id("password")).sendKeys("harsh");
       driver.findElement(By.name("commit")).click();
    }



    @Then("verify the results")
    public void verify_the_results()
    {

     boolean x=   driver.findElement(By.className("bodySmall m-b-3-xs text-center-xs auth-flash-error")).isDisplayed();
        Assert.assertTrue(x);
    }
}
