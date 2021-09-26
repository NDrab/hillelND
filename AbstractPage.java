package Pages;

import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
    public AbstractPage (){
        PageFactory.initElements(WebDriverProvider.INSTANCE.getWebDriver(), this);
    }}

