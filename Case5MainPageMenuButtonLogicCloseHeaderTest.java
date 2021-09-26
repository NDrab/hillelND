import Pages.FirstPage;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case5MainPageMenuButtonLogicCloseHeaderTest extends TestNGRunner {

    @Test
    public void verifyMenuButtonIsVisible() {

    FirstPage firstPage = new FirstPage();

    MainPage mainPage = firstPage.navigateToMainPageAsEUCustomer();
    mainPage.findMenu().click();
    mainPage.waitMainPageElementPresence();
    mainPage.clickYellowTaleLogo();

    Assert.assertTrue(mainPage.findMenu().isDisplayed());}}

