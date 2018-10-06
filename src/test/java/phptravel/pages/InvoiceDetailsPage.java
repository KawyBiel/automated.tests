package phptravel.pages;

import common.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvoiceDetailsPage extends BasePage{
    public InvoiceDetailsPage(WebDriver driver){

        super(driver);
    }

    @FindBy(name = "firstname")
    private WebElement firstNameOnInvoice;

    @FindBy(name = "lastname")
    private WebElement lastNameOnInvoice;

    @FindBy(name = "email")
    private WebElement emailOnInvoice;

    @FindBy(name = "confirmemail")
    private WebElement emailConfimation;

    @FindBy(name = "phone")
    private WebElement phoneOnInvoice;

    @FindBy(name = "address")
    private WebElement addressOnInvoice;

    @FindBy (xpath="/html/body/div[4]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/form/div[6]/div[2]/div/a")
    private WebElement countryClickOnBox;

    @FindBy(xpath = "/html/body/div[10]/div/input")
    private WebElement countryOnInvoice;

    @FindBy(name = "guest")
    private WebElement confirmBookingButton;

    public void enterInvoiceDetails(String firstname, String lastname, String email, String mobile, String city, String country) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(firstNameOnInvoice));

        firstNameOnInvoice.sendKeys(firstname);
        lastNameOnInvoice.sendKeys(lastname);
        emailOnInvoice.sendKeys(email);
        emailConfimation.sendKeys(email);
        phoneOnInvoice.sendKeys(mobile);
        addressOnInvoice.sendKeys(city);
        countryClickOnBox.click();
        countryOnInvoice.sendKeys(country);
        countryOnInvoice.sendKeys(Keys.RETURN);
        confirmBookingButton.click();
    }
}