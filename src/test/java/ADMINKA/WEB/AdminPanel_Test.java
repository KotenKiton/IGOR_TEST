package ADMINKA.WEB;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class AdminPanel_Test extends TestBase {

    @Test
    @DisplayName("Открытие мейн страницы")
    void firstTest() {
        step("Открыть главную страницу", () -> {
            open("");

        });
    }}
