package phptravel.pages;

import common.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FlightSelectionPage extends BasePage {

    public FlightSelectionPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/form/div[9]/div[2]/div/div/ins")
    private WebElement roundTripCheck;

    @FindBy(id = "s2id_location_from")
    private WebElement departureBoxToClick;

    @FindBy(xpath = "/html/body/div[11]/div/input")
    private WebElement departureBox;

    @FindBy(id = "s2id_location_to")
    private WebElement arrivalBoxToClick;

    @FindBy(xpath = "/html/body/div[12]/div/input")
    private WebElement arrivalBox;

    @FindBy (name="departure")
    private WebElement fromDateTextBox;

    @FindBy (name="arrival")
    private WebElement toDateTextBox;

    @FindBy (xpath = "//*[@id=\"body-section\"]/div[2]/div/form/div[6]/button")
    private WebElement submitButton;

    @FindBy(id = "bookbtn")
    private List<WebElement> bookNowButtons;

    public void enterDepartureAndArrival(String from, String to, String dateFrom, String dateTo){

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(roundTripCheck));

        roundTripCheck.click();

        departureBoxToClick.click();
        departureBox.sendKeys(from);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        departureBox.sendKeys(Keys.RETURN);

        arrivalBoxToClick.click();
        arrivalBox.sendKeys(to);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        arrivalBox.sendKeys(Keys.RETURN);

        fromDateTextBox.click();
        fromDateTextBox.sendKeys(dateFrom);

        toDateTextBox.click();
        toDateTextBox.sendKeys(dateTo);

        submitButton.click();
    }

    public void pickFlight(int number) {

        //funkcja document.readyState; jeśli "complete", to znaczy, że strona załadowana
        new WebDriverWait(driver, 60).until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

        bookNowButtons.get(number).click();
    }
}
