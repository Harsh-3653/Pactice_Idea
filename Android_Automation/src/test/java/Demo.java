import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.sql.Driver;


public class Demo
{

    public static void main(String[] args) throws MalformedURLException {
        Class_1.desiredCap();

        WebDriverWait obj = new WebDriverWait(Class_1.Driver,10);

        //alert
        WebElement buttton= obj.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='OK']")));
        buttton.click();

        //search bar pressed
        Class_1.Driver.findElementById("com.google.android.apps.messaging:id/open_search_bar_text_view").click();

        //text to bar
        WebElement txtfield = obj.until(ExpectedConditions.presenceOfElementLocated(By.id("com.google.android.apps.messaging:id/zero_state_search_box_auto_complete")));
        txtfield.sendKeys("Harsh");
    }
}
