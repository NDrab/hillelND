import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Selenide.open;


public class Case2VerifyRemoveProductFmBasketTest extends SelenideRunner {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test verifies that Product can be deleted from the basket")

    public void verifyProductIsDeletedFmBasket () {

        final String expectedPhraseAfterAllProductDelete = "Your shopping cart is empty\n" +
                "An empty basket is a sad basket.\n" +
                "Change this! Check our bestsellers!";

        PandaMainPage mainPage = open(Constants.HAIR_CARE_PANDA_URL, PandaMainPage.class);
        mainPage.agreeCookiesUse();
        mainPage.hoverOnProducts();
        GummiesPage gummiesPage = mainPage.clickOnGummies();
        PreBasketPage preBasketPage = gummiesPage.clickOnBuyNowButton();
        GeneralBasketPage generalBasketPage = preBasketPage.navigateToGeneralPageOfBasket();
        generalBasketPage.deleteProductFmBasket();
        Selenide.switchTo().alert().accept();
        generalBasketPage.messageOfEmptyBasketAfterDeleteAction.should(matchText(expectedPhraseAfterAllProductDelete));
    }}