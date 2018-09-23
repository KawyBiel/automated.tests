package workshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import workshop.pages.BasePage;

public class LogInPage extends BasePage {

    public LogInPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "username")
    private WebElement userNameLocator;

    @FindBy(id = "password")
    private WebElement passwordLocator;

    @FindBy(id = "_submit")
    private WebElement logInButtonLocator;

    @FindBy(xpath = "/html/body/section[3]/div/div[1]/div/p[1]")
    private WebElement selectTechnologyBox;

    @FindBy(xpath = "/html/body/section[3]/div/div[1]/div/ul/li[8]")
    private WebElement gitOption;

    @FindBy(xpath = "/html/body/section[3]/div/div[1]/input")
    private WebElement submitFindMentorBox;

    @FindBy(xpath = "/html/body/main/div[2]/div/div[1]/div/div[2]/div[2]/button")
    private WebElement firstMentorReservationBox;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/ul/li[2]")
    private WebElement dateLocator;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[3]/div[2]/ul/li[1]")
    private WebElement timeLocator;

    @FindBy(name = "name")
    private WebElement commentBox;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[2]/div[3]/a/button")
    private WebElement bookAndPayButton;

    public void logIn(String user, String password) {
        userNameLocator.sendKeys(user);
        passwordLocator.sendKeys(password);
        logInButtonLocator.click();
    }

    public void setSelectTechnologyBox() {
        selectTechnologyBox.click();
        gitOption.click();
        submitFindMentorBox.click();
    }

    public void chooseFirstAvailableMentor() {
        firstMentorReservationBox.click();
    }

    public void chooseDateAndTimeAndSubmit(String comment) {
        dateLocator.click();
        timeLocator.click();
        commentBox.sendKeys(comment);
        bookAndPayButton.click();

    }


}
