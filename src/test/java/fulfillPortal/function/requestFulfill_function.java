package fulfillPortal.function;

import core.basePage;
import core.common_function;
import fulfillPortal.page.requestFulfill_page;
import org.openqa.selenium.WebDriver;

public class requestFulfill_function extends basePage {
    public requestFulfill_function(WebDriver driver) {
        super(driver);
    }
    requestFulfill_page  requestFulfillPage = new requestFulfill_page();
    common_function commonFunction =new common_function(driver);
    public void verifyRequestFulfill(){
        commonFunction.senKeyPrice(requestFulfillPage.searchRequestFulfill, "dvi");
        commonFunction.click(requestFulfillPage.numberRequestFulfill);
        commonFunction.verifyElement(requestFulfillPage.titleRequestFulfill,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional_1order");
        commonFunction.verifyElement(requestFulfillPage.sellerRequestFulfill,"Seller: sogajib191@alvisani.com");
        commonFunction.verifyElement(requestFulfillPage.statusRequestFulfill,"Status: Opening");
        commonFunction.verifyElement(requestFulfillPage.productRequestFulfill,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
    }
    public void rejectRequestFulfill(){
        commonFunction.click(requestFulfillPage.rejectBtn);
        commonFunction.verifyElement(requestFulfillPage.textReason1,"Temporary Out of Stock");
        commonFunction.verifyElement(requestFulfillPage.textReason2,"Product is no longer manufactured");
        commonFunction.verifyElement(requestFulfillPage.textReason3,"Product cannot be manufactured");
        commonFunction.verifyElement(requestFulfillPage.textReason4,"Policy Violation");
        commonFunction.click(requestFulfillPage.checkboxReason1);
        commonFunction.click(requestFulfillPage.checkboxReason2);
        commonFunction.click(requestFulfillPage.checkboxReason3);
        commonFunction.click(requestFulfillPage.checkboxReason4);
        commonFunction.senKeyPrice(requestFulfillPage.otherReason,"Sorry we cannot supply this product.");
        commonFunction.click(requestFulfillPage.rejectCloseBtn);
    }
    public void createInvoice(){
        commonFunction.click(requestFulfillPage.respondBtn);
        //company
        commonFunction.verifyElement(requestFulfillPage.companyFulfill,"TEDY MALL COMPANY LIMITED");
        commonFunction.verifyElement(requestFulfillPage.addressCompany,"Company address: No, 4D, Alley 10 Pho Lua Str., Van Phuc Ward, Ha dong Distr., Ha Noi, Viet Nam");
        commonFunction.verifyElement(requestFulfillPage.officeAddressCompany,"Office Address: No 19 Galaxy 1, Tsq Galaxy Van phuc, Ha Dong Distr., Ha noi, Viet Nam");
        commonFunction.verifyElement(requestFulfillPage.telephoneCompany,"TEL: +84935827999");

        commonFunction.verifyElement(requestFulfillPage.titleInvoice,"COMMERCIAL INVOICE");
        commonFunction.verifyElement(requestFulfillPage.toSeller,"sogajib191@alvisani.com");
        commonFunction.senKeys(requestFulfillPage.shipment,"Giao Hang Nhanh");
        commonFunction.senKeys(requestFulfillPage.packing,"CS Fulfill");
        commonFunction.verifyValueElement(requestFulfillPage.insurance,"To be effacted the buyer");
        //table
        commonFunction.verifyElement(requestFulfillPage.productInvoice,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.verifyElement(requestFulfillPage.colorVariantInvoice,"Color - Purple");
        commonFunction.verifyElement(requestFulfillPage.sizeVariantInvoice,"Size - S");
        commonFunction.senKeyPrice(requestFulfillPage.firstItemInvoice,"4.99");
        commonFunction.senKeyPrice(requestFulfillPage.additionalItemInvoice,"3.99");
        commonFunction.verifyElement(requestFulfillPage.quantityInvoice,"1 pieces");
        commonFunction.senKeyPrice(requestFulfillPage.productCostInvoice,"8.33");
        commonFunction.verifyValueElement(requestFulfillPage.subtotalInvoice,"13.32");
        commonFunction.verifyValueElement(requestFulfillPage.total,"13.32");
        //payoneer
        commonFunction.verifyElement(requestFulfillPage.payoneerAccount,"mimacso.deal@gmail.com");
        commonFunction.verifyElement(requestFulfillPage.paypalAccount,"bquangtan108@gmail.com");

        commonFunction.click(requestFulfillPage.createInvoiceBtn);
        //preview invoice
        commonFunction.verifyElement(requestFulfillPage.previewInvoice,"Preview Invoice");
        commonFunction.click(requestFulfillPage.sendInvoiceBtn);
        commonFunction.verifyElement(requestFulfillPage.statusCreateInvoice,"Respond Invoice success");
    }
    public void verifyRejectRequest(){
        commonFunction.verifyElement(requestFulfillPage.headerRejected,"Rejected");
        commonFunction.verifyElement(requestFulfillPage.quickReason1,"Temporary Out of Stock");
        commonFunction.verifyElement(requestFulfillPage.quickReason2,"Product is no longer manufactured");
        commonFunction.verifyElement(requestFulfillPage.quickReason3,"Product cannot be manufactured");
        commonFunction.verifyElement(requestFulfillPage.quickReason4,"Policy Violation");
        commonFunction.verifyElement(requestFulfillPage.otherReasonDetail,"Sorry we cannot supply this product.");
        commonFunction.verifyPage(requestFulfillPage.closeRequestFulfill);
        commonFunction.verifyElement(requestFulfillPage.statusRequestFulfill,"Status: Rejected");

    }
}
