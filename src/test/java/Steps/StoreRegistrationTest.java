package Steps;

import Framework.BaseTest;
import PageObjects.GoogleHomePage;
import PageObjects.GoogleSearchResultsPage;
import PageObjects.StoreRegitrationPage;
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
        driver.click(By.className("login"));
        driver.waitUntil(ExpectedConditions.elementToBeClickable(By.id("email_create")));
        storeRegitrationPage.fillinEmailFieldThenclickCreate();
        storeRegitrationPage.fillRegistrationForm();
        sleep(5000);

    }




}
