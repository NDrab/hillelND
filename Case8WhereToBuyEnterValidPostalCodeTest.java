import Pages.FirstPage;
import Pages.MainPage;
import Pages.WhereToBuyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case8WhereToBuyEnterValidPostalCodeTest extends TestNGRunner {

    @Test
    public void verifyResultsOfSearchAreDisplayed () {

    FirstPage firstPage = new FirstPage();

    MainPage mainPage = firstPage.navigateToMainPageAsEUCustomer();
    mainPage.clickOnMenu();
    mainPage.waitMainPageElementPresence();

    WhereToBuyPage whereToBuyPage = mainPage.navigateToFindWhereToBuy();
    whereToBuyPage.searchAreaByZipCode();

    Assert.assertTrue(whereToBuyPage.findMap().isDisplayed()); }}
