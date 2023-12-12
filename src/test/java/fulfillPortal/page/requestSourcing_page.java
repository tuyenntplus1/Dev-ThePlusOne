package fulfillPortal.page;

import org.openqa.selenium.By;

public class requestSourcing_page {
    public By requestSourcingBtn = By.xpath("//button[contains(text(),'Request sourcing')]");
    public By searchRequest = By.xpath("//input[@placeholder ='Search product name, ticket number, seller']");
    public By numberRequest = By.xpath("//tbody/tr[2]/td[2]/div");
    public By imageRequest =By.xpath("//tbody/tr[2]/td[3]/img");
    public By productRequest = By.xpath("//tbody/tr[2]/td[4]/div");
    public By sellerRequest = By.xpath("//tbody/tr[2]/td[5]/div");
    public By timeRequest = By.xpath("//tbody/tr[2]/td[6]/span");
    public By allTab= By.xpath("//div[@role='group']/button[1]");
    public By unRespondTab = By.xpath("//div[@role='group']/button[2]");
    public By newEstTab = By.xpath("//div[@role='group']/button[3]");
    public By numberRequestDetail = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-5 css-13vjw49']/div/div/div/div/div/span[1]");
    public By productRequestDetail = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-5 css-13vjw49']/div/div/div/div/div/span[2]");
    public By sellerRequestDetail = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-5 css-13vjw49']/div/div/div/div[2]/div[1]");
    public By statusRequestDetail = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-5 css-13vjw49']/div/div/div/div[2]/div[2]");
    public By textRequestDetail = By.xpath("//div[@class='css-18egh0y']//preceding::div[1]");
    public By linkProductRequest= By.xpath("//div[@class='css-18egh0y']/span");
    public By productName = By.xpath("//div[contains(text(),'Product name')]//following::div[1]");
    public By linkProduct = By.xpath("//div[contains(text(),'Link')]//following::div[1]");
    public By descriptionProduct = By.xpath("//div[contains(text(),'Description')]//following::div[1]/div");
    public By reject1Button = By.xpath("//div[@id='rc_unique_0']//descendant::button[1]");
    public By repond1Button = By.xpath("//div[@id='rc_unique_0']//descendant::button[2]");
    //Quick reason
    public By textQuickReason = By.xpath("//h3[contains(text(),'Quick reason')]");
    public By checkboxReason1 = By.xpath("//div[@id='options']/label[1]");
    public By textReason1 = By.xpath("//div[@id='options']/label[1]/span[2]");
    public By checkboxReason2= By.xpath("//div[@id='options']/label[2]");
    public By textReason2 = By.xpath("//div[@id='options']/label[2]/span[2]");
    public By checkboxReason3= By.xpath("//div[@id='options']/label[3]");
    public By textReason3 = By.xpath("//div[@id='options']/label[3]/span[2]");
    public By checkboxReason4= By.xpath("//div[@id='options']/label[4]");
    public By textReason4 = By.xpath("//div[@id='options']/label[4]/span[2]");
    public By descriptionReason = By.xpath("//h3[contains(text(),'Description')]");
    public By descriptionInput = By.id("Description");
    public By rejectCloseBtn = By.xpath("//button[contains(text(),'Reject & Close')]");
    public By respondByNewProduct = By.xpath("//span[contains(text(),'By creating new product')]");
    public By respondByListProduct = By.xpath("//span[contains(text(),'By selecting from list')]");
    //New Product
    public By setionTitle = By.xpath("//form[1]");
    public By lastDealText = By.xpath("//span[contains(text(),'Last deal')]");
    public By checkboxLastDeal = By.xpath("//span[contains(text(),'Last deal')]//preceding::input[1]");
    public By respondBtn = By.xpath("//button[contains(text(),'Respond')]");
    //From list Product
    public By searchProduct = By.xpath("//input[@placeholder ='Search product name']");
    public By hoverProduct = By.xpath("//div[@class='ant-modal-body']//tbody/tr");
    public By selectBtn = By.xpath("//button[contains(text(),'Select')]");
    //Reject request
    public By textRejectedDetail = By.xpath("//div[@class='MuiCardContent-root css-12evlce']/div[4]/div/div/div[1]");
    public By valueQuickReason1Detail = By.xpath("//div[@class='MuiCardContent-root css-12evlce']/div[4]/div/div/div[2]");
    public By valueQuickReason2Detail = By.xpath("//div[@class='MuiCardContent-root css-12evlce']/div[4]/div/div/div[3]");
    public By valueQuickReason3Detail = By.xpath("//div[@class='MuiCardContent-root css-12evlce']/div[4]/div/div/div[4]");
    public By valueQuickReason4Detail = By.xpath("//div[@class='MuiCardContent-root css-12evlce']/div[4]/div/div/div[5]");
    public By valueQuickReasonInputDetail = By.xpath("//div[@class='MuiCardContent-root css-12evlce']/div[4]/div/div/div[6]");

