import Pages.WebDriverProvider;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static Pages.Constant.*;

public class TestNGRunner {

    @BeforeClass
    public void systemSettings(){
        WebDriverProvider.INSTANCE.getWebDriver();
    }

    @BeforeMethod
    public void navigateToTheTestPage(){
        WebDriverProvider.INSTANCE.getWebDriver().get(YELLOW_TALE_URL); }

    @AfterMethod(alwaysRun = true)
    public void afterTest(ITestResult result){
       if (!result.isSuccess()){
           makeScreenshot();
       }
        WebDriverProvider.INSTANCE.getWebDriver().quit();
        WebDriverProvider.INSTANCE.removeWebriver();
    }

    @Attachment (value ="Page screenshot", type ="image/png")
    public byte [] makeScreenshot(){
        return ((TakesScreenshot) WebDriverProvider.INSTANCE.getWebDriver()).getScreenshotAs(OutputType.BYTES);}
    }



