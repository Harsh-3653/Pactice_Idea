import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProgressBar
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/");
        driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[4]")).click();
        Thread.sleep(6000);
        //driver.findElement(By.xpath("//li[@id='item-4']//parent::span[text()='Progress Bar']")).click();
       // driver.findElement(By.xpath("(//li[@id='item-4'])[3]")).click();

      //  new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@id='item-4'])[3]"))).click();
        WebElement obj= driver.findElement(By.xpath("(//li[@id='item-4'])[3]"));
        JavascriptExecutor je=(JavascriptExecutor)driver;
        je.executeScript("arguments[0].click()",obj);

        WebElement btn=driver.findElement(By.id("startStopButton"));

        je.executeScript("arguments[0].click()",btn);

        Thread.sleep(5000);

        je.executeScript("arguments[0].click()",btn);

        int a=50;

        try
        {
            driver.findElement(By.xpath("//div[text()='"+a+"%`']"));

        }
        catch (Throwable tn)
        {

        }
    }
}
