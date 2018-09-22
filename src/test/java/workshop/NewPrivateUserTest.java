package workshop;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class NewPrivateUserTest extends BaseTest{
    @Given("^I open website coders guru$")
        public void iOpenWebsiteCodersGuru(){
        BaseTest.setUp();
        driver.get("https://men-men-s-01.codersguru.pl/");
    }


    @When("^I click on registration page$")
    public void iClickOnRegistrationPage() {
        HomePage homePage = new HomePage(driver);
        homePage.goToRegistrationPage();
    }

    @And("^I enter name \"([^\"]*)\" surname \"([^\"]*)\"$")
    public void iEnterNameSurname(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select private user$")
    public void iSelectPrivateUser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I provide password \"([^\"]*)\"$")
    public void iProvidePassword(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I provide address <city> <zip> <street> <no>$")
    public void iProvideAddressCityZipStreetNo() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I check that I have read the terms$")
    public void iCheckThatIHaveReadTheTerms() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click registration button$")
    public void iClickRegistrationButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User should be successfully created$")
    public void userShouldBeSuccessfullyCreated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}

