package sellerPortal.test;

import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.login_function;
import sellerPortal.function.myProducts_function;
import sellerPortal.function.seller_function;

public class Product extends seller {
        @Test
    public void verifymesErro() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tuyennt@aionbyte.com", "aion@123");
        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.viewMyProducts();
        myProducts_function myProductsFunction = new myProducts_function(driver);
        myProductsFunction.clickAddProduct();
        myProductsFunction.createTitleProduct();
        myProductsFunction.verifyMes();

    }
    @Test
    public void addProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//      loginFunction.login("tuyennt@aionbyte.com", "aion@123");
//        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
//      loginFunction.login("bowigi4623@naymedia.com", "595Q3z9h");//team2
//      loginFunction.login("nobiw89939@naymedia.com", "4BW857By");//team2
//        loginFunction.login("botige6044@aaorsi.com", "tWvgKT9t");//team defaul
//        loginFunction.login("goriyo9522@bnovel.com", "goriyo9522@123");
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");
//        loginFunction.login("warem16407@wiemei.com", "700m0X0c");//team2
//        loginFunction.login("yopomen643@naymedia.com", "7XDEF37b");//team3
//        loginFunction.login("royogid863@kkoup.com", "c9khB19h");//team3
//        loginFunction.login("botige6044@aaorsi.com", "tWvgKT9t");
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();
        sellerFunction.viewMyProducts();
        myProducts_function myProductsFunction = new myProducts_function(driver);
        myProductsFunction.clickAddProduct();
        myProductsFunction.createTitleProduct();
        myProductsFunction.createDescription();
        driver.switchTo().defaultContent();
        myProductsFunction.createSpecification();
        driver.switchTo().defaultContent();
        myProductsFunction.addImage();
        myProductsFunction.addProductCost();
        myProductsFunction.addOption();
        myProductsFunction.verifyVariants();
        myProductsFunction.addShippingInformation();
        myProductsFunction.policyProduct();
        myProductsFunction.save();
//        myProductsFunction.saveAndRequest();
    }
    @Test
    public void requestProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tuyennt@aionbyte.com", "aion@123");
//        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
//        loginFunction.login("botige6044@aaorsi.com", "tWvgKT9t");
//        loginFunction.login("goriyo9522@bnovel.com", "goriyo9522@123");
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.viewMyProducts();
        myProducts_function myProductsFunction = new myProducts_function(driver);
        myProductsFunction.clickAddProduct();
        myProductsFunction.createTitleProduct();
        myProductsFunction.createDescription();
        driver.switchTo().defaultContent();
        myProductsFunction.createSpecification();
        driver.switchTo().defaultContent();
        myProductsFunction.addImage();
        myProductsFunction.addProductCost();
        myProductsFunction.addOption();
        myProductsFunction.verifyVariants();
        myProductsFunction.addShippingInformation();
        myProductsFunction.policyProduct();
//        myProductsFunction.save();
        myProductsFunction.saveAndRequest();
    }
    @Test
    public void editProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");
////        loginFunction.login("tuyennt@aionbyte.com", "aion@123");
//        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();
        sellerFunction.viewMyProducts();
        myProducts_function myProductsFunction = new myProducts_function(driver);
        myProductsFunction.viewEditProduct();
        myProductsFunction.editTitleProduct();
        myProductsFunction.editDescriptionProduct();
        driver.switchTo().defaultContent();
        myProductsFunction.editSpecificationProduct();
        driver.switchTo().defaultContent();
        myProductsFunction.editImage();
        myProductsFunction.editPricing();
        myProductsFunction.editVariants();
        myProductsFunction.editShippingInfomation();
        myProductsFunction.editPolicy();
        myProductsFunction.saveEditProduct();
    }
}
