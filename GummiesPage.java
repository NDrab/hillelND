import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class GummiesPage {

    @FindBy(xpath = "//div//span//span[@class='title']")
    private SelenideElement productItem;

    @FindBy(xpath = "//span[@class='btn btn-primary']")
    private SelenideElement buyNowButton;


    @Step
    public String readProductName(){
        return productItem.text();
    }

    @Step
    public PreBasketPage clickOnBuyNowButton(){
        productItem.hover();
        buyNowButton.click();
    return page(PreBasketPage.class);}

}
