package buyerCheckOut.test;


import buyerCheckOut.function.checkout_function;
import core.baseTest.buyer1;
import org.testng.annotations.Test;

public class paypalPro extends buyer1 {
    @Test(priority = 1)
    public void paypalProCheckout() throws InterruptedException {
        checkout_function checkoutFunction = new checkout_function(driver);
        checkoutFunction.paypalProCheckout();
    }
}

