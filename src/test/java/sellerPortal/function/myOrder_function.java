package sellerPortal.function;

import buyerCheckOut.function.seller1_function;
import core.basePage;
import core.common_function;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.myOrder_page;
import sellerPortal.page.requestFulfill_page;

public class myOrder_function extends basePage {
    public myOrder_function(WebDriver driver) {
        super(driver);
    }
    myOrder_page myOrderPage = new myOrder_page();
    requestFulfill_page requestFulfillPage = new requestFulfill_page();
    common_function commonFunction =new common_function(driver);
    public void verifyMyOrderPaypal() throws InterruptedException {
        seller1_function sellerFunction = new seller1_function(driver);
        sellerFunction.viewMyOrderDetail();
        sellerFunction.verifyMyOrderDetailPaypal();

    }
    public void verifyOrderPaypal() throws InterruptedException {
        seller1_function sellerFunction = new seller1_function(driver);
        sellerFunction.viewOrderDetail();
        sellerFunction.verifyOrderPaypal();
    }
    public void verifyMyOrderStripe() throws InterruptedException {
        seller1_function sellerFunction = new seller1_function(driver);
        sellerFunction.viewMyOrderDetail();
        sellerFunction.verifyMyOrderStripe();

    }
    public void requestFulfill() throws InterruptedException {
        commonFunction.click(myOrderPage.checkboxMyOrder1);
        commonFunction.click(myOrderPage.requestFulfillBtn);
        commonFunction.verifyElement(myOrderPage.confirmPopupHeaderRequest,"Confirm request fulfill");
        commonFunction.verifyElement(myOrderPage.body1PopupConfirmRequest,"You are having 1 request fulfill");
        commonFunction.verifyElement(myOrderPage.body2ProductRequest,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.click(myOrderPage.confirmBtn);
        Thread.sleep(1000);
        commonFunction.verifyElement(myOrderPage.status,"Request fulfill success");
        commonFunction.verifyElement(requestFulfillPage.titleRequestFulfill,"Request fulfill");
        commonFunction.verifyElement(requestFulfillPage.productNameRequest,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional_1order");
    }

}
