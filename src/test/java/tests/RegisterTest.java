package tests;

import base.baseTest;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends baseTest {

    @Test
    public void userCanRegisterWithValidData() {
        HomePage home = new HomePage(page);
        home.openHomePage();
        home.clickSignUp();

        String username="Nehad";
        String password="Nehad";
        RegisterPage register = new RegisterPage(page);
        register.register(username,password);
        page.waitForTimeout(2000);
    }
}
