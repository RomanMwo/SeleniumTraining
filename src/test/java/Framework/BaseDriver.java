package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseDriver implements iDriver{

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseDriver() {
        setDriverLocationProperty();
        initializeDriver();
        initializeWebDriverWait();
    }

    public void waitUntil(ExpectedCondition webElementExpectedCondition) {
        wait.until(webElementExpectedCondition);
    }

    public void get(String urlToGo) {
        driver.get(urlToGo);
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void selectFromDropdown(By locator, String fieldToFind)
    {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        Select mySelect = new Select(driver.findElement(locator));
        mySelect.selectByVisibleText(fieldToFind);
    }

    public void sendKeys(By locator, String myKeys){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).sendKeys(myKeys);

    }
}
