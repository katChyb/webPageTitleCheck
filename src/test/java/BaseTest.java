import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {
    private static Logger log = LoggerFactory.getLogger(BaseTest.class);
    WebDriver driver;

    @BeforeAll
    static void setupDriver() {
        WebDriverManager.chromedriver().setup();
        log.info(">>>>>>>> WebDriver is set up <<<<<<<<<");

    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        log.info(">>>>>>>> Chrome window is Maximized <<<<<<<<<");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        log.info(">>>>>>>> WebDriver is closed <<<<<<<<<");
    }
}
