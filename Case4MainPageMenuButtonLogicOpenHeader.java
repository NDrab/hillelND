import Pages.FirstPage;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Case4MainPageMenuButtonLogicOpenHeader {

    WebDriver webDriver;
    String siteYellowTaleUrl = "https://www.yellowtailwine.com/";

    @BeforeClass
    public void systemSettings(){
        System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
        webDriver = new EdgeDriver(); }

    @BeforeMethod
    public void NavigateToTheTestPage(){
        webDriver.get("https://www.yellowtailwine.com/"); }

    @AfterClass
    public void closeBrowser() {
        webDriver.quit();}

     @Test
    public void VerifyHeaderPresence(){
    FirstPage firstPage = new FirstPage(webDriver);

    MainPage mainPage = firstPage.navigateToMainPageAsEUCustomer();
    mainPage.clickOnMenu();

    mainPage.waitMainPageElementPresence();

    Assert.assertTrue(mainPage.findWines().isDisplayed());
    Assert.assertTrue(mainPage.findWhereToBuy().isDisplayed());
    Assert.assertTrue(mainPage.findCocktails().isDisplayed());
    Assert.assertTrue(mainPage.findOurStory().isDisplayed());
    Assert.assertTrue(mainPage.findFaqs().isDisplayed());
    Assert.assertTrue(mainPage.findContact().isDisplayed());
    Assert.assertTrue(mainPage.findRegionSelector().isDisplayed());}}


