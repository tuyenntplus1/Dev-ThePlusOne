package sellerPortal.page;

import org.openqa.selenium.By;

public class requestFulfill_page {
    public By titleRequestFulfill = By.xpath("//main//span[contains(text(),'Request fulfill')]");
    public By productNameRequest = By.xpath("//div[@class='d-flex h-100']/div[2]/div/div/div/div/span[2]");
    public By numberRequestFulfill = By.xpath("//tbody/tr[2]/td[2]");
    //detail request fulfill
    public By numberRequestFulfillDetail = By.xpath("//div[@class='styles_request__detail__title__appAR']/div/div/span[1]");
    public By titleRequestFulfillDetail = By.xpath("//div[@class='styles_request__detail__title__appAR']/div/div/span[2]");
    public By fulfillerDetail = By.xpath("//div[@class='styles_request__detail__body__I9aAW']/div/div[1]");
    public By statusDetail = By.xpath("//div[@class='styles_request__detail__body__I9aAW']/div/div[2]/div/span");
    public By linkProductRequest = By.xpath("//article[@class='styles_messages__hT9u1 styles_messagesRight__GtryD']//p");
    //verify reject By Fulfillment
    public By textRejectedDetail = By.xpath("//article[@class ='styles_messages__hT9u1 styles_messagesLeft__Wda9h']/div/strong/i");
    public By valueQuickReason1Detail = By.xpath("//article[@class ='styles_messages__hT9u1 styles_messagesLeft__Wda9h']/div/p[1]");
    public By valueQuickReason2Detail = By.xpath("//article[@class ='styles_messages__hT9u1 styles_messagesLeft__Wda9h']/div/p[2]");
    public By valueQuickReason3Detail = By.xpath("//article[@class ='styles_messages__hT9u1 styles_messagesLeft__Wda9h']/div/p[3]");
    public By valueQuickReason4Detail = By.xpath("//article[@class ='styles_messages__hT9u1 styles_messagesLeft__Wda9h']/div/p[4]");
    public By valueQuickReasonInputDetail = By.xpath("//article[@class ='styles_messages__hT9u1 styles_messagesLeft__Wda9h']/div/p[5]");

    public By textCloseRequest = By.xpath("//div[contains(text(),'This request was closed')]");
    //verify invoice off fulfillment
    public By headerNewResspond = By.xpath("//i[contains(text(),'New offer. Please check!')]");
    public By linkInvoice1= By.xpath("//article[@class='styles_messages__hT9u1 styles_messagesLeft__Wda9h']/div/div/div");
    public By titleInvoice = By.xpath("//div[@class='ant-modal-content']//strong[1]");
    public By companyInvoice = By.xpath("//div[@class='ant-modal-body']//h2[1]");
    public By addressCompany = By.xpath("//div[@class='ant-modal-body']/div/div/div[1]");
    public By officeCompany = By.xpath("//div[@class='ant-modal-body']/div/div/div[2]");
    public By telephoneCompany = By.xpath("//div[@class='ant-modal-body']/div/div/div[3]");
    public By nameInvoice  = By.xpath("//div[@class='ant-modal-body']/div/div/h2[2]/strong");
    public By toSeller = By.xpath("//div[@class='ant-modal-body']/div/div[2]/div[2]");
    public By shipment = By.xpath("//div[@class='ant-modal-body']/div/div[3]/div[2]/h5");
    public By packing = By.xpath("//div[@class='ant-modal-body']/div/div[4]/div[2]/h5");
    public By insurance = By.xpath("//div[@class='ant-modal-body']/div/div[5]/div[2]/h5");
    public By productNameInvoice = By.xpath("//div[@class='ant-modal-content']/div[2]//tbody/tr[2]/td[1]");
    public By variantProduct = By.xpath("//div[@class='ant-modal-content']/div[2]//tbody/tr[2]/td[2]");
    public By regionInvoice = By.xpath("//div[@class='ant-modal-content']/div[2]//tbody/tr[2]/td[3]");
    public By firstItem = By.xpath("//div[@class='ant-modal-content']/div[2]//tbody/tr[2]/td[4]");
    public By additionalItem = By.xpath("//div[@class='ant-modal-content']/div[2]//tbody/tr[2]/td[5]");
    public By quantityInvoice = By.xpath("//div[@class='ant-modal-content']/div[2]//tbody/tr[2]/td[6]");
    public By productCostInvoice = By.xpath("//div[@class='ant-modal-content']/div[2]//tbody/tr[2]/td[7]");
    public By subtotal = By.xpath("//div[@class='ant-modal-content']/div[2]//tbody/tr[2]/td[8]");
    public By totalInvoice = By.xpath("//div[@class='ant-modal-content']//tfoot/tr/td[5]/strong");
    public By totalQuantity = By.xpath("//div[@class='ant-modal-content']//tfoot/tr/td[3]//strong");

    public By payoneerAccount = By.xpath("//div[contains(text(),'mimacso.deal@gmail.com')]");
    public By paypalAccount = By.xpath("//div[contains(text(),'bquangtan108@gmail.com')]");
    //Reject invoice
    public By rejectInvoiceBtn = By.xpath("//button[@id='mui-2']");
    public By AcceptInvoiceBtn = By.xpath("//button[@id='mui-3']");
    public By checkboxQuickReason1 = By.xpath("//div[@id='reasons']//label[1]/span");
    public By quickReason1 = By.xpath("//div[@id='reasons']//label[1]/span[2]");
    public By checkboxQuickReason2 = By.xpath("//div[@id='reasons']/div/div[2]/label/span");
    public By quickReason2  = By.xpath("//div[@id='reasons']/div/div[2]/label/span[2]");
    public By otherReason = By.id("other");
    public By rejectAndCloseBtn = By.xpath("//button[contains(text(),'Reject & close request')]");
    public By rejectAndContinueBtn = By.xpath("//button[contains(text(),'Reject & continue')]");
    public By headerPopupConfirm = By.xpath("//div[@class='ant-modal-header']//div[contains(text(),'Confirm')]");
    public By bodyPopupConfirm = By.xpath("//div[@class='ant-modal-body']/p");
    public By confirmRejectBtn = By.xpath("//span[contains(text(),'Confirm')]/parent::button");
    public By cancelBtn = By.xpath("//span[contains(text(),'Cancel')]/parent::button");
    public By status = By.xpath("//div[@role ='status']");




}
