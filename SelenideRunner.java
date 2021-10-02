import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeSuite;

public class SelenideRunner {
    @BeforeSuite

    public void setupAllureReport(){
        SelenideLogger.addListener("AllureSelenide",new AllureSelenide()
        .screenshots(false)
        .savePageSource(true));
    }
}
