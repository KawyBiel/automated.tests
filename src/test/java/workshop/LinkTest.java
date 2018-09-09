package workshop;

import org.junit.Test;

public class LinkTest extends BaseTest{

    @Test
    public void testClickingOnAllLinks() {
        driver.get("https://men-men-s-01.codersguru.pl/");
        HomePage homePage = new HomePage(driver);
        homePage.clickOnLinks();

    }

}