    public By textRejected = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-5 css-13vjw49']/div/div/div/div[5]/div/div/div[1]");
    public By verifyReason1BySeller = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-5 css-13vjw49']/div/div/div/div[5]/div/div/div[2]");
    public By verifyReason2BySeller = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-5 css-13vjw49']/div/div/div/div[5]/div/div/div[3]");
    public By verifyReason3BySeller = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-5 css-13vjw49']/div/div/div/div[5]/div/div/div[4]");
    public By verifyReason4BySeller = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-5 css-13vjw49']/div/div/div/div[5]/div/div/div[5]");
    public By textCloseRequest = By.xpath("//div[contains(text(),'This request was closed')]");
//Detail request from my Product, respond the same product
//    public By productName1 = By.xpath("//div[@id ='rc_unique_0']//descendant::span[1]");
//    public By theSameBtn = By.xpath("//span[contains(text(),'By updating product cost and shipping information')]//parent::div");
//    public By titlePopup = By.xpath("//div[@id='rc_unique_0']/div/div[1]");
//    public By productCost = By.xpath("//form[1]//descendant::input[1]");
//    public By suggestSellingPrice = By.xpath("//form[1]//descendant::input[2]");
public By productNameRequest = By.xpath("//div[@class='MuiCardContent-root css-12evlce']/div[3]//descendant::span");
    public By respondBtn2 = By.xpath("//div[@id='rc_unique_0']//descendant::button[2]");
    public By sameProductMenu = By.xpath("//div[@role='tooltip']/div/div/div[1]/span");
    public By valueSameProduct = By.xpath("//div[@role='tooltip']/div/div/div[2]/span[2]");
    public By headerPopupTheSameProduct =By.xpath("//div[@class='ant-modal-header']/div/div/div[1]");
    public By checkboxLastDeal2 = By.xpath("//div[@class='ant-modal-header']/div/div/div[2]/label");
    public By textLastDeal =By.xpath("//div[@class='ant-modal-header']/div/div/div[2]/label/span[2]");
    public By respondBtn1 =By.xpath("//button[contains(text(),'Respond')]");
    public By productCost1 =By.xpath("//form[1]//descendant::input[1]");
    public By suggestSellingPrice1 = By.xpath("//form[1]//descendant::input[2]");
    //Variant
    public By sectionVariant = By.xpath("//form[2]");
    public By variant1 = By.xpath("//form[2]//descendant::tbody/tr[1]/td[2]/strong");
    public By productCostVariant1 =By.xpath("//form[2]//descendant::tbody/tr[1]/td[4]/descendant::input");
    public By suggestPriceVariant1 = By.xpath("//form[2]//descendant::tbody/tr[1]/td[5]/descendant::input");
    public By variant2 = By.xpath("//form[2]//descendant::tbody/tr[2]/td[2]/strong");
    public By productCostVariant2 =By.xpath("//form[2]//descendant::tbody/tr[2]/td[4]/descendant::input");
    public By suggestPriceVariant2 = By.xpath("//form[2]//descendant::tbody/tr[2]/td[5]/descendant::input");
    public By variant3 = By.xpath("//form[2]//descendant::tbody/tr[3]/td[2]/strong");
    public By productCostVariant3 =By.xpath("//form[2]//descendant::tbody/tr[3]/td[4]/descendant::input");
    public By suggestPriceVariant3 = By.xpath("//form[2]//descendant::tbody/tr[3]/td[5]/descendant::input");
    public By variant4 = By.xpath("//form[2]//descendant::tbody/tr[4]/td[2]/strong");
    public By productCostVariant4 =By.xpath("//form[2]//descendant::tbody/tr[4]/td[4]/descendant::input");
    public By suggestPriceVariant4 = By.xpath("//form[2]//descendant::tbody/tr[4]/td[5]/descendant::input");
    public By variant5 = By.xpath("//form[2]//descendant::tbody/tr[5]/td[2]/strong");
    public By productCostVariant5 =By.xpath("//form[2]//descendant::tbody/tr[5]/td[4]/descendant::input");
    public By suggestPriceVariant5 = By.xpath("//form[2]//descendant::tbody/tr[5]/td[5]/descendant::input");
    public By variant6 = By.xpath("//form[2]//descendant::tbody/tr[6]/td[2]/strong");
    public By productCostVariant6 =By.xpath("//form[2]//descendant::tbody/tr[6]/td[4]/descendant::input");
    public By suggestPriceVariant6 = By.xpath("//form[2]//descendant::tbody/tr[6]/td[5]/descendant::input");
    public By variant7 = By.xpath("//form[2]//descendant::tbody/tr[7]/td[2]/strong");
    public By productCostVariant7 =By.xpath("//form[2]//descendant::tbody/tr[7]/td[4]/descendant::input");
    public By suggestPriceVariant7 = By.xpath("//form[2]//descendant::tbody/tr[7]/td[5]/descendant::input");
    public By variant8 = By.xpath("//form[2]//descendant::tbody/tr[8]/td[2]/strong");
    public By productCostVariant8 =By.xpath("//form[2]//descendant::tbody/tr[8]/td[4]/descendant::input");
    public By suggestPriceVariant8 = By.xpath("//form[2]//descendant::tbody/tr[8]/td[5]/descendant::input");
    public By variant9 = By.xpath("//form[2]//descendant::tbody/tr[9]/td[2]/strong");
    public By productCostVariant9 =By.xpath("//form[2]//descendant::tbody/tr[9]/td[4]/descendant::input");
    public By suggestPriceVariant9 = By.xpath("//form[2]//descendant::tbody/tr[9]/td[5]/descendant::input");
    //shipping
    public By sectionShipping = By.xpath("//form[3]/div");
    public By firstItem = By.xpath("//form[3]//descendant::input[2]");
    public By addItem = By.xpath("//form[3]//descendant::input[3]");
//    public By textCloseRequest = By.xpath("//div[contains(text(),'This request was closed')]");
    //edit product seller
    public By EditProductSellerBtn = By.xpath("//div[@role='tooltip']/div/div/div[6]");
    public By valueAction = By.xpath("//div[@role='tooltip']/div/div/div[6]/span[2]");
    public By checkboxLastDeal3 = By.xpath("//form[1]//descendant::label[2]");
    public By respond2Btn = By.xpath("//form[1]//descendant::button[1]");







}
