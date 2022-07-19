import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class ReminderMainClass
{
    public static void main(String[] args) throws MalformedURLException {
        Reminder.desiredCap();

        WebDriverWait obj = new WebDriverWait(Reminder.Driver,10);

        WebElement buttton= obj.until(ExpectedConditions.presenceOfElementLocated(By.id("com.simplemobiletools.calendar:id/change_view")));
        buttton.click();

        WebElement dialyView=obj.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.RadioButton[@text='Daily view']")));
        dialyView.click();

        WebElement eventclick=obj.until(ExpectedConditions.presenceOfElementLocated(By.id("com.simplemobiletools.calendar:id/calendar_fab")));
        eventclick.click();

        WebElement title =obj.until(ExpectedConditions.presenceOfElementLocated(By.id("com.simplemobiletools.calendar:id/event_title")));
        title.click();
        title.sendKeys("dialy sync meet");

        WebElement time1=obj.until(ExpectedConditions.presenceOfElementLocated(By.id("com.simplemobiletools.calendar:id/event_start_time")));
        time1.click();

        Reminder.Driver.findElementByXPath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='10']").click();


        WebElement time2=obj.until(ExpectedConditions.presenceOfElementLocated(By.id("android:id/button1")));
        time2.click();

       WebElement save=obj.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='Save']")));
       save.click();

       WebElement ok=obj.until(ExpectedConditions.presenceOfElementLocated(By.id("android:id/button1")));
       ok.click();

    }
}
