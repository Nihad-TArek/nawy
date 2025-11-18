package tests;

import base.baseTest;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class AddCartTest extends baseTest {

    @Test
    public void addToCartTest(){

        HomePage home = new HomePage(page);
        home.openHomePage();
        home.clickMonitors();
        home.clickaddtocart();
        page.waitForTimeout(2000);


    }
}
