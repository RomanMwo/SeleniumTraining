package PageObjects;

import Framework.BaseDriver;
import Framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class StoreRegitrationPage extends BasePage {

    private By accountCreationFormLocator = id("account-creation_form");
    private By genderCheckBoxLocator = xpath("//*[@for='id_gender1']");
    private By firstnameInputLocator = id("customer_firstname");
    private By lastnameInputLocator = id("customer_lastname");
    private By emailInputLocator = id("email");
    private By passwordInputLocator = id("passwd");
    private By dropdownDayLocator = id("days");
    private By dropdownMonthLocator = id("months");
    private By dropdownYearLocator = id("years");
    private By addressFirstnameLocator = id("firstname");
    private By addressLastnameLocator = id("lastname");
    private By addressCompanyLocator = id("company");
    private By addressAddressLocator = id("address1");
    private By addressAddressLocatorSecond = id("address2");
    private By addressCityLocator = id("city");
    private By addressStateLocator = id("id_state");
    private By addressPostcodeLocator = id("postcode");
    private By addressCountryLocator = id("id_country");
    private By textArea = id("other");
    private By addressPhoneLocator = id("phone");
    private By addressPhoneMobileLocator = id("phone_mobile");
    private By addressAliasLocator = id("alias");
    private By registerButtonLocator = id("submitAccount");
    private By email = id("email_create");
    private String regEmail = "abcd" + new Random().nextInt() + "@dajiede.de";

    public StoreRegitrationPage(BaseDriver driver) {
        super(driver);
    }

    public void getPageAutomationpractice() {

        driver.get("http://automationpractice.com/index.php");
        driver.waitUntil(ExpectedConditions.titleIs("My Store"));
    }

    public void fillinEmailFieldThenclickCreate() {
        driver.findElement(email).sendKeys(regEmail);
        driver.findElement(email).sendKeys(Keys.ENTER);
        driver.waitUntil(ExpectedConditions.visibilityOfAllElementsLocatedBy(accountCreationFormLocator));
    }
    public void fillRegistrationForm() {

        driver.sendKeys(firstnameInputLocator, "uzytkownik");
        driver.sendKeys(lastnameInputLocator, "testowy");
        driver.sendKeys(passwordInputLocator, "testowy1234");
        driver.findElement(dropdownDayLocator).sendKeys("1");
       // driver.sendKeys(dropdownDayLocator, "1");
       // driver.sendKeys(dropdownMonthLocator, "January");
        driver.findElement(dropdownMonthLocator).sendKeys("January");
        //driver.sendKeys(dropdownYearLocator, "2000");
        driver.findElement(dropdownYearLocator).sendKeys("2000");
        driver.sendKeys(addressCompanyLocator, "Dupa1234");
        driver.sendKeys(addressAddressLocator, "zadupie");
        driver.sendKeys(addressAddressLocatorSecond, "district");
        driver.sendKeys(addressCityLocator, "Cracow");
        //driver.sendKeys(addressStateLocator, "Alabama");
        driver.findElement(addressStateLocator).sendKeys("Alabama");
        driver.sendKeys(addressPostcodeLocator, "13541");
        //driver.sendKeys(addressCountryLocator, "United States");
        driver.findElement(addressCountryLocator).sendKeys("United States");
        driver.sendKeys(textArea, "example text  gsgsdgsdgsdgsdgsdgsdgsd");
        driver.sendKeys(addressPhoneLocator, "123456");
        driver.sendKeys(addressPhoneMobileLocator, "123456789");
        driver.sendKeys(addressAliasLocator, "adresikkkkk");
        driver.click(registerButtonLocator );

    }
}
