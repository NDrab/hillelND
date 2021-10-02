import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class Case1VerifyItemAddToBasketViaBuyNowButtonTest extends SelenideRunner{


   @Test
   @Severity(SeverityLevel.BLOCKER)
   @Description("Test verifies that Product can be added to the basket and basket is displayed")

    public void verifyBasketPageIsDisplayedWithSelectedProduct () {
    MainPage mainPage = open(Constants.HAIR_CARE_PANDA_URL, MainPage.class);
    mainPage.agreeCookiesUse();
    mainPage.hoverOnProducts();
    GummiesPage gummiesPage = mainPage.clickOnGummies();
    PreBasketPage preBasketPage = gummiesPage.clickOnBuyNowButton();
    preBasketPage.basketPage.should(exist);
    preBasketPage.basketPage.should(text(gummiesPage.readProductName()));
    }
}
