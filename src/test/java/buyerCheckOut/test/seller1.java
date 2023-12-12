package buyerCheckOut.test;

import buyerCheckOut.function.seller1_function;
import core.baseTest.seller;
import org.testng.annotations.Test;

public class seller1 extends seller {
    @Test
    public void verifyOrderDetailStripeSeller() throws InterruptedException {
        seller1_function sellerFunction = new seller1_function(driver);
        sellerFunction.loginSellerPortal();
        sellerFunction.viewOrderDetail();
        sellerFunction.verifyOrderDetailStripe();
    }
}

