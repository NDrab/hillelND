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
  
   Assert.assertEquals(firstPage.selectCountryFromDropDown(),"Europe");
   firstPage.waitUntilWelcomeButtonIsAvailable();
   firstPage.clickWelcomeButton();

   //after navigation to main page as a customer, the confirmation of legal age should be absent,as a result l.size=0
   List<WebElement> l= webDriver.findElements(By.xpath("//*[contains(text(),'I am of legal drinking age in')]"));
   Assert.assertTrue(l.size()==0); }}


