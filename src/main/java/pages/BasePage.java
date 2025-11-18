package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;

public class BasePage {
    public final Page page;
    public BasePage(Page page) {
        this.page = page;
        this.page.setDefaultTimeout(6000);        // 10 seconds
        this.page.setDefaultNavigationTimeout(6000);
    }

    public void click(String locator) {
        page.locator(locator).click();
    }

    public void fill(String locator, String text) {
        page.locator(locator).fill(text);
    }

    public void navigate(String url) {
        page.navigate(url);
    }

    public void handleDialogOnce() {
        page.onceDialog(dialog -> {
            System.out.println("Dialog message: " + dialog.message());
            dialog.dismiss();
        });
    }
    public void waitForPageLoad() {
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
        page.waitForLoadState(LoadState.NETWORKIDLE);

    }
}
