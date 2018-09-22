package workshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    @FindBy(id = "person")
    private WebElement personButtomLink;
    @FindBy(id = "fos_user_registration_form_email")
    private WebElement emailTextBox;
    @FindBy(xpath = "//*[@id=\"registration-main-form\"]/div[2]/span")
    private WebElement emailErrorMassage; //Wprowadzono niepoprawny adres e-mail    @FindBy(id = "fos_user_registration_form_name")
    private WebElement nemeTextBox;
    @FindBy(xpath = "//*[@id=\"registration-main-form\"]/div[3]/span")
    private WebElement nemeErrorMassage; //Wprowadzona wartość jest mniejsza niż 2 znaków    @FindBy(id="fos_user_registration_form_lastname")
    private WebElement surnameTextBox;
    @FindBy(xpath = "//*[@id=\"registration-main-form\"]/div[4]/span")
    private WebElement surnameErrorMassage;;  //Wprowadzona wartość jest mniejsza niż 2 znaków    @FindBy(id="fos_user_registration_form_plainPassword_first")
    private WebElement passwordTextBox;
    @FindBy(xpath = "//*[@id=\"registration-main-form\"]/div[5]/span")
    private WebElement passwordErrorMassage;  //Wprowadzona wartość jest mniejsza niż 5 znaków    @FindBy(id="fos_user_registration_form_plainPassword_second")
    private WebElement passwordRepeatTextBox;
    @FindBy(xpath = "*[@id=\"registration-main-form\"]/div[6]/span")  //Wprowadzone wartości nie zostały potwierdzone
    private WebElement passwordRepeatErrorMassage;                    //To pole jest wymagane    @FindBy(id="form_city")
    private WebElement cityTextBox;
    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[7]/span")
    private WebElement cityErrorMassage;
    @FindBy(id="form_postal_code")
    private WebElement zipCodeTextBox;
    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[8]/span[2]") //Zachowaj format 00-000*    [@id="registration-main-form"]/div[8]/span[1] -
    private WebElement zipCodeErrormassage; //Wprowadzona wartość jest niepoprawna    @FindBy(id="form_street")
    private WebElement streetTextBox;
    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[9]/span")
    private WebElement streetErrorMessage;  //Wprowadzona wartość jest mniejsza niż 2 znaków    @FindBy(id="form_number")
    private WebElement streetNumberTextBox;
    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[10]/span")
    private WebElement streetNumberErrorMassage;  //To pole jest wymagane// @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[12]/input")
    private WebElement statuteCheckBox;
    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[12]/span")
    private WebElement statuteCheckBoxErrorMassage;
    @FindBy(id="register-submit-btn")
    private WebElement registerSubmitBotton;
    /*infos_user_registration_form_nip")
   private WebElement nipTextBox;    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[11]/div[2]/span[2]")   /// Wprowadź nip jako ciąg cyfr -- //*[@id="registration-main-form"]/div[11]/div[2]/span[1]
   private WebElement nipErrorMassage; //Wprowadzona wartość jest niepoprawna
*/
    public RegistrationPage(WebDriver driver){
        super(driver);
    }    public void clickPrivateButton(){
        this.personButtomLink.click();
    }
}

