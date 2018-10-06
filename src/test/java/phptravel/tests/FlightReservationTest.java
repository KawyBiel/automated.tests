package phptravel.tests;

import common.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import phptravel.pages.FlightSelectionPage;
import phptravel.pages.InvoiceDetailsPage;
import phptravel.pages.InvoicePage;

public class FlightReservationTest extends BaseTest {
    @Given("^I open website phptravel$")
    public void iOpenWebsitePhptravel() {
        BaseTest.setUp();
        driver.get("https://www.phptravels.net/flights");
    }

    @When("^I reserve two way flights from \"([^\"]*)\" to \"([^\"]*)\" on dates \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iReserveTwoWayFlightsFromToOnDatesAnd(String arg0, String arg1, String arg2, String arg3) {
        FlightSelectionPage flightSelectionPage = new FlightSelectionPage(driver);
        flightSelectionPage.enterDepartureAndArrival(arg0, arg1, arg2, arg3);
    }

    @And("^I pick first available flight (\\d+)$")
    public void iPickFirstAvailableFlight(int arg0) {
        FlightSelectionPage flightSelectionPage = new FlightSelectionPage(driver);
        flightSelectionPage.pickFlight(arg0);
    }

    @And("^I book as a guest with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iBookAsAGuestWith(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        InvoiceDetailsPage invoiceDetailsPage = new InvoiceDetailsPage (driver);
        invoiceDetailsPage.enterInvoiceDetails(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @Then("^I should see prepared invoice$")
    public void iShouldSeePreparedInvoice() {
        InvoicePage invoicePage = new InvoicePage (driver);
        invoicePage.takeScreenshot();
    }
}
