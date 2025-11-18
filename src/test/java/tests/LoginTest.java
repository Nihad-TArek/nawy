package tests;

import base.baseTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;
public class LoginTest extends baseTest {
    @Test
    public void userCanLoginWithValidData(){

        HomePage home = new HomePage(page);
        home.openHomePage();
        home.clicklogin();

        String username="Nehad";
        String password="Nehad";

    LoginPage login = new LoginPage(page);
    login.login(username,password);

        page.waitForTimeout(2000);
    }

    @Test
    public void usercanlogout(){
       HomePage home = new HomePage(page);
        home.openHomePage();
        home.clicklogin();

        String username="Nehad";
        String password="Nehad";

        LoginPage login = new LoginPage(page);
        login.login(username,password);
        home.logout();
        page.waitForTimeout(2000);
    }
}