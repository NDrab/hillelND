package Pages;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage{

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

    //this is a such locator, i cannot make it better or remove the number because it will be another locator
    @FindBy (xpath = "(//img[@alt='Yellow tail logo'])[2]")
    private WebElement yellowTaleLogo;

    @FindBy (css = "[aria-label='Go to the China YellowTail website']")
    private WebElement selectChina;


    public MainPage () {
        super();
        this.webDriver = WebDriverProvider.INSTANCE.getWebDriver();
    }

    @Step
    public WebElement findMenu(){
        return menu;
    }

    @Step
    public void clickOnMenu(){
        Waiters.waitUntilElementIsAvailable(menu);
        menu.click(); }

    @Step
    public String readWelcomePhrase (){;
        String welcomePhraseText = welcomePhrase.getText();
        return welcomePhraseText;
    }

    @Step
    public String readSecondWelcomePhrase (){
        String welcomePhraseText = SecondWelcomePhrase.getText();
        return welcomePhraseText; }

    @Step
    public WebElement findYourWineElement(){
        return yourWineElement; }


    @Step
    public WebElement findFooter(){
        return footer;
    }


    @Step
    public WebElement findWhereToBuy () { return whereToBuy;
    }

    @Step
    public WhereToBuyPage navigateToFindWhereToBuy (){
        whereToBuy.click();
        return new WhereToBuyPage(webDriver); }

    @Step
    public WebElement findCocktails (){
        return cocktails; }

    @Step
    public CocktailsPage navigateToCocktailsPage (){
        cocktails.click();
        return new CocktailsPage ();
    }

    @Step
    public WebElement findOurStory (){
        return ourStory; }

    @Step
    public WebElement findFaqs (){
        return faqs; }

    @Step
    public WebElement findContact (){
        return contact; }

    @Step
    public WebElement findWines (){
        return wines; }

    @Step
    public WebElement findRegionSelector (){
        Waiters.waitUntilElementIsAvailable(regionSelector);
        return regionSelector; }

    @Step
   public void waitMainPageElementPresence(){
        Waiters.waitUntilElementIsAvailable(whereToBuy);}


    @Step
    public void clickYellowTaleLogo(){
        Waiters.waitUntilElementIsAvailable(yellowTaleLogo);
        yellowTaleLogo.click(); }


    @Step
    public void selectChina(){
        Waiters.waitUntilElementIsAvailable(selectChina);
       selectChina.click(); }}
