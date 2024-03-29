package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YouPage {
    WebDriver driver;

    public YouPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchBox;

    @FindBy(id = "search-icon-legacy")
    public WebElement searchButton;

}
