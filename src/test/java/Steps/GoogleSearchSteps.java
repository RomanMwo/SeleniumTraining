package Steps;

import Framework.BaseTest;
import PageObjects.GoogleHomePage;
import PageObjects.GoogleSearchResultsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchSteps extends BaseTest {

    private GoogleHomePage googleHomePage;
    private GoogleSearchResultsPage googleSearchResultsPage;

    @Override
    @BeforeMethod
    public void setUp() {
        super.setUp();
        googleHomePage = new GoogleHomePage(driver);
        googleSearchResultsPage = new GoogleSearchResultsPage(driver);
    }

    @Test
    public void myFistTest() {
        googleHomePage.goToGoogleHomePage();
        googleHomePage.typeIntoSearchField("Stacja IT");
        googleHomePage.clickSearchButton();
        googleSearchResultsPage.assertThatExpectedPageIsLoaded("Stacja IT");
        googleSearchResultsPage.logPageTitle();
    }

    @Test
    public void mySecondTest() {
        googleHomePage.goToGoogleHomePage();
        googleHomePage.typeIntoSearchField("Java dla testerów");
        googleHomePage.clickSearchButton();
        googleSearchResultsPage.assertThatExpectedPageIsLoaded("Java dla testerów");
    }
}
