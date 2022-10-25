package Configuration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import testConfig.BrowserEnvironment;
import testConfig.EnvironmentProperty;

public class BaseTest {
    private static Logger log = LoggerFactory.getLogger(BaseTest.class);
    public static WebDriver driver;
    private static BrowserEnvironment browserEnvironment;
    private static EnvironmentProperty environmentProperty;

    @BeforeAll
    static void setupDriver() {
        environmentProperty = EnvironmentProperty.getInstance();
        browserEnvironment = new BrowserEnvironment();
        driver = browserEnvironment.getDriver();

        log.info(">>>>>>>> WebDriver is set up <<<<<<<<<");

    }

    public WebDriver getDriver() {
        return driver;
    }

    //    Pierwotne hooki zamienione na nowe z frameworka
//
//    @BeforeAll
//    static void setupDriver() {
//        WebDriverManager.chromedriver().setup();
//        log.info(">>>>>>>> WebDriver is set up <<<<<<<<<");
//
//    }
//
//    @BeforeEach
//    void setup() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        log.info(">>>>>>>> Chrome window is Maximized <<<<<<<<<");
//    }

    @AfterEach
    void tearDown() {
        driver.quit();
        log.info(">>>>>>>> WebDriver is closed <<<<<<<<<");
    }
}
