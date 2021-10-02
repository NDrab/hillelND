import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class PreBasketPage {

    @FindBy(xpath = "//div[@class='table-cart-small-container']")
    public SelenideElement basketPage;

    @FindBy(xpath = "//strong[contains(text(),'My basket')]")
    public SelenideElement buttonToNavigateToBasket;

    @FindBy(xpath = "//td[@class='text-center biger-text hidden-xs']/a")
    public SelenideElement deleteButtonInBasket;

    @Step
    public String readProductNameInBasket(){
        return basketPage.text();}

    @Step
    public GeneralBasketPage navigateToGeneralPageOfBasket() {
            buttonToNavigateToBasket.click();
            return page(GeneralBasketPage.class);
        }
}
