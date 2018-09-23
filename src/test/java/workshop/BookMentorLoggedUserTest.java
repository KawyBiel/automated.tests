package workshop;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookMentorLoggedUserTest extends BaseTest{

    @Given("^I open login website coders guru$")
    public void iOpenLoginWebsiteCodersGuru() {
        BaseTest.setUp();
        driver.get("https://men-men-s-01.codersguru.pl/login");
    }

    @When("^I log in as \"([^\"]*)\" user with password \"([^\"]*)\"$")
    public void iLogInAsUserWithPassword(String arg0, String arg1) {
        LogInPage logInPage = new LogInPage(driver);

        logInPage.logIn("testerssi7@gmail.com", "OddajMojeStoBaniek");
    }

    @And("^I select from the dropdown \"([^\"]*)\" and click find a mentor$")
    public void iSelectFromTheDropdownAndClickFindAMentor(String arg0) {
        LogInPage logInPage = new LogInPage(driver);

        logInPage.setSelectTechnologyBox();
    }

    @And("^I pick (\\d+)st mentor from the list$")
    public void iPickStMentorFromTheList(int arg0) {
        LogInPage logInPage = new LogInPage(driver);

        logInPage.chooseFirstAvailableMentor();


    }

    @And("^I enter possible date and time and write problem description \"([^\"]*)\" and go to payment$")
    public void iEnterPossibleDateAndTimeAndWriteProblemDescriptionAndGoToPayment(String arg0) {
        LogInPage logInPage = new LogInPage(driver);

        logInPage.chooseDateAndTimeAndSubmit("Nie umiem gita");
    }

    @And("^I pick credit card payment$")
    public void iPickCreditCardPayment() {
        PayUPageObject payUPageObject = new PayUPageObject(driver);

        payUPageObject.payByCreditCard();
    }

    @And("^I provide CC data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iProvideCCDataAs(String arg0, String arg1, String arg2, String arg3, String arg4) {
        PayUPageObject payUPageObject = new PayUPageObject(driver);

        payUPageObject.enterPaymentDetails("1234 5678 9999 987", "11/2020", "123","Jan Kowalski", "trelele@gmail.com");
    }

    @Then("^payment should be rejected$")
    public void paymentShouldBeRejected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException ();
    }



}
