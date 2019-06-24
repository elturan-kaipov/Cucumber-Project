package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.DataTablePage;
import utilities.Driver;

public class DataTable_steps {
    DataTablePage dobj=new DataTablePage();

    @Given("User on the datatables homepage")
    public void user_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @Given("User clicks on New Button")
    public void user_clicks_on_New_Button() {
        dobj.newButton.click();
    }

    @Then("User should see Create new Entry Box")
    public void user_should_see_Create_new_Entry_Box() {
      Assert.assertTrue(dobj.createBox.isDisplayed());

    }

    @Then("User should enter firstname")
    public void user_should_enter_firstname() {
       dobj.firstname.sendKeys("Max");
    }

    @Then("User should enter lastname")
    public void user_should_enter_lastname() {
       dobj.lasttname.sendKeys("Eto");
    }

    @Then("User should enter position")
    public void user_should_enter_position() {
       dobj.position.sendKeys("SDET");
    }

    @Then("User should enter office")
    public void user_should_enter_office() {
      dobj.office.sendKeys("Chicago");
    }

    @Then("User should enter extension")
    public void user_should_enter_extension() {
        dobj.extension.sendKeys("A123");
    }

    @Then("User should enter start date")
    public void user_should_enter_start_date() {
       dobj.startDate.sendKeys("2019-06-06");
    }

    @Then("User should enter salary")
    public void user_should_enter_salary() {
        dobj.salary.sendKeys("155000");
    }

    @Then("User should click on create button")
    public void user_should_click_on_create_button() {
       dobj.createButton.click();
    }

    @Then("User enters firs name to search box")
    public void user_enters_firs_name_to_search_box() throws InterruptedException {
       dobj.findButton.sendKeys("Max");
       Thread.sleep(2000);
    }

    @Then("User should see first name is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table() {
        String actual=dobj.firstCell.getText();
        System.out.println(actual);
        String expected="Max";
        Assert.assertTrue(actual.contains(expected));
    }


    @Then("User should enter firstname \"([^\"]*)\"")
    public void user_should_enter_firstname(String string) {
       dobj.firstname.sendKeys(string);
    }

    @Then("User should enter lastname \"([^\"]*)\"")
    public void user_should_enter_lastname(String string) {
        dobj.lasttname.sendKeys(string);
        }


    @Then("User should enter position \"([^\"]*)\"")
    public void user_should_enter_position(String string) {
        dobj.position.sendKeys(string);
    }

    @Then("User should enter office \"([^\"]*)\"")
    public void user_should_enter_office(String string) {
        dobj.office.sendKeys(string);
    }

    @Then("User should enter extension \"([^\"]*)\"")
    public void user_should_enter_extension(String string) {
        dobj.extension.sendKeys(string);
    }

    @Then("User should enter start date \"([^\"]*)\"")
    public void user_should_enter_start_date(String string) throws InterruptedException {
        Thread.sleep(2000);
        dobj.startDate.sendKeys(string);
        Thread.sleep(2000);
    }

    @Then("User should enter salary \"([^\"]*)\"")
    public void user_should_enter_salary(String string) {
        dobj.salary.sendKeys(string);
    }

    @Then("User enters firs name \"([^\"]*)\" to search box")
    public void user_enters_firs_name_to_search_box(String string) {
        dobj.findButton.sendKeys(string);
    }

    @Then("User should see first name \"([^\"]*)\" is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table(String string) {
        String actual=dobj.firstCell.getText();
        System.out.println(actual);
       // Assert.fail();
        Assert.assertTrue(actual.contains(string));
    }



}
