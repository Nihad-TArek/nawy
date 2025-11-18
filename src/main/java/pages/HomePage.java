package pages;

import com.microsoft.playwright.Page;

public class HomePage extends BasePage {

    public String signUpLink = "role=link[name='Sign up']";
    public String loginLink = "role=link[name='Log in']";
    public String LogoutButton = "#logout2";
    public String monitorsLink = "role=link[name='Monitors']";
    public String applelink = "role=link[name='Apple monitor 24']";
    public  String addToCartButton = "role=link[name='Add to cart']";

    public HomePage(Page page) {
        super(page);
    }

    public void openHomePage() {
        navigate("https://www.demoblaze.com/"); // Navigate to the URL
    }

    public void clickSignUp() {
        click(signUpLink);
    }
    public void clicklogin() {
        click(loginLink);
    }
    public void logout() {
        page.locator(LogoutButton).waitFor();
        click(LogoutButton);
    }
    public void clickMonitors() {
        click(monitorsLink);
        page.locator(applelink).waitFor();
        click(applelink);
        waitForPageLoad();
        page.locator(addToCartButton).waitFor();
        click(addToCartButton);
        handleDialogOnce();
    }

}
