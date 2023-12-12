package sellerPortal.test;

import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.login_function;
import sellerPortal.function.myOrder_function;

public class myOrder extends seller {
    @Test
    public void verifyMyOrderPaypal() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");
        myOrder_function myOrderFunction = new myOrder_function(driver);
        myOrderFunction.verifyMyOrderPaypal();

    }
    @Test
    public void verifyMyOrderStripe() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");
        myOrder_function myOrderFunction = new myOrder_function(driver);
        myOrderFunction.verifyMyOrderStripe();
    }
    @Test
    public void verifyOrderPaypal() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");
        myOrder_function myOrderFunction = new myOrder_function(driver);
        myOrderFunction.verifyOrderPaypal();
    }
}
