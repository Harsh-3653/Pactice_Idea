import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class Class_1 {
    static AppiumDriver Driver;

    public static void web_Setup() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void desiredCap() throws MalformedURLException {
        DesiredCapabilities desiredCap = new DesiredCapabilities();
        desiredCap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        desiredCap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.apps.messaging");
        desiredCap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.messaging.ui.ConversationListActivity");
        desiredCap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        try {
            Driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCap);
            System.out.println(" established");

        } catch (Throwable th) {
            th.printStackTrace();
            System.out.println("not established");
        }
    }
}
