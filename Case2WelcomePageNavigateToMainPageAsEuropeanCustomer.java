import Pages.FirstPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;


public class Case2WelcomePageNavigateToMainPageAsEuropeanCustomer {

    WebDriver webDriver;
    String siteYellowTaleUrl = "https://www.yellowtailwine.com/";

    @BeforeClass
    public void systemSettings(){
        System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
        webDriver = new EdgeDriver(); }

    @BeforeMethod
    public void navigateToTheTestPage(){
        webDriver.get("https://www.yellowtailwine.com/"); }

    @AfterClass
    public void closeBrowser() {
        webDriver.quit();}


    @Test
   public void verifyNavigationToMainPage() {

   FirstPage firstPage = new FirstPage(webDriver);

   firstPage.clickOnCheckbox();
   firstPage.selectCountryFromDropDown();
   //Assert.assertEquals(firstPageView.SelectCountryFromDropDown(),"Europe");
   firstPage.waitUntilWelcomeButtonIsAvailable();
   firstPage.clickWelcomeButton();

   firstPage.assertNavigationToMainPageAsCustomer();//this is an assert
}}


