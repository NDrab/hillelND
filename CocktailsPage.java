package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CocktailsPage extends AbstractPage{

    WebDriver webDriver;


    @FindBy(css = ".selected")
    private WebElement wineSelect;

    @FindBy(css = "[data-value='red']")
    private WebElement redWineSelect;

    @FindBy(css = "[data-value='bubbles']")
    private WebElement sparklingWineSelect;

    @FindBy (xpath = "//div[@class='tile recipe-tile']")
    private WebElement allCocktailsPresentOnThePage;

    @FindBy(xpath = "//h2[contains(text(),'Raspberry Rosé')]/../following-sibling::div/div")
    private WebElement raspberryRose;


    public CocktailsPage() {
        super();
        this.webDriver = WebDriverProvider.INSTANCE.getWebDriver();
    }
    @Step
    public WebElement WineSelect() {
        return wineSelect;
    }

    @Step
    public WebElement CocktailsPresentOnThePage() {
        return allCocktailsPresentOnThePage;
    }

    @Step ("Click to select the wine")
    public void clickToSelectWine() {
        wineSelect.click();
    }

    @Step("Click to select red wine")
    public void selectRedWine() {
        Waiters.waitUntilElementIsAvailable(redWineSelect);
        redWineSelect.click(); }

    @Step("Click to select sparkling wine")
    public void selectSparklingWine() {
        Waiters.waitUntilElementIsAvailable(sparklingWineSelect);
        sparklingWineSelect.click(); }

    @Step ("Count the number of cocktail recipes")
    public int countAllDisplayedCocktails() {
        int xpathCount = webDriver.findElements(By.xpath("//div[@class='tile recipe-tile']")).size();
        return xpathCount;}

    @Step ("Navigate to Raspberry Rose Cocktail")
    public void navigateToRaspberryRoseCocktail() {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(raspberryRose);
        actions.perform();
        raspberryRose.click();
    }}
