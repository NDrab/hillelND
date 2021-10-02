import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    @FindBy(xpath = "//nav/a[contains(text(),'Products')]")
    private SelenideElement products;

    @FindBy(xpath = "//div/a[contains(text(),'Gummies')]")
    private SelenideElement gummies;


    @FindBy(xpath = "//button[contains(text(),'I understand')]")
    private SelenideElement acceptCookies;

    @Step
    public void hoverOnProducts(){
        products.hover(); }

    @Step
    public void agreeCookiesUse(){
        acceptCookies.click(); }

    @Step
    public GummiesPage clickOnGummies(){
        gummies.click();
    return page(GummiesPage.class); }

}
