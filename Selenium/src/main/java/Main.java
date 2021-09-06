import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Main {

    public static void main (String [] args){

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

        webDriver.quit();

        System.out.println("Successful");
    }
}
