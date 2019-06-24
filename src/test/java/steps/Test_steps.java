package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Test_steps {

    @When("user goes to google app")
    public void user_goes_to_google_app() {
        System.out.println("Selenium is going to google");
    }

    @Then("user search for apple")
    public void user_search_for_apple() {
        System.out.println("user searching for a word apple");
    }

    @Then("user should see apple related results")
    public void user_should_see_apple_related_results() {
        System.out.println("user checking the results of search");
        Assert.fail("failing for a reason");
    }

    @Then("user tests something")
    public void user_tests_something() {
        System.out.println("user doing something");
    }

}
