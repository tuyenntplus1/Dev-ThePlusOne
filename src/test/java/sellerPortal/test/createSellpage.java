package sellerPortal.test;

import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.*;

public class createSellpage extends seller {
    @Test
    public void CreateEhighwaySellpage() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
        loginFunction.login("botige6044@aaorsi.com", "tWvgKT9t");
//        loginFunction.login("goriyo9522@bnovel.com", "goriyo9522@123");
//        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");
        productPubic_function productPublicFunction = new productPubic_function(driver);
        productPublicFunction.searchProduct("Products for test automation");
        Thread.sleep(3000);

        productPublicFunction.hoverImage();
        productPublicFunction.sellThisProduct();

        theme_function themeFunction = new theme_function(driver);
        themeFunction.hoverImageRevenue();
        themeFunction.clickCreateSellpage();

        createDomain_function createDomainFunction = new createDomain_function(driver);
        createDomainFunction.createEhighwayDomain();
//        createDomainFunction.clickConfirmBtn();
//
//        editSellpage_function editSellpageFunction = new editSellpage_function(driver);
//        editSellpageFunction.verifyCreateSellpage();
//
//        String s1 = driver.getCurrentUrl();
//
//        System.out.println(s1);

    }
    @Test()
    public void createCustomizeDomain() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
        loginFunction.login("botige6044@aaorsi.com", "tWvgKT9t");
//        loginFunction.login("goriyo9522@bnovel.com", "goriyo9522@123");
//        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");
        productPubic_function productPublicFunction = new productPubic_function(driver);
        productPublicFunction.searchProduct("Products for test automation");
        Thread.sleep(3000);

        productPublicFunction.hoverImage();
        productPublicFunction.sellThisProduct();

        theme_function themeFunction = new theme_function(driver);
        themeFunction.hoverImageRevenue();
        themeFunction.clickCreateSellpage();

        createDomain_function createDomainFunction = new createDomain_function(driver);
        createDomainFunction.createCustomizeDomain();
    }
    @Test
    public void createDomainMyProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");

        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();

        sellerFunction.viewMyProducts();
        myProducts_function myProductsFunction = new myProducts_function(driver);
        myProductsFunction.viewProductDetail();

        theme_function themeFunction = new theme_function(driver);
        themeFunction.hoverImageRevenue();
        themeFunction.clickCreateSellpage();

        createDomain_function createDomainFunction = new createDomain_function(driver);
        createDomainFunction.createCustomizeDomain();
    }
    @Test
    public void createDomainPrivateProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");

        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();

        sellerFunction.viewMyProducts();
        myProducts_function myProductsFunction = new myProducts_function(driver);
        myProductsFunction.viewPrivateProduct();
        myProductsFunction.viewProductDetail();

        theme_function themeFunction = new theme_function(driver);
        themeFunction.hoverImageRevenue();
        themeFunction.clickCreateSellpage();

        createDomain_function createDomainFunction = new createDomain_function(driver);
        createDomainFunction.createCustomizeDomainVerify();

    }
}
