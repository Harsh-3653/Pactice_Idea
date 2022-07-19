package Pun;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Option_choose_kro
{
    public static void main(String[] args)
    {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\TX\\Desktop\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/select-menu");
        driver.findElement(By.xpath(""));

    }
}
