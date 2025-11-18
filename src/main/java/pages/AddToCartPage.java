package pages;

import com.microsoft.playwright.Page;


public class AddToCartPage extends BasePage {

    public  String addToCartButton = "role=link[name='Add to cart']";
    public AddToCartPage(Page page) {
        super(page);
    }

    public void  clickAddToCartButton() {

        page.click(addToCartButton);
        //handleDialogOnce();
    }
}
