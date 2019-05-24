package Steps;

import Framework.BaseTest;
import PageObjects.GoogleHomePage;
import PageObjects.GoogleSearchResultsPage;
import PageObjects.StoreRegitrationPage;
import org.apache.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class StoreRegistrationTest extends BaseTest {

    private StoreRegitrationPage storeRegitrationPage;

    @BeforeTest
    public void setUp() {
        super.setUp();
        storeRegitrationPage = new StoreRegitrationPage(driver);
    }

    @Test
    public void registrationTest () throws InterruptedException {

        storeRegitrationPage.getPageAutomationpractice();
        OurLogger.debug("test log4j komunikat pierwszy ");
        driver.click(By.className("login"));
        OurLogger.debug("test log4j komunikat login");
        driver.waitUntil(ExpectedConditions.elementToBeClickable(By.id("email_create")));
        OurLogger.info("test log4j komunikat pole email - checked ");
        storeRegitrationPage.fillinEmailFieldThenclickCreate();
        OurLogger.info("test log4j komunikat fill email and cliked - ok ");
        storeRegitrationPage.fillRegistrationForm();
        OurLogger.info("test log4j komunikat koncowy ");
        sleep(5000);

    }




}
