package sellerPortal.function;

import core.basePage;
import core.common_function;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.requestFulfill_page;

public class requestFulfillSeller_function extends basePage {
    public requestFulfillSeller_function(WebDriver driver) {
        super(driver);
    }
    common_function commonFunction = new common_function(driver);
    requestFulfill_page requestFulfillPage = new requestFulfill_page();
    public void verifyRequestFulfill(){
        commonFunction.click(requestFulfillPage.numberRequestFulfill);
        commonFunction.verifyElement(requestFulfillPage.titleRequestFulfillDetail,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional_1order");
        commonFunction.verifyElement(requestFulfillPage.fulfillerDetail,"Fulfiller: eHighway partner");
        commonFunction.verifyElement(requestFulfillPage.linkProductRequest,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
    }
    public void verifyRejectRequestByFulfillment(){
        commonFunction.verifyElement(requestFulfillPage.textRejectedDetail,"Rejected");
        commonFunction.verifyElement(requestFulfillPage.valueQuickReason1Detail,"Temporary Out of Stock");
        commonFunction.verifyElement(requestFulfillPage.valueQuickReason2Detail,"Product is no longer manufactured");
        commonFunction.verifyElement(requestFulfillPage.valueQuickReason3Detail,"Product cannot be manufactured");
        commonFunction.verifyElement(requestFulfillPage.valueQuickReason4Detail,"Policy Violation");
        commonFunction.verifyElement(requestFulfillPage.valueQuickReasonInputDetail,"Sorry we cannot supply this product.");
        commonFunction.verifyPage(requestFulfillPage.textCloseRequest);
        commonFunction.verifyElement(requestFulfillPage.statusDetail,"Rejected");
    }
    public void verifyInvoieByFulfillment(){
        commonFunction.verifyElement(requestFulfillPage.headerNewResspond,"New offer. Please check!");
        commonFunction.click(requestFulfillPage.linkInvoice1);
        commonFunction.verifyElement(requestFulfillPage.companyInvoice,"TEDY MALL COMPANY LIMITED");
        commonFunction.verifyElement(requestFulfillPage.addressCompany,"Company address: No, 4D, Alley 10 Pho Lua Str., Van Phuc Ward, Ha dong Distr., Ha Noi, Viet Nam");
        commonFunction.verifyElement(requestFulfillPage.officeCompany,"Office Address: No 19 Galaxy 1, Tsq Galaxy Van phuc, Ha Dong Distr., Ha noi, Viet Nam");
        commonFunction.verifyElement(requestFulfillPage.telephoneCompany,"TEL: +84935827999");
        commonFunction.verifyElement(requestFulfillPage.nameInvoice,"COMMERCIAL INVOICE");
        commonFunction.verifyElement(requestFulfillPage.toSeller,"sogajib191@alvisani.com");
        commonFunction.verifyElement(requestFulfillPage.shipment,"Giao Hang Nhanh");
        commonFunction.verifyElement(requestFulfillPage.packing,"CS Fulfill");
        commonFunction.verifyElement(requestFulfillPage.insurance,"To be effacted the buyer");
        commonFunction.verifyElement(requestFulfillPage.productNameInvoice,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.verifyElement(requestFulfillPage.variantProduct,"Purple-S");
        commonFunction.verifyElement(requestFulfillPage.regionInvoice,"US");
        commonFunction.verifyElement(requestFulfillPage.firstItem,"USD 4.99");
        commonFunction.verifyElement(requestFulfillPage.additionalItem,"USD 3.99");
        commonFunction.verifyElement(requestFulfillPage.quantityInvoice,"1 pieces");
        commonFunction.verifyElement(requestFulfillPage.productCostInvoice,"USD 8.33");
        commonFunction.verifyElement(requestFulfillPage.subtotal,"USD 13.32");
        commonFunction.verifyElement(requestFulfillPage.totalQuantity,"1");
        commonFunction.verifyElement(requestFulfillPage.totalInvoice,"USD 13.32");
        commonFunction.verifyElement(requestFulfillPage.payoneerAccount,"mimacso.deal@gmail.com");
        commonFunction.verifyElement(requestFulfillPage.paypalAccount,"bquangtan108@gmail.com");
    }
    public void rejectInvoice(){
        commonFunction.click(requestFulfillPage.rejectInvoiceBtn);
        commonFunction.verifyElement(requestFulfillPage.quickReason1,"Price is higher than exceptation");
        commonFunction.verifyElement(requestFulfillPage.quickReason2,"I don't want to sell this anymore");
        commonFunction.verifyPage(requestFulfillPage.rejectAndCloseBtn);
        commonFunction.click(requestFulfillPage.checkboxQuickReason1);
        commonFunction.click(requestFulfillPage.checkboxQuickReason2);
        commonFunction.senKeys(requestFulfillPage.otherReason,"The product price is too high, I want to find a more suitable partner.");
        commonFunction.click(requestFulfillPage.rejectAndCloseBtn);
        commonFunction.verifyElement(requestFulfillPage.headerPopupConfirm,"Confirm");
        commonFunction.verifyElement(requestFulfillPage.bodyPopupConfirm,"You want to reject and close this request?");
        commonFunction.verifyPage(requestFulfillPage.cancelBtn);
        commonFunction.click(requestFulfillPage.confirmRejectBtn);
        commonFunction.verifyElement(requestFulfillPage.status,"Rejected & closed request");
    }
    public void acceptInvoice(){
        commonFunction.click(requestFulfillPage.AcceptInvoiceBtn);
    }

}
