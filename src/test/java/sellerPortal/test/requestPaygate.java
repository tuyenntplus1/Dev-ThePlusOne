package sellerPortal.test;

import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.editSellpage_function;
import sellerPortal.function.login_function;
import sellerPortal.function.seller_function;

public class requestPaygate extends seller {
    @Test
    public void requestPaygate() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login("sogajib191@alvisani.com", "sogajib191@123");

        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();
        sellerFunction.viewEditSellpgage();
        Thread.sleep(5000);

        editSellpage_function editSellpageFunction= new editSellpage_function(driver);
        editSellpageFunction.editSellpagePage();
        Thread.sleep(5000);

        editSellpageFunction.uploadFileLogo();

        editSellpageFunction.uploadFivacon();

        editSellpageFunction.editTitleSellpage();

        editSellpageFunction.scrollToTitle();

        editSellpageFunction.setBulkVariants();
        editSellpageFunction.SetupCountDownTimer();

        editSellpageFunction.createAnnouncementBar();

//        editSellpageFunction.editDescription();
//        driver.switchTo().defaultContent();

        editSellpageFunction.createCombo();

//        editSellpageFunction.ShippingSetting();

        editSellpageFunction.clickQuantityDiscount();
        editSellpageFunction.inputDiscount1();

//        editSellpageFunction.setupImageWithText();

        editSellpageFunction.addReview();

        editSellpageFunction.createPolicy();

        driver.switchTo().defaultContent();
        editSellpageFunction.clickSavePublic();

        Thread.sleep(5000);

        editSellpageFunction.requestPaygate();
//        editSellpageFunction.verifySellpage();
    }
}
