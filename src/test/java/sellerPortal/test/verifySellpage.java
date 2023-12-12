package sellerPortal.test;

import buyerCheckOut.function.checkout_function;
import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.login_function;
import sellerPortal.function.seller_function;
import sellerPortal.function.sellpageRevenue_function;

public class verifySellpage extends seller {
    @Test
    public void verifySellpage() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tuyennt@aionbyte.com", "aion@123");
//        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");
//        loginFunction.login("botige6044@aaorsi.com", "tWvgKT9t");

        seller_function sellerFunction = new seller_function(driver);
        Thread.sleep(5000);
        sellerFunction.sellpage1();
        Thread.sleep(5000);
        sellpageRevenue_function sellpageRevenueFunction = new sellpageRevenue_function(driver);
        sellpageRevenueFunction.verifyRevenueSellpage();
    }
    @Test
    public void checkoutPaypal() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");

        seller_function sellerFunction = new seller_function(driver);
        Thread.sleep(5000);
        sellerFunction.sellpage1();
        Thread.sleep(5000);


        sellpageRevenue_function sellpageRevenueFunction = new sellpageRevenue_function(driver);
        sellpageRevenueFunction.swithSellpage();
        driver.navigate().refresh();
        Thread.sleep(180000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        checkout_function  checkoutFunction = new checkout_function(driver);
        checkoutFunction.paypalCheckout1();

    }
//    @Test
//    public void buyer() throws InterruptedException {
//        for(int i=0;i<50;i++){
//         checkoutPaypal();
//            i++;
//        }
//    }
    @Test
    public void checkoutStripe() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");

        seller_function sellerFunction = new seller_function(driver);
        Thread.sleep(5000);
        sellerFunction.sellpage1();
        Thread.sleep(5000);

        sellpageRevenue_function sellpageRevenueFunction = new sellpageRevenue_function(driver);
        sellpageRevenueFunction.swithSellpage();

        checkout_function  checkoutFunction = new checkout_function(driver);
        checkoutFunction.stripeCheckout();

    }
    //tesst github

}
