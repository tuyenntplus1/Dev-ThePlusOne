package buyerCheckOut.function;

import buyerCheckOut.page.cart_page;
import buyerCheckOut.page.checkout_page;
import buyerCheckOut.page.sellpage_page;
import core.basePage;
import core.common_function;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;


public class sellpage_function extends basePage {
    public sellpage_function(WebDriver driver) {
        super(driver);
    }
    common_function commonFunction =new common_function(driver);
    sellpage_page sellpagePage = new sellpage_page();
    cart_page cartPage = new cart_page();

    checkout_page checkoutPage = new checkout_page();
    public void verifyTitleSellpage(){
        String TitleSellpage = driver.getTitle();
        Assert.assertEquals("Blaze_Sản phẩm test Tracking- sellpage title",TitleSellpage);
    }
    public void verifyTitleProduct(){
        commonFunction.verifyElement(sellpagePage.sellpageTitle,"Blaze_Sản phẩm test Tracking- sellpage title");
    }
    public void verifyPrice(){
        commonFunction.verifyElement(sellpagePage.priceVariant,"$48.33");
    }
    public void verifyFomo(){
        commonFunction.verifyPage(sellpagePage.fomo);
    }
    public void verifyCountDownTimer(){
        commonFunction.verifyPage(sellpagePage.countDownTimer);
    }
    public void verifyVariants() throws InterruptedException {
        commonFunction.scroll(sellpagePage.sectionVariants);
        commonFunction.verifyPage(sellpagePage.colorBlack);
        commonFunction.click(sellpagePage.colorBlack);
        commonFunction.verifyPage(sellpagePage.colorPink);
        commonFunction.click(sellpagePage.colorPink);
        commonFunction.verifyPage(sellpagePage.colorBlue);
        commonFunction.click(sellpagePage.colorBlue);
        commonFunction.verifyPage(sellpagePage.sizeS);
        commonFunction.click(sellpagePage.sizeS);
        commonFunction.verifyPage(sellpagePage.sizeM);
        commonFunction.click(sellpagePage.sizeM);
        commonFunction.verifyPage(sellpagePage.sizeL);
        commonFunction.click(sellpagePage.sizeL);
    }
    public void verifyQuantity(){
        Assert.assertEquals("1",commonFunction.getValue(sellpagePage.quantity));
    }
    public void verifyIncreaseIcon() throws InterruptedException {
        commonFunction.scroll(sellpagePage.sectionVariants);
        commonFunction.click(sellpagePage.iconIncrease);
        commonFunction.click(sellpagePage.iconIncrease);
        Assert.assertEquals("3",commonFunction.getValue(sellpagePage.quantity));
    }
    public void verifyDecreaseIcon() throws InterruptedException {
        commonFunction.scroll(sellpagePage.sectionVariants);
        commonFunction.click(sellpagePage.iconIncrease);
        commonFunction.click(sellpagePage.iconIncrease);
        commonFunction.click(sellpagePage.iconDecrease);
        Assert.assertEquals("2",commonFunction.getValue(sellpagePage.quantity));
    }
    public void verifyAddToCartBtn() throws InterruptedException {
        commonFunction.scroll(sellpagePage.sectionVariants);
        commonFunction.verifyPage(sellpagePage.addToCartBtn);
        commonFunction.click(sellpagePage.addToCartBtn);
        commonFunction.verifyPage(cartPage.cartTitle);
        commonFunction.verifyElement(cartPage.cartTitle,"Your shopping cart");
    }
    public void verifyBuyItNowBtn() throws InterruptedException {
        commonFunction.scroll(sellpagePage.sectionVariants);
        commonFunction.verifyPage(sellpagePage.byItNowBtn);
        commonFunction.click(sellpagePage.byItNowBtn);
        Assert.assertEquals("Checkout",driver.getTitle());

    }
    public void verifyPaypalBtn() throws InterruptedException {
        commonFunction.scroll(sellpagePage.sectionVariants);
        commonFunction.verifyPage(sellpagePage.paypalBtn);
        commonFunction.click(sellpagePage.paypalBtn);
        commonFunction.switchWindowByTitle("Log in to your PayPal account");
        commonFunction.verifyElement(checkoutPage.headerPaypalForm,"Pay with PayPal");
    }
    public void verifyDescription() throws InterruptedException {
        commonFunction.scroll(sellpagePage.description);
        commonFunction.verifyPage(sellpagePage.description);
    }
    public void verifySpecification() throws InterruptedException {
        commonFunction.scroll(sellpagePage.specification);
        commonFunction.verifyPage(sellpagePage.specification);
    }

}
