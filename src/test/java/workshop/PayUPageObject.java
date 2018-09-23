package workshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayUPageObject extends BasePage {

    public PayUPageObject(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/main/div[2]/article/div[1]/div/div[1]/a[2]/div[2]/span")
    private WebElement creditCardBox;

    @FindBy(name = "number")
    private WebElement creditCardNoBox;

    @FindBy(name = "date")
    private WebElement dateBox;

    @FindBy(name = "cvv")
    private WebElement cvvBox;

    @FindBy(name = "name")
    private WebElement nameBox;

    @FindBy(name = "email")
    private WebElement emailBox;

    @FindBy(name = "submit")
    private WebElement payButton;


    public void payByCreditCard() {
        creditCardBox.click();
    }

    public void enterPaymentDetails(String credtiCardNo, String date, String cvv, String name, String email) {
        creditCardNoBox.sendKeys(credtiCardNo);
        dateBox.sendKeys(date);
        cvvBox.sendKeys(cvv);
        nameBox.sendKeys(name);
        emailBox.sendKeys(email);
        payButton.click();
    }
}
