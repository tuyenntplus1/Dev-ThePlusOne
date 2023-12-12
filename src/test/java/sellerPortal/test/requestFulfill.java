package sellerPortal.test;

import buyerCheckOut.function.checkout_function;
import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.*;

public class requestFulfill extends seller {
    @Test(priority = 1)
    public void createOrderRequest() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");

        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();
        sellerFunction.sellpageSearch();
        Thread.sleep(5000);

        sellpageRevenue_function sellpageRevenueFunction = new sellpageRevenue_function(driver);
        sellpageRevenueFunction.swithSellpage();

        checkout_function checkoutFunction = new checkout_function(driver);
        checkoutFunction.paypalCheckout1();
    }
    @Test(priority = 2)
    public void createRequestFulfill() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");

        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();
        sellerFunction.viewMyOrderPage();

        myOrder_function myOrderFunction = new myOrder_function(driver);
        myOrderFunction.requestFulfill();

    }
    @Test
    public void verifyRejectRequestByFulfillment() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");

        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();
        sellerFunction.viewRequestFulfill();

        requestFulfillSeller_function requestFulfillSellerFunction = new requestFulfillSeller_function(driver);
        requestFulfillSellerFunction.verifyRequestFulfill();
        requestFulfillSellerFunction.verifyRejectRequestByFulfillment();

    }
    @Test
    public void verifyInvoiceByFulfillment() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");

        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();
        sellerFunction.viewRequestFulfill();

        requestFulfillSeller_function requestFulfillSellerFunction = new requestFulfillSeller_function(driver);
        requestFulfillSellerFunction.verifyRequestFulfill();
        requestFulfillSellerFunction.verifyInvoieByFulfillment();
    }
    @Test
    public void rejectInvoice() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");

        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();
        sellerFunction.viewRequestFulfill();

        requestFulfillSeller_function requestFulfillSellerFunction = new requestFulfillSeller_function(driver);
        requestFulfillSellerFunction.verifyRequestFulfill();
        requestFulfillSellerFunction.verifyInvoieByFulfillment();
        requestFulfillSellerFunction.rejectInvoice();
    }
    @Test
    public void acceptInvoice() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");

        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();
        sellerFunction.viewRequestFulfill();

        requestFulfillSeller_function requestFulfillSellerFunction = new requestFulfillSeller_function(driver);
        requestFulfillSellerFunction.verifyRequestFulfill();
        requestFulfillSellerFunction.verifyInvoieByFulfillment();
        requestFulfillSellerFunction.acceptInvoice();
    }

}
