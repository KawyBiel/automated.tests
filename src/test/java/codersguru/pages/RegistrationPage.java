package codersguru.pages;

import common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    @FindBy(id = "person")
    private WebElement personButtomLink;
    @FindBy(id = "company")
    private WebElement companyButtonLink;
    @FindBy(id = "fos_user_registration_form_email")
    private WebElement emailTextBox;
    @FindBy(xpath = "//*[@id=\"registration-main-form\"]/div[2]/span")
    private WebElement emailErrorMassage; //Wprowadzono niepoprawny adres e-mail
    @FindBy(id = "fos_user_registration_form_name")
    private WebElement nameTextBox;
    @FindBy(xpath = "//*[@id=\"registration-main-form\"]/div[3]/span")
    private WebElement nameErrorMassage; //Wprowadzona wartość jest mniejsza niż 2 znaków
    @FindBy(id="fos_user_registration_form_lastname")
    private WebElement surnameTextBox;
    @FindBy(xpath = "//*[@id=\"registration-main-form\"]/div[4]/span")
    private WebElement surnameErrorMassage;  //Wprowadzona wartość jest mniejsza niż 2 znaków
    @FindBy(id="fos_user_registration_form_plainPassword_first")
    private WebElement passwordTextBox;
    @FindBy(xpath = "//*[@id=\"registration-main-form\"]/div[5]/span")
    private WebElement passwordErrorMassage;  //Wprowadzona wartość jest mniejsza niż 5 znaków
    @FindBy(id="fos_user_registration_form_plainPassword_second")
    private WebElement passwordRepeatTextBox;
    @FindBy(xpath = "*[@id=\"registration-main-form\"]/div[6]/span")  //Wprowadzone wartości nie zostały potwierdzone
    private WebElement passwordRepeatErrorMassage;                    //To pole jest wymagane
    @FindBy(id="form_city")
    private WebElement cityTextBox;
    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[7]/span")
    private WebElement cityErrorMassage;
    @FindBy(id="form_postal_code")
    private WebElement zipCodeTextBox;
    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[8]/span[2]") //Zachowaj format 00-000*    [@id="registration-main-form"]/div[8]/span[1] -
    private WebElement zipCodeErrormassage; //Wprowadzona wartość jest niepoprawna
    @FindBy(id="form_street")
    private WebElement streetTextBox;
    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[9]/span")
    private WebElement streetErrorMessage;  //Wprowadzona wartość jest mniejsza niż 2 znaków
    @FindBy(id="form_number")
    private WebElement streetNumberTextBox;
    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[10]/span")
    private WebElement streetNumberErrorMassage;  //To pole jest wymagane//
    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[12]/input")
    private WebElement statuteCheckBox;
    @FindBy(xpath="//*[@id=\"registration-main-form\"]/div[12]/span")
    private WebElement statuteCheckBoxErrorMassage;
    @FindBy(id="register-submit-btn")
    private WebElement registerSubmitBotton;

    @FindBy(id = "user-name")
    private WebElement loggedUserName;

    @FindBy(id = "fos_user_registration_form_company_name")
    private WebElement companyName;

    @FindBy(id = "fos_user_registration_form_nip")
    private WebElement nipNumber;


    public RegistrationPage(WebDriver driver){
        super(driver);
    }

    public void clickPrivateButton(){
        this.personButtomLink.click();
    }

    public void clickCompanyButton() {
        this.companyButtonLink.click ();
    }

    public String isPrivatePersonSelected() {
        String clasName = personButtomLink.getAttribute("class");
        return clasName;
    }

    public void enterMail(String mail) {
        emailTextBox.clear();
        emailTextBox.sendKeys(mail);
    }

    public void enterName (String name) {
        nameTextBox.clear();
        nameTextBox.sendKeys(name);
    }

    public void enterSurname(String surname) {
        surnameTextBox.clear();
        surnameTextBox.sendKeys(surname);
    }

    public void enterPassword (String pw) {
        passwordTextBox.clear();
        passwordTextBox.sendKeys(pw);
        passwordRepeatTextBox.clear();
        passwordRepeatTextBox.sendKeys(pw);
    }

    public void enterCity(String city) {
        cityTextBox.clear();
        cityTextBox.sendKeys (city);
    }

    public void enterZip (String zip) {
        zipCodeTextBox.clear ();
        zipCodeTextBox.sendKeys (zip);
    }

    public void enterStreet (String street) {
        streetTextBox.clear ();
        streetTextBox.sendKeys (street);
    }

    public void enterNumber (String no) {
        streetNumberTextBox.clear ();
        streetNumberTextBox.sendKeys (no);
    }

    public void enterCompany (String company) {
        companyName.clear ();
        companyName.sendKeys(company);
    }




    public void clickOnCheckBox() {

        statuteCheckBox.click ();
    }

    public void clickRegister() {

        registerSubmitBotton.click ();
    }

    public String getLoggedUserName() {
        String loggedInUser = loggedUserName.getText ();
        return loggedInUser;
    }

    public void typeNip(String nip) {
        nipNumber.clear();
        nipNumber.sendKeys(nip);
    }




}

