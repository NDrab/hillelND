import Pages.FirstPage;
import Pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Case3MainPageAllRequiredElementsAreDisplayedTest extends TestNGRunner {

    @Test
    public void verifyMenuButtonPresence(){
    FirstPage firstPage = new FirstPage();

    MainPage mainPage = firstPage.navigateToMainPageAsEUCustomer();
    Assert.assertTrue(mainPage.findMenu().isEnabled()); }


    @Test
    public void verifyWelcomePhraseIsPresent(){
    final String expectedWelcomePhrase = "WELCOME TO THE WORLD OF\n" + "[YELLOW TAIL]";

    MainPage mainPage = new MainPage();
    Assert.assertEquals(mainPage.readWelcomePhrase(),expectedWelcomePhrase); }

   @Test
    public void verifySecondPhraseIsPresent(){
    final String expectedSecondWelcomePhrase = "We are passionate about creating great tasting, quality wines for everyone to enjoy";
    MainPage mainPage = new MainPage();
    Assert.assertEquals(mainPage.readSecondWelcomePhrase(), expectedSecondWelcomePhrase); }

    @Test
    public void verifyFindYourWineButtonPresence(){
    MainPage mainPage = new MainPage();
    Assert.assertTrue(mainPage.findYourWineElement().isDisplayed()); }

    @Test
    public void verifyFooterIsPresent(){
    MainPage mainPage = new MainPage();
    Assert.assertTrue(mainPage.findFooter().isEnabled()); }}

