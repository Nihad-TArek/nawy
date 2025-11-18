package pages;

import com.microsoft.playwright.Page;

    public class LoginPage extends BasePage {

       public  String LusernameField = "#loginusername";
        public  String LpasswordField = "#loginpassword";
        public  String loginButton = "role=button[name='Log in']";

        public LoginPage(Page page) {
            super(page);
        }

        public void login(String username, String password) {
            click(LusernameField);
            fill(LusernameField,username);
            click(LpasswordField);
            fill(LpasswordField,password);
            handleDialogOnce();
            click(loginButton);
        }

    }

