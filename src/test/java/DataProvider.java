import org.junit.jupiter.params.provider.Arguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.stream.Stream;

public class DataProvider {
    private static Logger log = LoggerFactory.getLogger(DataProvider.class);


    private static Stream<Arguments> pageTitleSet() {
        log.info(">>>>>>>> Data provider started <<<<<<<<<");
        return Stream.of(
                Arguments.of("https://sii.pl/", "Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska"),
                Arguments.of("https://onet.pl/", "Onet – Jesteś na bieżąco"),
                Arguments.of("http://kotuszkowo.pl/", "Kotuszkowo- blog o kotach"),
                Arguments.of("https://www.filmweb.pl/", "Filmweb - filmy takie jak Ty!"),
                Arguments.of("https://www.selenium.dev/documentation/en/webdriver/", "WebDriver | Selenium")

        );
    }
}
