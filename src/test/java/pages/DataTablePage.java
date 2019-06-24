package pages;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablePage {
    WebDriver driver;

    public DataTablePage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy(className = "DTED_Lightbox_Content")
    public WebElement createBox;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lasttname;

    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement position;

    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement office;

    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extension;

    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDate;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salary;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButton;


    @FindBy(xpath = "//input[@type='search']")
    public WebElement findButton;


    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement firstCell;
}
//    Then User should see Create new Entry Box
//        And User should enter firstname
//        And User should enter lastname
//        And User should enter position
//        And User should enter office
//        And User should enter extension
//        And User should enter start date
//        And User should enter salary
//        Then User should click on create button
//        And User enters firs name to search box
//        Then User should see first name is inserted in the table