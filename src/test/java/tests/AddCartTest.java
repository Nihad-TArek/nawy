package tests;

import base.baseTest;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.AddToCartPage;

public class AddCartTest extends baseTest {

    @Test
    public void addToCartTest(){

        HomePage home = new HomePage(page);
        home.openHomePage();
        home.clickMonitors();
//        AddToCartPage addToCartPage = new AddToCartPage(page);
//        addToCartPage.clickAddToCartButton();

    }
}
