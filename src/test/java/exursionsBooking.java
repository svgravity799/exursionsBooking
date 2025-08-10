import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class ExcursionsBookingTest {

    @Test
    void excursionsBooking() {
        // Настройки Selenide для CI
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000; // 10 секунд ожидания

       Selenide.open("https://fstravel.com/excursions/");
        System.out.println("Страница открыта");
    }
}
