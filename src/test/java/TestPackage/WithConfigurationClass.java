package TestPackage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class WithConfigurationClass {

    private static final BrowserGetter browser=new BrowserGetter();
    private static WebDriver driver;


    @BeforeAll
    public static void beforeAll(){

        driver=browser.getDriver();
    }


    @AfterAll

    public static void afterAll(){
        driver.quit();
    }

    @Test
    public void justAtest(){
        if (driver==null){
            driver=browser.getDriver();
        }
        driver.get("https://www.example.com");
        assertEquals("Example Domain",driver.getTitle());
    }





}
