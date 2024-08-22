package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserGetter {


    public WebDriver getChromeBrowser(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver getDriver(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        return driver;}


}