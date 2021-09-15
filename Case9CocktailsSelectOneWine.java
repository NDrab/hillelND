import Pages.CocktailsPage;
import Pages.FirstPage;
import Pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Case9CocktailsSelectOneWine {

    WebDriver webDriver;
    String siteYellowTaleUrl = "https://www.yellowtailwine.com/";

    @BeforeClass
    public void systemSettings(){
        System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
        webDriver = new EdgeDriver(); }

    @BeforeMethod
    public void NavigateToTheTestPage(){
        webDriver.get(siteYellowTaleUrl); }

    @AfterClass
    public void closeBrowser() {
        webDriver.quit();}

    @Test
    public void VerifySevenRecipesAreDisplayed () {

        FirstPage firstPage = new FirstPage(webDriver);

        MainPage mainPage = firstPage.navigateToMainPageAsEUCustomer();
        mainPage.clickOnMenu();
        mainPage.waitMainPageElementPresence();

        CocktailsPage cocktailsPage = mainPage.navigateToCocktailsPage();
        cocktailsPage.clickToSelectWine();
        cocktailsPage.selectRedWine();

        cocktailsPage.assertAllRedCocktailsAreDisplayed();







    }
}
