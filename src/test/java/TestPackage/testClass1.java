package TestPackage;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestInstance(Lifecycle.PER_CLASS)
public class testClass1 {

    private static WebDriver driver;

    private static BrowserGetter browser = new BrowserGetter();

    @BeforeAll
    public static void beforeAll() {

        driver = browser.getChromeBrowser();

    }

    @AfterAll
    public static void afterAll() {
        driver.quit();

    }

    @Test
    public void openTheComPageAndCheckTheTitle() {

        String expectedComTitle = "Example Domain";
        driver.get("https://www.example.com");
        assertEquals(expectedComTitle, driver.getTitle());
        //Assertions.assertEquals(1, 2);
    }


    @Test
    public void openTheOrgPageAndCheckTheTitle() {

        String expectedPageTitle = "Example Domain";
        driver.get("https://www.example.com");
        assertEquals(expectedPageTitle, driver.getTitle());
        //Assertions.assertEquals(1, 2);
    }


}
