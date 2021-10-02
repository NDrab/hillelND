import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class GeneralBasketPage {


    @FindBy(xpath = "//td[@class='text-center biger-text hidden-xs']/a")
    private SelenideElement buttonToDeleteFmBasket;

    @FindBy(xpath = "//span[contains(text(),'Your shopping cart is empty')]")
    public SelenideElement messageOfEmptyBasketAfterDeleteAction;

    @FindBy(className = "plus")
    public SelenideElement increaseProductsQuantityInBasket;

    @FindBy(xpath = "//div[@class='quantity-box']/input")
    public SelenideElement productQuantity;


    @FindBy(xpath = "//span[@class='total']")
    public SelenideElement totalPrice;

    @Step
    public void deleteProductFmBasket(){
        buttonToDeleteFmBasket.click();}

    @Step
    public String readEmptyBasketText(){
        return messageOfEmptyBasketAfterDeleteAction.text();}

    @Step
    public void clickToIncreaseProductsQuantity(){
        increaseProductsQuantityInBasket.click();}

    @Step
    public String readProductQuantity(){
        return productQuantity.text().toString();}


    @Step
    public String readTotalPrice(){
        return totalPrice.text();}
}
