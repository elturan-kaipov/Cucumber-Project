package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.WikiPage;
import utilities.Driver;

public class Wiki_steps {
    WikiPage wpObj=new WikiPage();

    @Given("User is on the wikipedia homepage")
    public void user_is_on_the_wikipedia_homepage() {
        Driver.getDriver().get("https://wikipedia.com");

    }

    @When("User enters steve jobs to search bar and clicks enter")
    public void user_enters_steve_jobs_to_search_bar_and_clicks_enter() {
        wpObj.searchBox.sendKeys("steve jobs"+ Keys.ENTER);
    }

    @Then("User should see the first header is displaying steve jobs")
    public void user_should_see_the_first_header_is_displaying_steve_jobs() {
            String actual=wpObj.wikiFirstHeader.getText();
            String expected="Steve Jobs";
        Assert.assertTrue(actual.equals(expected));
    }


}
