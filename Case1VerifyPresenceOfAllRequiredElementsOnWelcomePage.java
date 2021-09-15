import Pages.FirstPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Case1VerifyPresenceOfAllRequiredElementsOnWelcomePage {

    WebDriver webDriver;
    String siteYellowTaleUrl = "https://www.yellowtailwine.com/";

    @BeforeClass
    public void systemSettings(){
        System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
        webDriver = new EdgeDriver(); }

    @AfterClass
    public void closeBrowser() {
        webDriver.quit(); }

    @BeforeMethod
    public void NavigateToTheTestPage(){
        webDriver.get("https://www.yellowtailwine.com/"); }

   @Test
    public void VerifyTheUrlPageisCorrect() {
       Assert.assertTrue(webDriver.getCurrentUrl().equals(siteYellowTaleUrl)); }

    @Test
    public void VerifyPhraseLegalDrinkingAgeIsDisplayed(){
        FirstPage firstPage = new FirstPage(webDriver);
        Assert.assertTrue(firstPage.findLegalDrinkingAgePhrase().isEnabled()); }

    @Test
    public void VerifyCheckboxLegalDrinkingAgeIsDisplayed(){
        FirstPage firstPage = new FirstPage(webDriver);
        Assert.assertTrue(firstPage.findLegalDrinkingAgeCheckbox().isEnabled()); }

    @Test
    public void VerifyDropdownForCountrySelectIsDisplayed(){
        FirstPage firstPage = new FirstPage(webDriver);
        Assert.assertTrue(firstPage.findCountryListDropdown().isEnabled()); }

    @Test
    public void VerifyWelcomeButtonIsInactive(){
        FirstPage firstPage = new FirstPage(webDriver);
        Assert.assertTrue(firstPage.findWelcomeButton().isDisplayed());
    }}














