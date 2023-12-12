package buyerCheckOut.function;

import buyerCheckOut.page.fulfill_page;
import core.basePage;
import core.common_function;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;


public class fulfill_function extends basePage {
    public fulfill_function(WebDriver driver) {
        super(driver);
    }
    public String fulfillUsername = "fulfiller";
    public String fulfillPassword = "fulfiller@123";
    common_function commonFunction =new common_function(driver);
    fulfill_page fulfillPage = new fulfill_page();
    public void loginFulfillPortal(){
        commonFunction.senKeys(fulfillPage.userName,fulfillUsername);
        commonFunction.senKeys(fulfillPage.password,fulfillPassword);
        commonFunction.click(fulfillPage.loginBtn);
        Assert.assertEquals("Fulfill - EHIGHWAY.CO",driver.getTitle());
    }
    public void viewOrderDetailStripe(){
        commonFunction.click(fulfillPage.orderListNav);
        commonFunction.click(fulfillPage.orderNumber);
    }
    public void verifyOrderDetailStripe(){
        commonFunction.verifyElement(fulfillPage.statusOrder,"Paid");
        commonFunction.verifyElement(fulfillPage.productName,"Blaze_Sản phẩm test Tracking");
        commonFunction.verifyElement(fulfillPage.variantColor,"Color: Pink");
        commonFunction.verifyElement(fulfillPage.variantSize,"Size: M");
        commonFunction.verifyElement(fulfillPage.productCost,"$12");
        commonFunction.verifyElement(fulfillPage.quantity,"1 item");
        commonFunction.verifyElement(fulfillPage.subtotal1,"$12.0");
        commonFunction.verifyElement(fulfillPage.subtotal2,"$12.0");
        commonFunction.verifyElement(fulfillPage.shipping,"$0.0");
        commonFunction.verifyElement(fulfillPage.total,"$12.0");
        commonFunction.verifyElement(fulfillPage.customer,"Tuyen Nguyen");
        commonFunction.verifyElement(fulfillPage.customerEmail,"tuyennt@ehighway.co");
        commonFunction.verifyElement(fulfillPage.customerShippingAddress,"tuyennt@ehighway.co\n" +
                "Tuyen\n" +
                "Nguyen\n" +
                "Nguyen Co Thach\n" +
                "Ha Noi\n" +
                "Afghanistan\n" +
                "100000\n" +
                "0123456789\n" +
                "AF");
        commonFunction.verifyElement(fulfillPage.customerBillingAddress,"tuyennt@ehighway.co\n" +
                "Tuyen\n" +
                "Nguyen\n" +
                "Nguyen Co Thach\n" +
                "Ha Noi\n" +
                "Afghanistan\n" +
                "100000\n" +
                "0123456789\n" +
                "AF");
    }
}

