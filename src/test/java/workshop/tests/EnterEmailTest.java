package workshop.tests;

import org.junit.Test;
import workshop.pages.HomePage;

public class EnterEmailTest extends BaseTest {


    @Test
    public void testEnteringEmail() {
        driver.get("https://men-men-s-01.codersguru.pl/");
        HomePage homePage = new HomePage(driver);
        homePage.enterEmail("test@mail.com");
    }
}