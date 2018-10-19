package Framework;

public class BasePage {

    protected BaseDriver driver;

    public BasePage(BaseDriver driver) {
        this.driver = driver;
    }

    public void logPageTitle() {
        System.out.println(driver.getTitle());
    }
}
