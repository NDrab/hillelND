import Pages.FirstPage;
import Pages.MainPage;
import Pages.WebDriverProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Case6MainPageGlobalNavLogicTest extends TestNGRunner {

        @Test
        public void VerifyLanguageIsChanged() {

        final String chinaVersionExpectedURL= "https://www.yellowtailwine.cn/";

        FirstPage firstPage = new FirstPage();

        MainPage mainPage = firstPage.navigateToMainPageAsEUCustomer();
        mainPage.clickOnMenu();
        mainPage.findRegionSelector().click();
        mainPage.selectChina();

        Assert.assertEquals(WebDriverProvider.INSTANCE.getWebDriver().getCurrentUrl(), chinaVersionExpectedURL); }}
