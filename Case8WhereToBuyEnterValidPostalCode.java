import Pages.FirstPage;
import Pages.MainPage;
import Pages.WhereToBuyPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Case8WhereToBuyEnterValidPostalCode {

    WebDriver webDriver;
    String siteYellowTaleUrl = "https://www.yellowtailwine.com/";

    @BeforeClass
    public void systemSettings(){
        System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
        webDriver = new EdgeDriver(); }

    @BeforeMethod
    public void navigateToTheTestPage(){
        webDriver.get(siteYellowTaleUrl); }

    @AfterClass
    public void closeBrowser() {
        webDriver.quit();}

    @Test
    public void verifyResultsOfSearchAreDisplayed () {

    FirstPage firstPage = new FirstPage(webDriver);

    MainPage mainPage = firstPage.navigateToMainPageAsEUCustomer();
    mainPage.clickOnMenu();
    mainPage.waitMainPageElementPresence();

    WhereToBuyPage whereToBuyPage = mainPage.navigateToFindWhereToBuy();
    whereToBuyPage.SearchAreaByZipCode();

    Assert.assertTrue(whereToBuyPage.findMap().isDisplayed()); }}
