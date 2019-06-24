package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.YouPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class YouTube_steps {

    YouPage ytobj=new YouPage();
    @Given("User is on the youtube homepage")
    public void user_is_on_the_youtube_homepage() {
        Driver.getDriver().get("https://youtube.com");
    }

    @Given("User is able to see the search box")
    public void user_is_able_to_see_the_search_box() {
        Assert.assertTrue(ytobj.searchBox.isDisplayed());

    }

    @Given("User is able to see the search button")
    public void user_is_able_to_see_the_search_button() {
        Assert.assertTrue(ytobj.searchButton.isDisplayed());
    }

    @When("User search for Funny cat videos")
    public void user_search_for_Funny_cat_videos() throws InterruptedException {
        //Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        ytobj.searchBox.sendKeys("Funny CAT videos"+Keys.ENTER);
        Thread.sleep(2000);
       // Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("User should see results related to funny cat videos")
    public void user_should_see_results_related_to_funny_cat_videos() {
       // Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actual=Driver.getDriver().getTitle();
        String expected="CAT";


        Assert.assertTrue("Does not contain", actual.contains(expected));

    }

    @When("User search for Funny dog videos")
    public void user_search_for_Funny_dog_videos() throws InterruptedException{
        Thread.sleep(2000);
        ytobj.searchBox.sendKeys("Funny DOG videos"+Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("User should see results related to funny dog videos")
    public void user_should_see_results_related_to_funny_dog_videos() {
        String actual=Driver.getDriver().getTitle();
        String expected="DOG";


        Assert.assertTrue("Does not contain", actual.contains(expected));
    }

    @When("User search for Funny pet videos")
    public void user_search_for_Funny_pet_videos() throws InterruptedException{
        Thread.sleep(2000);
        ytobj.searchBox.sendKeys("Funny PET videos"+Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("User should see results related to funny pet videos")
    public void user_should_see_results_related_to_funny_pet_videos()  {
        String actual=Driver.getDriver().getTitle();
        String expected="PET";


        Assert.assertTrue("Does not contain", actual.contains(expected));
    }


}
