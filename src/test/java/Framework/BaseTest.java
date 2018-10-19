package Framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected BaseDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriverImplementation();
    }

    @AfterMethod
    public void tearDown() {
        driver.closeDriver();
    }
}
