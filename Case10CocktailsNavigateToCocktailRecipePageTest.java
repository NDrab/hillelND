import Pages.CocktailsPage;
import Pages.FirstPage;
import Pages.MainPage;
import Pages.WebDriverProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case10CocktailsNavigateToCocktailRecipePageTest extends TestNGRunner {

    @Test
    public void verifyNewPageIngredientsAreDisplayed(){
    final String raspBerryRoseExpectedURL = "https://www.yellowtailwine.com/recipe/raspberry-rose/";

    FirstPage firstPage = new FirstPage();
    //firstPage.navigateToMainPageAsEUCustomer();
    MainPage mainPage = firstPage.navigateToMainPageAsEUCustomer();
    mainPage.clickOnMenu();
    mainPage.waitMainPageElementPresence();
    CocktailsPage cocktailsPage = mainPage.navigateToCocktailsPage();
    cocktailsPage.navigateToRaspberryRoseCocktail();

    Assert.assertEquals(WebDriverProvider.INSTANCE.getWebDriver().getCurrentUrl(),raspBerryRoseExpectedURL);
    }}
