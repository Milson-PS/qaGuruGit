import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import java.time.Duration;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide1121112222221").pressEnter();
        $("[id=search]").shouldHave(text("https://ru.selenide.org"), Duration.ofSeconds(50));
    }
}
£