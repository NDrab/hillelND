import Pages.FirstPage;
import Pages.MainPage;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Case3MainPageAllRequiredElementsAreDisplayed {

    WebDriver webDriver;
    String siteYellowTaleUrl = "https://www.yellowtailwine.com/";

    @BeforeClass
    public void systemSettings(){
        System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
        webDriver = new EdgeDriver(); }

    @BeforeMethod
    public void navigateToTheTestPage(){
        webDriver.get("https://www.yellowtailwine.com/");
    }

    @AfterClass
    public void closeBrowser() {
        webDriver.quit();}


    @Test
    public void verifyMenuButtonPresence(){
    FirstPage firstPage = new FirstPage(webDriver);

    MainPage mainPage = firstPage.navigateToMainPageAsEUCustomer();
    Assert.assertTrue(mainPage.findMenu().isEnabled()); }


    @Test
    public void verifyWelcomePhraseIsPresent(){
    MainPage mainPage = new MainPage(webDriver);
    Assert.assertEquals(mainPage.readWelcomePhrase(),"WELCOME TO THE WORLD OF\n" +
                "[YELLOW TAIL]"); }

   @Test
    public void verifySecondPhraseIsPresent(){
    MainPage mainPage = new MainPage(webDriver);
    Assert.assertEquals(mainPage.readSecondWelcomePhrase(),
                "We are passionate about creating great tasting, quality wines for everyone to enjoy"); }

    @Test
    public void verifyFindYourWineButtonPresence(){
    MainPage mainPage = new MainPage(webDriver);
    Assert.assertTrue(mainPage.findYourWineElement().isDisplayed()); }

    @Test
    public void verifyFooterIsPresent(){
    MainPage mainPage = new MainPage(webDriver);
    Assert.assertTrue(mainPage.findFooter().isEnabled()); }}

