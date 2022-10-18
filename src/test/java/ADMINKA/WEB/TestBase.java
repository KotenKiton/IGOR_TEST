package ADMINKA.WEB;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void setUp() {

        Configuration.baseUrl = "https://www.google.ru/";
        Configuration.browserSize = "1920x1080";
    }
}
