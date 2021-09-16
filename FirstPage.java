package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class FirstPage {

    WebDriver webDriver;

    @FindBy(xpath ="//*[@class = 'confirmation-checkbox']" )
    private WebElement legalDrinkingAgePhrase;

    @FindBy(css =".confirmation-checkbox" )
    private WebElement legalDrinkingAgeCheckbox;

    @FindBy(css =".agegate-selector-options" )
    private WebElement countryListDropdown;

    @FindBy(css ="[type='submit']" )
    private WebElement welcomeButton;

    @FindBy(css =".confirmation-checkbox" )
    private WebElement checkBox;

    @FindBy(css=".agegate-selector-options" )
    private WebElement dropdownList;


    public FirstPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this); }


    public WebElement findLegalDrinkingAgePhrase (){
        return legalDrinkingAgePhrase;
    }

    public WebElement findLegalDrinkingAgeCheckbox (){
        return legalDrinkingAgeCheckbox;
    }

    public WebElement findCountryListDropdown (){
        return countryListDropdown;
    }

    public WebElement findWelcomeButton(){
        return welcomeButton;
    }


    public void clickOnCheckbox () {
        checkBox.click(); }


    public String selectCountryFromDropDown(){
        Select countryFromDropDown = new Select(dropdownList);
        countryFromDropDown.selectByValue("eu");
        return countryFromDropDown.getFirstSelectedOption().getText(); }


    public void waitUntilWelcomeButtonIsAvailable(){
        (new WebDriverWait(webDriver, 20))
                .until(ExpectedConditions.elementToBeClickable(welcomeButton)); }


    public void clickWelcomeButton(){
        welcomeButton.click(); }

    //this method includes four previous methods,is made for all tesCases excluding Case2.
    public MainPage navigateToMainPageAsEUCustomer(){
        clickOnCheckbox();
        selectCountryFromDropDown();
        waitUntilWelcomeButtonIsAvailable();
        clickWelcomeButton();
        return new MainPage(webDriver);}


    public void assertNavigationToMainPageAsCustomer(){
        //after navigation to main page as a customer, the confirmation of legal age should be absent,as a result l.size=0
        List<WebElement> l= webDriver.findElements(By.xpath("//*[contains(text(),'I am of legal drinking age in')]"));
        Assert.assertTrue(l.size()==0);
    }

}
