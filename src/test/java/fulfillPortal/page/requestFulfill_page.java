package fulfillPortal.page;

import org.openqa.selenium.By;

public class requestFulfill_page {
    public By searchRequestFulfill = By.xpath("//input[@placeholder ='Search product name, ticket number, seller']");

    public By numberRequestFulfill = By.xpath("//tbody/tr[2]/td[2]/div");
    public By titleRequestFulfill = By.xpath("//main//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-5 css-13vjw49']/div/div/div/div/div/span[2]");
    public By sellerRequestFulfill = By.xpath("//main//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-5 css-13vjw49']/div/div/div/div[2]/div[1]");
    public By statusRequestFulfill = By.xpath("//main//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-5 css-13vjw49']/div/div/div/div[2]/div[2]");
    public By productRequestFulfill = By.xpath("//h4[contains(text(),'Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional')]");
    public By rejectBtn = By.xpath("//button[contains(text(),'Reject')]");
    public By respondBtn = By.xpath("//button[contains(text(),'Respond')]");
    //Popup Reject
    public By checkboxReason1 = By.xpath("//div[@id='options']/label[1]/span[1]");
    public By textReason1 = By.xpath("//div[@id='options']/label[1]/span[2]");
    public By checkboxReason2 = By.xpath("//div[@id='options']/label[2]/span[1]");
    public By textReason2 = By.xpath("//div[@id='options']/label[2]/span[2]");
    public By checkboxReason3 = By.xpath("//div[@id='options']/label[3]/span[1]");
    public By textReason3 = By.xpath("//div[@id='options']/label[3]/span[2]");
    public By checkboxReason4 = By.xpath("//div[@id='options']/label[4]/span[1]");
    public By textReason4 = By.xpath("//div[@id='options']/label[4]/span[2]");
    public By otherReason = By.id("Description");
    public By rejectCloseBtn = By.xpath("//button[contains(text(),'Reject & Close')]");
    //Create Invoice
    public By createInvoiceBtn = By.xpath("//button[contains(text(),'Create Invoice')]");
    public By companyFulfill = By.xpath("//form[@id='myForm']/div/div/h4");
    public By addressCompany = By.xpath("//form[@id='myForm']/div/div/div[1]");
    public By officeAddressCompany = By.xpath("//form[@id='myForm']/div/div/div[2]");
    public By telephoneCompany = By.xpath("//form[@id='myForm']/div/div/div[3]");
    public By titleInvoice = By.xpath("//form[@id='myForm']/div[2]/h4");
    public By toSeller = By.xpath("//form[@id='myForm']/div[3]/div[2]/span");
    public By shipment = By.xpath("//input[@id='shippingment']");
    public By packing = By.xpath("//input[@id='packing']");
    public By insurance = By.xpath("//input[@id='insurance']");
    public By productInvoice = By.xpath("//form[@id='myForm']/div[7]//table/tbody/tr/td[1]");
    public By colorVariantInvoice = By.xpath("//form[@id='myForm']/div[7]//table/tbody/tr/td[2]/div[1]/span");
    public By sizeVariantInvoice = By.xpath("//form[@id='myForm']/div[7]//table/tbody/tr/td[2]/div[2]/span");
    public By region = By.xpath("//form[@id='myForm']/div[7]//table/tbody/tr/td[3]");
    public By firstItemInvoice = By.xpath("//form[@id='myForm']/div[7]//table/tbody/tr/td[4]//input");
    public By additionalItemInvoice = By.xpath("//form[@id='myForm']/div[7]//table/tbody/tr/td[5]//input");
    public By quantityInvoice = By.xpath("//form[@id='myForm']/div[7]//table/tbody/tr/td[6]/span");
    public By productCostInvoice = By.xpath("//form[@id='myForm']/div[7]//table/tbody/tr/td[7]//input");
    public By subtotalInvoice = By.xpath("//form[@id='myForm']/div[7]//table/tbody/tr/td[8]//input");
    public By total = By.xpath("//input[@id ='total']");
    public By payoneerAccount = By.xpath("//form[@id='myForm']/div[8]/div[2]/span");
    public By paypalAccount = By.xpath("//form[@id='myForm']/div[9]/div[2]/span");
    public By previewInvoice = By.xpath("//h3");
    public By sendInvoiceBtn = By.xpath("//button[contains(text(),'Send Invoice')]");
    //chi tiet request khi reject request
    public By headerRejected = By.xpath("//main/div/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[1]");
    public By quickReason1 = By.xpath("//main/div/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[2]");
    public By quickReason2 = By.xpath("//main/div/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[3]");
    public By quickReason3 = By.xpath("//main/div/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[4]");
    public By quickReason4 = By.xpath("//main/div/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[5]");
    public By otherReasonDetail = By.xpath("//main/div/div/div/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[6]");
    public By closeRequestFulfill = By.xpath("//div[contains(text(),'This request was closed')]");
    public By statusCreateInvoice = By.xpath("//div[@class='ant-message']//span[2]");






}
