package workshop.tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import workshop.pages.HomePage;
import workshop.pages.RegistrationPage;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

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
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("register"));
    }

    @And("^I select private user$")
    public void iSelectPrivateUser() {
        RegistrationPage registration = new RegistrationPage(driver);
        registration.clickPrivateButton();

        assertEquals("active", registration.isPrivatePersonSelected ());//metoda zwraca Stringa z nazwą klasy
    }



    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String mail) {
        RegistrationPage registration = new RegistrationPage(driver);
        registration.enterMail(mail);
    }

    @And("^I enter name \"([^\"]*)\" surname \"([^\"]*)\"$")
    public void iEnterNameSurname(String arg0, String arg1) {
        RegistrationPage registration = new RegistrationPage(driver);

        registration.enterName(arg0);
        registration.enterSurname(arg1);
    }

    @And("^I provide password \"([^\"]*)\"$")
    public void iProvidePassword(String pw)  {
        RegistrationPage registration = new RegistrationPage(driver);
        registration.enterPassword (pw);
    }

    @And("^I provide address city \"([^\"]*)\" zip \"([^\"]*)\" street \"([^\"]*)\" no \"([^\"]*)\"$")
    public void iProvideAddressCityZipStreetNo(String city, String zip, String street, String no) {
        RegistrationPage registration = new RegistrationPage(driver);
        registration.enterCity (city);
        registration.enterZip (zip);
        registration.enterStreet (street);
        registration.enterNumber (no);
    }

    @And("^I check that I have read the terms$")
    public void iCheckThatIHaveReadTheTerms(){
        RegistrationPage registration = new RegistrationPage(driver);
        registration.clickOnCheckBox();

    }

    @And("^I click registration button$")
    public void iClickRegistrationButton()  {
        RegistrationPage registration = new RegistrationPage(driver);
        registration.clickRegister();

    }

    @Then("^User with name \"([^\"]*)\" should be successfully created$")
    public void userShouldBeSuccessfullyCreated(String name) {
        RegistrationPage registration = new RegistrationPage(driver);

        assertTrue(driver.getCurrentUrl().contains ("confirmed"));

        assertEquals(registration.getLoggedUserName(), name);
    }


}

