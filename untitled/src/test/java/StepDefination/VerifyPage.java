package StepDefination;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.testng.Assert;

public class VerifyPage {
    public static ExtentHtmlReporter htmlReporter;

    public static ExtentReports extent;
    public static WebDriver driver ;
     ExtentTest test;

    public String getBase64Screenshot()
    {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

    }
@BeforeAll
public static void start()
{
    System.out.println("Before alls");
}
    public Media captureScreenShot()
    {

     test.addScreenCaptureFromBase64String(getBase64Screenshot());
        return null;
    }
    @Given("user opens website")
    public void user_opens_website()
    {
        test=extent.createTest("login to academy");
        test.info("navigate to url");
       // test.info("screenshot",captureScreenShot());
        driver.get("https://rahulshettyacademy.com/");

    }
    @When("user click on course button")
    public void user_click_on_course_button() {
    test.info("user clicks on course button");
        driver.findElement(By.linkText("Courses")).click();
    }
    @Then("veriy home page")
    public void veriy_home_page() {
        test.info("verify the page");
        driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        captureScreenShot();

    }

   //scenario 2

    @Given("user YOUTUBE website")
    public void user_youtube_website()
    {
        test=extent.createTest("VERIFICATION OF OLX");
        test.info("navigate to url");
         driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
        driver.get("https://www.olx.in/");

    }
    @When("user enter movie name")
    public void user_enter_movie_name() {
       test.info("enter car name");
        driver.findElement(By.cssSelector("div>input:nth-child(1)")).sendKeys("cars",Keys.ENTER);
        captureScreenShot();
    }
    @Then("verify the title")
    public void verify_the_title() {

        test.info("verify title");

        String name = driver.getTitle();

        try {
            Assert.assertEquals("for sale in India | OLX", name);
            test.pass("Test passed");
         captureScreenShot();
        } catch (Throwable th) {
            test.fail("not able to get correct title");
           captureScreenShot();
        }
    }
    @After
    public void term()
    {
        extent.flush();
       // VerifyPage.driver.close();
    }
//Second feature file
    @When("user enters car name")
    public void user_enters_car_name() throws InterruptedException {
        test=extent.createTest("Verification of car");
        test.info("enter car name");
       // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,"t");
        driver.get("https://www.google.co.in/");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("BMW");
        captureScreenShot();
    }
    @Then("verify that user should navigate to car page")
    public void verify_that_user_should_navigate_to_car_page()
    {
        test.info("verification od title");
       Assert.assertEquals( driver.getTitle(),driver.getTitle());
        test.pass("test passed");
    //    test.fail("test fail",test.addScreenCaptureFromBase64String(getBase64Screenshot()));

    }

}

