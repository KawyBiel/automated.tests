package phptravel.pages;

import common.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InvoicePage extends BasePage{
    public InvoicePage(WebDriver driver){

        super(driver);
    }

    @FindBy(id = "btn")
    private WebElement downloadInvoiceButton;

    public void takeScreenshot() { //zapisuje plik ze screenshotem na pulpicie z aktualnym czasem
        String data = new SimpleDateFormat ("yyyy.MM.dd-HH:mm:ss").format(Calendar.getInstance().getTime());


        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(downloadInvoiceButton));


        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(scrFile, new File("/home/my/Pulpit/" + data +"-invoice.png"));
            } catch (IOException e) {
            System.out.println (e.getMessage());
            }
        }
}

