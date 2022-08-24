import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class webPageTitleCheck {

    WebDriver driver;

    @BeforeAll
    static void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Tag("regression")
    @DisplayName("Page title validation test")
    @ParameterizedTest(name = "{0} has been verified")
    @MethodSource("DataProvider#pageTitleSet")
    void checkTitle(String pageUrl, String expectedTitle) {
        driver.get(pageUrl);
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(expectedTitle);

    }
}
