package Pages;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class FirstPage extends AbstractPage {

    WebDriver webDriver;

    @FindBy(xpath ="//*[@class = 'confirmation-checkbox']" )
    private WebElement legalDrinkingAgePhrase;

    @FindBy(css =".confirmation-checkbox" )
    private WebElement legalDrinkingAgeCheckbox;

    @FindBy(id ="agegate-selector-options" )
    private WebElement countryListDropdown;

    @FindBy(css ="[type='submit']" )
    private WebElement welcomeButton;

    @FindBy(css =".confirmation-checkbox" )
    private WebElement checkBox;

    @FindBy(css=".agegate-selector-options" )
    private WebElement dropdownList;


    public FirstPage() {
        super();
        this.webDriver = WebDriverProvider.INSTANCE.getWebDriver(); }


    @Step
    public WebElement findLegalDrinkingAgePhrase (){
        return legalDrinkingAgePhrase;
    }

    @Step
    public WebElement findLegalDrinkingAgeCheckbox (){
        return legalDrinkingAgeCheckbox;
    }

    @Step
    public WebElement findCountryListDropdown (){
        return countryListDropdown;
    }

    @Step
    public WebElement findWelcomeButton(){
        return welcomeButton;
    }


    @Step
    public void clickOnCheckbox () {
        checkBox.click(); }


    @Step
    public String selectCountryFromDropDown(){
        Select countryFromDropDown = new Select(dropdownList);
        countryFromDropDown.selectByValue("eu");
        return countryFromDropDown.getFirstSelectedOption().getText(); }


    @Step
    public void clickWelcomeButton(){
        Waiters.waitUntilElementIsAvailable(welcomeButton);
        welcomeButton.click(); }

    @Step
    //this method includes four previous methods,is made for all tesCases excluding Case2.
    public MainPage navigateToMainPageAsEUCustomer(){
        clickOnCheckbox();
        selectCountryFromDropDown();
        clickWelcomeButton();
        return new MainPage();}}
