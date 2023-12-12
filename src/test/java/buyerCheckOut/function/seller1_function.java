package buyerCheckOut.function;

import buyerCheckOut.page.seller1_page;
import core.basePage;
import core.common_function;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;

public class seller1_function extends basePage {
    public seller1_function(WebDriver driver) {
        super(driver);
    }
    public String email = "tuyennguyen.aion@example.com";
    public String password = "eHighway@123";
    common_function commonFunction =new common_function(driver);
    seller1_page sellerPage = new seller1_page();
    public void loginSellerPortal(){
        commonFunction.senKeys(sellerPage.email,email);
        commonFunction.senKeys(sellerPage.password,password);
        commonFunction.click(sellerPage.loginBtn);
        Assert.assertEquals("Login | eHighway",driver.getTitle());
    }
    public void viewOrderDetail(){
        commonFunction.click(sellerPage.ordersNav);
        commonFunction.click(sellerPage.collapseNav);
        commonFunction.click(sellerPage.orderNav);
        commonFunction.click(sellerPage.orderNumber);

    }
    public void viewMyOrderDetail(){
        commonFunction.click(sellerPage.collapseNav);
        commonFunction.click(sellerPage.ordersNav);
        commonFunction.click(sellerPage.myOrdesNav);
        commonFunction.click(sellerPage.myOrderNumber);
    }
    public void verifyOrderDetailStripe() throws InterruptedException {
        Thread.sleep(5000);
        commonFunction.verifyElement(sellerPage.statusOrder,"Paid");
        commonFunction.verifyElement(sellerPage.productName,"Blaze_Sản phẩm test Tracking");
        commonFunction.verifyElement(sellerPage.variantColor,"Color : Pink");
        commonFunction.verifyElement(sellerPage.variantSize,"Size : M");
        commonFunction.verifyElement(sellerPage.priceVariant,"$48.33");
        commonFunction.verifyElement(sellerPage.quantity,"1");
        commonFunction.verifyElement(sellerPage.subtotal1,"$48.33");
        commonFunction.verifyElement(sellerPage.subtotal2,"$48.33");
        commonFunction.verifyElement(sellerPage.tip,"$0.97");
        commonFunction.verifyElement(sellerPage.shipping,"$4.99");
        commonFunction.verifyElement(sellerPage.total,"$54.29");
        commonFunction.verifyElement(sellerPage.customerEmail,"tuyennt@ehighway.co");
        commonFunction.verifyElement(sellerPage.customerPhoneNumber,"0123456789");
        commonFunction.verifyElement(sellerPage.customerShippingAddress,"tuyennt@ehighway.co, Tuyen, Nguyen, Nguyen Co Thach, Ha Noi, Afghanistan, 100000, 0123456789, AF,");
        commonFunction.verifyElement(sellerPage.customerBillingAddress,"tuyennt@ehighway.co, Tuyen, Nguyen, Nguyen Co Thach, Ha Noi, Afghanistan, 100000, 0123456789, AF,");
    }
    public void verifyMyOrderDetailPaypal() throws InterruptedException {
        Thread.sleep(5000);
        commonFunction.verifyElement(sellerPage.statusOrder,"Paid");
        commonFunction.verifyElement(sellerPage.productName,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.verifyElement(sellerPage.variantColor,"Color : Purple");
        commonFunction.verifyElement(sellerPage.variantSize,"Size : S");
        commonFunction.verifyElement(sellerPage.priceVariant,"$50");
        commonFunction.verifyElement(sellerPage.quantity,"1");
        commonFunction.verifyElement(sellerPage.subtotal1,"$50.00");
        commonFunction.verifyElement(sellerPage.subtotal2,"$50.00");
//        commonFunction.verifyElement(sellerPage.tip,"$0.97");
//        commonFunction.verifyElement(sellerPage.shipping,"$0");
//        commonFunction.verifyElement(sellerPage.total,"$50.00");
        commonFunction.verifyElement(sellerPage.customerEmail,"tuyennt@ehighway.co");
//        commonFunction.verifyElement(sellerPage.customerPhoneNumber,"0123456789");
        commonFunction.verifyElement(sellerPage.customerShippingAddress,"1 Main St, CA, San Jose, US, 95131, US,");
        commonFunction.verifyElement(sellerPage.customerBillingAddress,"tuyennt@ehighway.co, Tuyen, Nguyen, US, US,");
    }
    public void verifyOrderPaypal() throws InterruptedException {
        Thread.sleep(5000);
        commonFunction.verifyElement(sellerPage.statusOrder,"Paid");
        commonFunction.verifyElement(sellerPage.productName,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.verifyElement(sellerPage.variantColor,"Color : Purple");
        commonFunction.verifyElement(sellerPage.variantSize,"Size : S");
        commonFunction.verifyElement(sellerPage.priceVariant,"$50");
        commonFunction.verifyElement(sellerPage.quantity,"1");
        commonFunction.verifyElement(sellerPage.subtotal1,"$50.00");
        commonFunction.verifyElement(sellerPage.subtotal2,"$50.00");
        commonFunction.verifyElement(sellerPage.shipping,"$4.99");
        commonFunction.verifyElement(sellerPage.total,"$54.99");
        commonFunction.verifyElement(sellerPage.customerEmail,"tuyennt@ehighway.co");
        commonFunction.verifyElement(sellerPage.customerShippingAddress,"1 Main St, CA, San Jose, US, 95131, US,");
        commonFunction.verifyElement(sellerPage.customerBillingAddress,"tuyennt@ehighway.co, Tuyen, Nguyen, US, US,");
    }
    public void verifyMyOrderStripe() throws InterruptedException {
        Thread.sleep(5000);
        commonFunction.verifyElement(sellerPage.statusOrder,"Paid");
        commonFunction.verifyElement(sellerPage.productName,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.verifyElement(sellerPage.variantColor,"Color : Gray");
        commonFunction.verifyElement(sellerPage.variantSize,"Size : M");
        commonFunction.verifyElement(sellerPage.priceVariant,"$51");
        commonFunction.verifyElement(sellerPage.quantity,"1");
        commonFunction.verifyElement(sellerPage.subtotal1,"$51.00");
        commonFunction.verifyElement(sellerPage.subtotal2,"$51.00");
        commonFunction.verifyElement(sellerPage.tip,"$2.55");
        commonFunction.verifyElement(sellerPage.shipping,"$5.99");
        commonFunction.verifyElement(sellerPage.total,"$59.54");
        commonFunction.verifyElement(sellerPage.customerEmail,"tuyennt@ehighway.co");
        commonFunction.verifyElement(sellerPage.customerPhoneNumber,"0123456789");
        commonFunction.verifyElement(sellerPage.customerShippingAddress,"tuyennt@ehighway.co, Tuyen, Nguyen, Nguyen Co Thach, Ha Noi, Afghanistan, 100000, 0123456789, AF,");
        commonFunction.verifyElement(sellerPage.customerBillingAddress,"tuyennt@ehighway.co, Tuyen, Nguyen, Nguyen Co Thach, Ha Noi, Afghanistan, 100000, 0123456789, AF,");

    }
}

