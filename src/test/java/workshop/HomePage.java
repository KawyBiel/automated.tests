package workshop;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    //lokatory są private:
    @FindBy (name="email")
    private WebElement emailTextBox; //to samo co:
    // private WebElement emailTextBox = driver.findElement(By.name("email"));

    @FindBy (xpath="/html/body/section[1]/div/div[1]/a/img")
    private WebElement homePageLink;


    //konstruktor dziedziczony z klasy BasePage:
    public HomePage(Webdriver driver) {
        super(driver);
    }


    //dostęp do lokatorów gwarantuje metoda public
    public void enterEmail() {

    }





}
