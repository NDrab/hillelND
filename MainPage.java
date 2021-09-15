package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    WebDriver webDriver;

    @FindBy (xpath = "//span[contains(text(),'Menu')]")
    private WebElement menu;

    @FindBy(css = "h2")
    private WebElement welcomePhrase;

    @FindBy(xpath="//*[@class='header-sub-copy']")
    private  WebElement SecondWelcomePhrase;

    @FindBy(css = "[aria-label='Find Your Wine by going to the Wines page']")
    private WebElement yourWineElement;

    @FindBy (id = "primary-footer")
    private WebElement footer;

    @FindBy (css = "[href='https://www.yellowtailwine.com/stores/']")
    private WebElement whereToBuy;

    @FindBy (css = "[href='https://www.yellowtailwine.com/cocktails/']")
    private WebElement cocktails;

    @FindBy (css = "[href='https://www.yellowtailwine.com/our-story/']")
    private WebElement ourStory;

    @FindBy (css = "[href='https://www.yellowtailwine.com/faqs/']")
    private WebElement faqs;

    @FindBy (css = "[href='https://www.yellowtailwine.com/contact/']")
    private WebElement contact;

    @FindBy (css = "[href='https://www.yellowtailwine.com/wines/']")
    private WebElement wines;

    @FindBy (css = "span[class='fa fa-globe fa-lg']")
    private WebElement regionSelector;

    @FindBy (xpath = "(//img[@alt='Yellow tail logo'])[2]")
    private WebElement yellowTaleLogo;

    @FindBy (css = "[aria-label='Go to the China YellowTail website']")
    private WebElement selectChina;


    public MainPage (WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public WebElement findMenu(){
        return menu;
    }

    public void clickOnMenu(){
        (new WebDriverWait(webDriver, 10))
                .until(ExpectedConditions.visibilityOf(menu));
        menu.click(); }

    public String readWelcomePhrase (){;
        String welcomePhraseText = welcomePhrase.getText();
        return welcomePhraseText;
    }

    public String readSecondWelcomePhrase (){
        String welcomePhraseText = SecondWelcomePhrase.getText();
        return welcomePhraseText; }

    public WebElement findYourWineElement(){
        return yourWineElement; }


    public WebElement findFooter(){
        return footer;
    }

    public WebElement findWhereToBuy () { return whereToBuy;
    }

    public WhereToBuyPage NavigateToFindWhereToBuy (){
        whereToBuy.click();
        return new WhereToBuyPage(webDriver); }

    public WebElement findCocktails (){
        return cocktails; }

    public CocktailsPage navigateToCocktailsPage (){
        cocktails.click();
        return new CocktailsPage (webDriver);
    }

    public WebElement findOurStory (){
        return ourStory; }

    public WebElement findFaqs (){
        return faqs; }

    public WebElement findContact (){
        return contact; }

    public WebElement findWines (){
        return wines; }

    public WebElement findRegionSelector (){
        return regionSelector; }

    public void waitMainPageElementPresence(){
        WebDriverWait wait = new WebDriverWait(webDriver,30);
        wait.until(ExpectedConditions.visibilityOf(whereToBuy)); }


    public void clickYellowTaleLogo(){

        (new WebDriverWait(webDriver, 10))
                .until(ExpectedConditions.visibilityOf(yellowTaleLogo));
        yellowTaleLogo.click(); }


    public void selectChina(){
        (new WebDriverWait(webDriver, 10))
                .until(ExpectedConditions.visibilityOf(selectChina));
       selectChina.click();

    }
}
