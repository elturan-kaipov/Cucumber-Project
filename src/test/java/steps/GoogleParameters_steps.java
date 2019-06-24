package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class GoogleParameters_steps {

    GooglePage gpobj=new GooglePage();

    @Given("User on the homeoage of Google")
    public void user_on_the_homeoage_of_Google() {
        Driver.getDriver().get("https://google.com");
    }

    @When(value = "User enters \"([^\"]*)\"")
    public void user_enters(String string) {
        gpobj.searchBox.sendKeys(string+ Keys.ENTER);

    }

    @Then("User should see \"([^\"]*)\" in the title")
    public void user_should_see_in_the_title(String string) {
        String actual=Driver.getDriver().getTitle();
        String expected=string +" - Google Search";

        Assert.assertTrue(actual.contains(expected));

    }

}
