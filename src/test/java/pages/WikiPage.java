package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WikiPage {
    WebDriver driver;

    public WikiPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchBox;

    @FindBy(xpath = " //h1[@id='firstHeading']")
    public WebElement wikiFirstHeader;
}
