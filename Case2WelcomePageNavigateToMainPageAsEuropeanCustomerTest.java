import Pages.FirstPage;
import Pages.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class Case2WelcomePageNavigateToMainPageAsEuropeanCustomerTest extends TestNGRunner{

    @Test
   public void verifyNavigationToMainPage() {

   FirstPage firstPage = new FirstPage();

   firstPage.clickOnCheckbox();
   firstPage.selectCountryFromDropDown();
   Assert.assertEquals(firstPage.selectCountryFromDropDown(),"Europe");
   firstPage.clickWelcomeButton();

   //after navigation to main page as a customer, the confirmation of legal age should be absent,as a result l.size=0
   List<WebElement> l= WebDriverProvider.INSTANCE.getWebDriver().findElements(By.xpath("//*[contains(text(),'I am of legal drinking age in')]"));
   Assert.assertTrue(l.size()==0); }}


