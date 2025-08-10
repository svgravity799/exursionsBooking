import com.codeborne.selenide.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Selenide.*;

import java.nio.channels.ConnectionPendingException;
import java.time.Duration;
import io.qameta.allure.*;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class
exursionsBooking {
    @Test

    void exursionsBooking () {
        Selenide.open("https://fstravel.com/excursions/");
        System.out.println("Страница открыта");

    }

}
