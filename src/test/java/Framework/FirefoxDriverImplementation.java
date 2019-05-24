package Framework;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirefoxDriverImplementation extends BaseDriver {


    public void initializeDriver() {
        this.driver = new FirefoxDriver();
    }

    public void initializeWebDriverWait() {
        this.wait = new WebDriverWait(this.driver, 15);
    }

    public void closeDriver() {
        driver.close();
    }

    public void setDriverLocationProperty() {
        System.setProperty("webdriver.gecko.driver", "./src/test/resorces/geckodriver.exe");
    }
}
