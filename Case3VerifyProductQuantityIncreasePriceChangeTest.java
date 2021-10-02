import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.open;

public class Case3VerifyProductQuantityIncreasePriceChangeTest extends SelenideRunner{

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test verifies that Product Quantity and the total price can be changed in the basket")

    public void verifyProductsQuantityIsChanged () {

        final String expectedTotalPrice = "76,00 $";
        final String expectedQuantity = "2";

        MainPage mainPage = open(Constants.HAIR_CARE_PANDA_URL, MainPage.class);
        mainPage.agreeCookiesUse();
        mainPage.hoverOnProducts();
        GummiesPage gummiesPage = mainPage.clickOnGummies();
        PreBasketPage preBasketPage = gummiesPage.clickOnBuyNowButton();
        GeneralBasketPage generalBasketPage = preBasketPage.navigateToGeneralPageOfBasket();
        generalBasketPage.clickToIncreaseProductsQuantity();
        generalBasketPage.productQuantity.shouldHave(value(expectedQuantity));
        generalBasketPage.totalPrice.should(text(expectedTotalPrice));
    }
}

