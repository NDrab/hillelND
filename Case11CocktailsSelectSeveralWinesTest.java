import Pages.CocktailsPage;
import Pages.FirstPage;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case11CocktailsSelectSeveralWinesTest extends TestNGRunner {

    @Test
    public void verifyMultipleCocktailsSelect() {

        final int expectedNumberOfCocktails = 20;
        final String expectedTextInSelectField = "Multiple";

        FirstPage firstPage = new FirstPage();
        MainPage mainPage = firstPage.navigateToMainPageAsEUCustomer();
        mainPage.clickOnMenu();
        mainPage.waitMainPageElementPresence();

        CocktailsPage cocktailsPage = mainPage.navigateToCocktailsPage();
        cocktailsPage.clickToSelectWine();
        cocktailsPage.selectRedWine();
        cocktailsPage.selectSparklingWine();

        String textInSelectField = cocktailsPage.WineSelect().getText();

        Assert.assertTrue(textInSelectField.equals(expectedTextInSelectField));
        Assert.assertEquals(cocktailsPage.countAllDisplayedCocktails(),expectedNumberOfCocktails);
    }}
