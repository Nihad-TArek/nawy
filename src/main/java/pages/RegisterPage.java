package pages;

import com.microsoft.playwright.Page;

public class RegisterPage extends BasePage  {

    public final String usernameField = "role=textbox[name='Username:']";
    public final String passwordField = "role=textbox[name='Password:']";
    public final String signUpButton = "role=button[name='Sign up']";

    public RegisterPage(Page page) {
        super(page);
    }

        public void register(String username, String password) {
            click(usernameField);
            fill(usernameField,username);
            click(passwordField);
            fill(passwordField,password);
            handleDialogOnce(); // handle the dialog
            click(signUpButton);
        }

    }