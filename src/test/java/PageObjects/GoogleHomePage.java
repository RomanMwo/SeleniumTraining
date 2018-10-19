package PageObjects;

import Framework.BaseDriver;
import Framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleHomePage extends BasePage {

    private By searchFieldLocator = By.name("q");

    public GoogleHomePage(BaseDriver driver) {
        super(driver);
    }

    public void clickSearchButton() {
        driver.waitUntil(ExpectedConditions.elementToBeClickable(searchFieldLocator));
        WebElement searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys(Keys.ENTER);
    }

    public void typeIntoSearchField(String textToTypeIn) {
        driver.waitUntil(ExpectedConditions.elementToBeClickable(searchFieldLocator));
        driver.findElement(searchFieldLocator).sendKeys(textToTypeIn);
        driver.click(By.name("q"));
    }

    public void goToGoogleHomePage() {
        driver.get("http://google.com");
        driver.waitUntil(ExpectedConditions.titleIs("Google"));
    }
}

