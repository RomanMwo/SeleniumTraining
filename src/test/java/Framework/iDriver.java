package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public interface iDriver {

    void closeDriver();
    void initializeDriver();
    void initializeWebDriverWait();
    void setDriverLocationProperty();
    void waitUntil(ExpectedCondition webElementExpectedCondition);
    void get(String urlToGo);
    WebElement findElement(By locator);
    String getTitle();
}
