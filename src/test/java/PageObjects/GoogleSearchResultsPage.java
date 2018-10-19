package PageObjects;

import Framework.BaseDriver;
import Framework.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleSearchResultsPage extends BasePage {

    public GoogleSearchResultsPage(BaseDriver driver) {
        super(driver);
    }

    public void assertThatExpectedPageIsLoaded(String expectedPageTitle) {
        driver.waitUntil(ExpectedConditions.titleContains(expectedPageTitle));
    }
}
