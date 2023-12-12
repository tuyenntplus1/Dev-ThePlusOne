package sellerPortal.test;

import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.login_function;
import sellerPortal.function.myProducts_function;
import sellerPortal.function.requestSourcingseller_function;
import sellerPortal.function.seller_function;

import java.io.IOException;

public class requestSourcingSeller extends seller {


    @Test
    public void requestSourcing1() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tuyennt@aionbyte.com", "aion@123");
//        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
//        loginFunction.login("botige6044@aaorsi.com", "tWvgKT9t");
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();
        sellerFunction.viewMyProducts();
        myProducts_function myProductsFunction = new myProducts_function(driver);
        myProductsFunction.requestSourcing();
    }
    @Test(priority = 0)
    public void requestSourcing2() throws InterruptedException, IOException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tuyennt@aionbyte.com", "aion@123");
//        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
//        loginFunction.login("botige6044@aaorsi.com", "tWvgKT9t");
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();
        sellerFunction.viewRequestSourcing();
        requestSourcingseller_function requestSourcingFunction = new requestSourcingseller_function(driver);
        requestSourcingFunction.addRequestSourcing();
        requestSourcingFunction.verifyRequestDetail();
    }
    @Test
    public void verifyRespondByNewProductFromFulfill() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tuyennt@aionbyte.com", "aion@123");
//        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
//        loginFunction.login("botige6044@aaorsi.com", "tWvgKT9t");
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();
        sellerFunction.viewRequestSourcing();
        requestSourcingseller_function requestSourcingFunction = new requestSourcingseller_function(driver);
        requestSourcingFunction.verifyRespondByNewProductFromFulfill();
//        requestSourcingFunction.sellerRejectRequest();
        requestSourcingFunction.sellerAcceptRespond();
    }
    @Test
    public void verifyRespondRejectRequestFromFulfill() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tuyennt@aionbyte.com", "aion@123");
        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.viewRequestSourcing();
        requestSourcingseller_function requestSourcingFunction = new requestSourcingseller_function(driver);
        requestSourcingFunction.verifyRespondRejectRequestFromFulfill();
    }
    @Test
    public void verifyRespondFromListProductByFulfill() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tuyennt@aionbyte.com", "aion@123");
        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
//        loginFunction.login("botige6044@aaorsi.com", "tWvgKT9t");
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.viewRequestSourcing();
        requestSourcingseller_function requestSourcingFunction = new requestSourcingseller_function(driver);
        requestSourcingFunction.verifyRespondFromListProductByFulfill();
        requestSourcingFunction.sellerAcceptRespond();
    }
    @Test
    public void respondTheSameProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tuyennt@aionbyte.com", "aion@123");
//        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
        loginFunction.login("botige6044@aaorsi.com", "tWvgKT9t");
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.viewRequestSourcing();
        requestSourcingseller_function requestSourcingFunction = new requestSourcingseller_function(driver);
        requestSourcingFunction.respondAccept();
    }
    @Test
    public void respondByEditSellerProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tuyennt@aionbyte.com", "aion@123");
//        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
        loginFunction.login("botige6044@aaorsi.com", "tWvgKT9t");
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.viewRequestSourcing();
        requestSourcingseller_function requestSourcingFunction = new requestSourcingseller_function(driver);
        requestSourcingFunction.respondByEditSellerProduct();
    }
}
