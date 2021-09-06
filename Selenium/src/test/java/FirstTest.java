import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FirstTest {

    @Test
     public void navigateToFreeNavigation(){

        File file = new File("src/test/resources/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());

        WebDriver webDriver = new EdgeDriver();

        String baseUrl = "https://ithillel.ua/";
        webDriver.get(baseUrl);

        By freeConsultButtonPath = By.id ("btn-consultation-hero");

        WebElement freeConButton = webDriver.findElement(freeConsultButtonPath);

        freeConButton.click();

        WebElement nameField = webDriver.findElement(By.id("input-name-consultation"));

        nameField.click();

        nameField.sendKeys("Nadia");

        Assert.assertTrue(nameField.equals("Nadia"));
        Assert.assertTrue(webDriver.getCurrentUrl().equals("https://ithillel.ua/"));

        webDriver.quit();

        System.out.println("Successful");



    }


    }


