package buyerCheckOut.test;

import buyerCheckOut.function.fulfill_function;
import org.testng.annotations.Test;

public class fulfill extends core.baseTest.fulfill {
    @Test
    public void verifyOrderDetailStripeFulfill() throws InterruptedException {
        fulfill_function fulfillFunction = new fulfill_function(driver);
        fulfillFunction.loginFulfillPortal();
        fulfillFunction.viewOrderDetailStripe();
        fulfillFunction.verifyOrderDetailStripe();
    }
}

