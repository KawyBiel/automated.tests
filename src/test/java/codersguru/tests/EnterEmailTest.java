package codersguru.tests;

import common.BaseTest;
import org.junit.Test;
import codersguru.pages.HomePage;

public class EnterEmailTest extends BaseTest {


    @Test
    public void testEnteringEmail() {
        driver.get("https://men-men-s-01.codersguru.pl/");
        HomePage homePage = new HomePage(driver);
        homePage.enterEmail("test@mail.com");
    }
}