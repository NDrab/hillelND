import Pages.FirstPage;
import Pages.WebDriverProvider;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.*;
import static Pages.Constant.YELLOW_TALE_URL;

public class Case1VerifyPresenceOfAllRequiredElementsOnWelcomePageTest extends TestNGRunner {

    @Severity(SeverityLevel.BLOCKER)
    @Description ("Test verifies that URL is correct")
    @Test
    public void verifyTheUrlPageisCorrect() {
       Assert.assertTrue(WebDriverProvider.INSTANCE.getWebDriver().getCurrentUrl().equals(YELLOW_TALE_URL)); }

    @Severity(SeverityLevel.CRITICAL)
    @Description ("Test verifies that phrase LegalDrinkingAge is displayed")
    @Test
    public void verifyPhraseLegalDrinkingAgeIsDisplayed(){
        FirstPage firstPage = new FirstPage();
        Assert.assertTrue(firstPage.findLegalDrinkingAgePhrase().isEnabled()); }

    @Severity(SeverityLevel.CRITICAL)
    @Description ("Test verifies that checkbox LegalDrinkingAge is displayed")
    @Test
    public void verifyCheckboxLegalDrinkingAgeIsDisplayed(){
        FirstPage firstPage = new FirstPage();
        Assert.assertTrue(firstPage.findLegalDrinkingAgeCheckbox().isEnabled()); }

    @Severity(SeverityLevel.CRITICAL)
    @Description ("Test verifies that Dropdown for Country selection is displayed")
    @Test
    public void verifyDropdownForCountrySelectIsDisplayed(){
        FirstPage firstPage = new FirstPage();
        Assert.assertTrue(firstPage.findCountryListDropdown().isEnabled()); }

    @Severity(SeverityLevel.CRITICAL)
    @Description ("Test verifies that WelcomeButton is Inactive")
    @Test
    public void verifyWelcomeButtonIsInactive(){
        FirstPage firstPage = new FirstPage();
        Assert.assertFalse(firstPage.findWelcomeButton().isEnabled());
    }}














