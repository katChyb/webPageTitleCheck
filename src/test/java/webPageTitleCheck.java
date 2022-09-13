import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.assertj.core.api.Assertions.assertThat;

public class webPageTitleCheck extends BaseTest {


    private static Logger log = LoggerFactory.getLogger(webPageTitleCheck.class);


    @Tag("regression")
    @DisplayName("Page title validation test")
    @ParameterizedTest(name = "{0} has been verified")
    @MethodSource("DataProvider#pageTitleSet")
    void checkTitle(String pageUrl, String expectedTitle) {
        driver.get(pageUrl);
        String actualTitle = driver.getTitle();
        log.info(">>>>>>>> My website adress id: " + pageUrl + "<<<<<<<<<");

        assertThat(actualTitle).isEqualTo(expectedTitle);

    }
}
