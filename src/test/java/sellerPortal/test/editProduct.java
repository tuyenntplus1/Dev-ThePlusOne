package sellerPortal.test;

import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.login_function;
import sellerPortal.function.myProducts_function;
import sellerPortal.function.seller_function;

public class editProduct extends seller {
    @Test
    public void editProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tuyennt@aionbyte.com", "aion@123");
        loginFunction.login("tuyennguyen.aion@example.com", "eHighway@123");
        seller_function sellerFunction = new seller_function(driver);
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
