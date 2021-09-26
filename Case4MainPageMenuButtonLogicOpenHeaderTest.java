import Pages.FirstPage;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case4MainPageMenuButtonLogicOpenHeaderTest extends TestNGRunner {

     @Test
    public void VerifyHeaderPresence(){
    FirstPage firstPage = new FirstPage();

    MainPage mainPage = firstPage.navigateToMainPageAsEUCustomer();
    mainPage.clickOnMenu();

    mainPage.waitMainPageElementPresence();

    Assert.assertTrue(mainPage.findWines().isDisplayed());
    Assert.assertTrue(mainPage.findWhereToBuy().isDisplayed());
    Assert.assertTrue(mainPage.findCocktails().isDisplayed());
    Assert.assertTrue(mainPage.findOurStory().isDisplayed());
    Assert.assertTrue(mainPage.findFaqs().isDisplayed());
    Assert.assertTrue(mainPage.findContact().isDisplayed());
    Assert.assertTrue(mainPage.findRegionSelector().isDisplayed());
     }}


