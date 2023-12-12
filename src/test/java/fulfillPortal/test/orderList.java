package fulfillPortal.test;

import core.baseTest.fulfill;
import fulfillPortal.function.Orders_function;
import fulfillPortal.function.login_function;
import org.testng.annotations.Test;

public class orderList extends fulfill {
    @Test
    public void verifyOrderDetailPaypal() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("wopigi23@gronasu.com","wopigi23@123");
        Orders_function ordersFunction = new Orders_function(driver);
        ordersFunction.viewOrder1();
        ordersFunction.verifyOrderPaypal();
    }
}
