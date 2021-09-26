;import Pages.CocktailsPage;
import Pages.FirstPage;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Case9CocktailsSelectOneWineTest extends TestNGRunner {

    @Test
    public void VerifyNineRecipesAreDisplayed() {

        final int expectedNumberOfCocktailRecipes = 9;

        FirstPage firstPage = new FirstPage();

        MainPage mainPage = firstPage.navigateToMainPageAsEUCustomer();
        mainPage.clickOnMenu();
        mainPage.waitMainPageElementPresence();

        CocktailsPage cocktailsPage = mainPage.navigateToCocktailsPage();
        cocktailsPage.clickToSelectWine();
        cocktailsPage.selectRedWine();

        Assert.assertEquals(cocktailsPage.countAllDisplayedCocktails(), expectedNumberOfCocktailRecipes);
    }}
