package buyerCheckOut.test;

import buyerCheckOut.function.sellpage_function;
import core.baseTest.buyer;
import org.testng.annotations.Test;

public class sellpage extends buyer {

    @Test(priority= 1 )
    public void verifyTitleSellpage(){
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifyTitleSellpage();
    }
    @Test(priority= 2 )
    public void verifyTitleProduct(){
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifyTitleProduct();
    }
    @Test(priority= 3 )
    public void verifyPrice(){
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifyPrice();
    }
    @Test(priority= 4 )
    public void verifyFomo() {
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifyFomo();
    }
    @Test(priority= 5 )
    public void verifyCountDownTimer(){
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifyCountDownTimer();
    }
    @Test(priority= 6 )
    public void verifyVariants() throws InterruptedException {
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifyVariants();
    }
    @Test(priority= 7 )
    public void verifyQuantity(){
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifyQuantity();
    }
    @Test(priority= 8 )
    public void verifyIconIncrease() throws InterruptedException {
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifyIncreaseIcon();
    }
    @Test(priority= 9 )
    public void verifyIconDecrease() throws InterruptedException {
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifyDecreaseIcon();
    }
    @Test(priority= 10 )
    public void verifyAddToCartBtn() throws InterruptedException {
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifyAddToCartBtn();
    }
    @Test(priority= 11 )
    public void verifyBuyItNowBtn() throws InterruptedException {
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifyBuyItNowBtn();
    }
    @Test(priority= 12 )
    public void verifyPaypalBtn() throws InterruptedException {
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifyPaypalBtn();
    }
    @Test(priority= 13 )
    public void verifyDescription() throws InterruptedException {
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifyDescription();
    }
    @Test(priority= 14 )
    public void verifySpecification() throws InterruptedException {
        sellpage_function sellpageFunction = new sellpage_function(driver);
        sellpageFunction.verifySpecification();
    }
}

