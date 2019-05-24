package Framework;

import org.apache.log4j.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected BaseDriver driver;
    protected Logger OurLogger;
    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriverImplementation();
        //Implementacja logow w konsoli
        BasicConfigurator.configure();
        OurLogger = LogManager.getLogger("OurLogger");

        //create a ConsoleAppender object
        //You will also have to set a layout also, here
        //We have chosen a SimpleLayout
        ConsoleAppender ConsoleAppender = new ConsoleAppender();
        ConsoleAppender.setLayout(new SimpleLayout());

        //Add the appender to our Logger Object.
        //from now onwards all the logs will be directed
        //to file mentioned by FileAppender
        OurLogger.addAppender(ConsoleAppender);
        ConsoleAppender.activateOptions();
    }

    @AfterMethod
    public void tearDown() {
        driver.closeDriver();
    }
}
