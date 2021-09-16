package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class CocktailsPage {
    WebDriver webDriver;

    @FindBy (css = ".selected")
    private WebElement wineSelect;


    @FindBy(css = "[data-value='red']")
    private WebElement redWineSelect;

    @FindBy(css = "[data-value='bubbles']")
    private WebElement sparklingWineSelect;

    //red wine list

    @FindBy(xpath = "//h2[contains(text(),'Raspberry Rosé')]/../following-sibling::div/div")
    private WebElement raspberryRose;

    @FindBy(xpath = "//h2[contains(text(),'Red Wine Spritzer')]")
    private WebElement redWineSpritzer;

    @FindBy(xpath = "//h2[contains(text(),'Mulled Wine')]")
    private WebElement mulledWine;

    @FindBy(xpath = "//h2[contains(text(),'Chocolate Fondue')]")
    private WebElement chocolateFondue;

    @FindBy(xpath = "//h2[contains(text(),'Yellow Tailshake')]")
    private WebElement yellowTailshake;

    @FindBy(xpath = "//h2[contains(text(),'Red Hot Chocolate')]")
    private WebElement redHotChocolate;

    @FindBy(xpath = "//h2[contains(text(),'Winter Red Spritz')]")
    private WebElement winterRedSpritz;

    @FindBy(xpath = "//h2[contains(text(),'Very Berry Slushie')]")
    private WebElement veryBerrySlushie;

    @FindBy(xpath = "//h2[contains(text(),'Cabernet Berry-Licious')]")
    private WebElement cabernetBerryLicious;

    @FindBy(xpath = "//h2[contains(text(),'Blooming Shiraz')]")
    private WebElement bloomingShiraz;



    //sparkling wine list

    @FindBy(xpath = "//h2[contains(text(),'Prosecco Pear Punch')]")
    private WebElement proseccoPearPunch;

    @FindBy(xpath = "//h2[contains(text(),'Pink Lemonade')]")
    private WebElement pinkLemonade;

    @FindBy(xpath = "//h2[contains(text(),'Sorbet Prosecco')]")
    private WebElement sorbetProsecco;

    @FindBy(xpath = "//h2[contains(text(),'Cranberry Christmas Crush')]")
    private WebElement cranberryChristmasCrush;

    @FindBy(xpath = "//h2[contains(text(),'Bumble Bee Bevvy')]")
    private WebElement bumbleBeeBevvy;

    @FindBy(xpath = "//h2[contains(text(),'Blackberry Lavendar Bubble')]")
    private WebElement blackberryLavendarBubbles;

    @FindBy(xpath = "//h2[contains(text(),'Green Thumb')]")
    private WebElement greenThumb;

    @FindBy(xpath = "//h2[contains(text(),'Prosecco Plum Cocktail')]")
    private WebElement proseccoPlumCocktail;

    @FindBy(xpath = "//h2[contains(text(),'Tea Time Spritzer')]")
    private WebElement teaTimeSpritzer;

    @FindBy(xpath = "//h2[contains(text(),'Fig & Sprig Spritz')]")
    private WebElement figSprigSpritz;

    @FindBy(xpath = "//h2[contains(text(),'Pink Paradise')]")
    private WebElement pinkParadise;



    public CocktailsPage (WebDriver webDriver) { this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);}

    public WebElement WineSelect(){
        return wineSelect;
    }

    public void clickToSelectWine(){
        wineSelect.click();
    }

    public void selectRedWine(){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.visibilityOf(redWineSelect));
        redWineSelect.click(); }

    public void selectSparklingWine(){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.visibilityOf(sparklingWineSelect));
        sparklingWineSelect.click();
    }

    public void assertAllRedCocktailsAreDisplayed() {

        List<WebElement> listOfAllCocktails = new ArrayList<WebElement>();

        listOfAllCocktails.add(mulledWine);
        listOfAllCocktails.add(redWineSpritzer);
        listOfAllCocktails.add(redHotChocolate);
        listOfAllCocktails.add(yellowTailshake);
        listOfAllCocktails.add(bloomingShiraz);
        listOfAllCocktails.add(cabernetBerryLicious);
        listOfAllCocktails.add(veryBerrySlushie);
        listOfAllCocktails.add(winterRedSpritz);
        listOfAllCocktails.add(chocolateFondue);

        for (WebElement element : listOfAllCocktails) {
            Assert.assertTrue(element.isDisplayed());
        }
    }

    public void assertAllSparklingCocktailsAreDisplayed(){

        List<WebElement>listOfAllCocktails = new ArrayList<WebElement>();

        listOfAllCocktails.add(pinkLemonade);
        listOfAllCocktails.add(pinkParadise);
        listOfAllCocktails.add(proseccoPearPunch);
        listOfAllCocktails.add(sorbetProsecco);
        listOfAllCocktails.add(cranberryChristmasCrush);
        listOfAllCocktails.add(bumbleBeeBevvy);
        listOfAllCocktails.add(blackberryLavendarBubbles);
        listOfAllCocktails.add(greenThumb);
        listOfAllCocktails.add(proseccoPearPunch);
        listOfAllCocktails.add(teaTimeSpritzer);
        listOfAllCocktails.add(figSprigSpritz);
        listOfAllCocktails.add(proseccoPlumCocktail);

        for (WebElement element:listOfAllCocktails) {
            Assert.assertTrue(element.isDisplayed()); }

    }
    public void navigateToRaspberryRoseCocktail(){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(raspberryRose);
        actions.perform();
        raspberryRose.click();
    }


}
