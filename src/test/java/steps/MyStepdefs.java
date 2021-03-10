package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Before
    public void doSomethingBefore() {
        System.out.println("This is the @Before hook");
    }

    @After
    public void doSomethingAfter(){
        System.out.println("This is the @After hook");
    }

    @BeforeStep
    public void doSomethingBeforeStep(){
        System.out.println("This is running BEFORE every step");
    }

    @AfterStep
    public void doSomethingAfterStep(){
        System.out.println("This is running AFTER every step");

    }

    @Given("I am on the registration page {string}")
    public void iAmOnTheRegistrationPage(String url) {
        System.out.println("You are on the registration page: " + url);
    }

    @When("I type first name {string} to firstname field")
    public void iTypeFirstNameToFirstnameField(String firstname) {
        System.out.println("You filled in firstname field with: " + firstname);
    }

    @Then("I should see {string} message")
    public void iShouldSeeMessage(String expectedMessage) {
        String actualMessage = "Welcome";
        //System.out.println("Your expectedMessage is " + expectedMessage);
        Assert.assertEquals("Actual message does not match expected message", expectedMessage, actualMessage);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("my score should be {int}")
    public void myScoreShouldBe(int expectedScore) {
        int actualScore = 0;
        Assert.assertEquals("Actual score does not match expected score", expectedScore, actualScore);
    }
}
