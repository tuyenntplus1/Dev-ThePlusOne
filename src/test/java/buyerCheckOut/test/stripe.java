package buyerCheckOut.test;

import buyerCheckOut.function.checkout_function;
import core.baseTest.buyer;
import org.testng.annotations.Test;

public class stripe extends buyer {
    @Test(priority= 1 )
    public void stripeCheckout() throws InterruptedException {
        checkout_function checkoutFunction = new checkout_function(driver);
        checkoutFunction.stripeCheckout();
    }
    @Test
    public void verifyOrderSummary() throws InterruptedException {
        checkout_function checkoutFunction = new checkout_function(driver);
        checkoutFunction.orderSummary();
    }
    @Test
    public void verifySectionTip() throws InterruptedException {
        checkout_function checkoutFunction = new checkout_function(driver);
        checkoutFunction.verifySectionTip();
    }
    @Test
    public void verifyOrderSummaryOption1() throws InterruptedException {
        checkout_function checkoutFunction = new checkout_function(driver);
        checkoutFunction.verifyOrderSummaryOption1();
    }
    @Test
    public void verifyOrderSummaryOption2() throws InterruptedException {
        checkout_function checkoutFunction = new checkout_function(driver);
        checkoutFunction.verifyOrderSummaryOption2();
    }
    @Test
    public void verifyOrderSummaryOption3() throws InterruptedException {
        checkout_function checkoutFunction = new checkout_function(driver);
        checkoutFunction.verifyOrderSummaryOption3();
    }
    @Test
    public void verifyOrderSummaryOption4() throws InterruptedException {
        checkout_function checkoutFunction = new checkout_function(driver);
        checkoutFunction.verifyOrderSummaryOption4();
    }
    @Test
    public void verifyOrderSummaryOption5() throws InterruptedException {
        checkout_function checkoutFunction = new checkout_function(driver);
        checkoutFunction.verifyOrderSummaryOption5();
    }
    @Test
    public void verifyOrderSummaryNoTip() throws InterruptedException {
        checkout_function checkoutFunction = new checkout_function(driver);
        checkoutFunction.verifyOrderSummaryNoTip();
    }
    @Test
    public void verifyOrderSummaryCustomTip() throws InterruptedException {
        checkout_function checkoutFunction = new checkout_function(driver);
        checkoutFunction.verifyOrderSummaryCustomTip();
    }


}

