package fulfillPortal.page;

import org.openqa.selenium.By;

public class addProduct_page {
    public By addProductText = By.xpath("//h1[contains(text(),'Add Product')]");
    public By sectionTitle = By.xpath("//form[1]");
    public By titleProduct = By.xpath("//input[@placeholder='Short sleeve t-shirt']");

    public By iframeDescription = By.xpath("//form[1]//div[2]//descendant::iframe");
    public By description = By.xpath("//body[@id='tinymce']");

    public By iframeSpecification = By.xpath("//form[2]//div[2]//descendant::iframe");
    public By specification = By.xpath("//body[@id='tinymce']");

    public By addImageProduct = By.xpath("//form[3]/div[1]/span/div[1]");
    public By media = By.xpath("form[3]");

    public By productCost = By.xpath("//form[4]/div/div[1]//descendant::input");
    public By suggestPrice = By.xpath("//form[4]/div/div[2]//descendant::input");

    public By addAnotherOption = By.xpath("//form[5]//div[contains(text(),'Add another option')]");
    public By optionName1= By.xpath("//form[5]//descendant::input[1]");
    public By value1Option1 = By.xpath("//form[5]//descendant::input[2]");
    public By value2Option1 = By.xpath("//form[5]//descendant::input[3]");
    public By value3Option1 = By.xpath("//form[5]//descendant::input[4]");

    //    public By addAnotherOption2 = By.xpath("//div[@id='options_id']/div/div/div[2]/div/div/div/div[2]");
    public By optionName2 = By.xpath("//form[5]/div[3]//descendant::input[1]");
    public By value1Option2 = By.xpath("//form[5]/div[3]//descendant::input[2]");
    public By value2Option2 = By.xpath("//form[5]/div[3]//descendant::input[3]");
    public By value3Option2 = By.xpath("//form[5]/div[3]//descendant::input[4]");
    public By sectionVariant = By.xpath("//form[6]");

    public By variant1= By.xpath("//form[6]//tbody/tr[1]/td[2]/strong");
    public By imageVariant1 = By.xpath("//form[6]//tbody/tr[1]/td[3]/div");
    public By image1 = By.xpath("//div[contains(text(),'Gallery')]//ancestor::div[4]/div[2]//descendant::img");
    public By applyToAllImageV1 = By.xpath("//form[6]//tbody/tr[2]/td[3]/div[2]");
    public By confirmApplyToAll =By.xpath("//span[contains(text(),'OK')]");
    public By productCostVariant1 = By.xpath("//form[6]//tbody/tr[1]/td[4]//descendant::input");
    public By applyToAllProductCostV1 = By.xpath("//form[6]//tbody/tr[2]/td[4]/div[2]");
    public By confirmApplyToAll2 = By.xpath("//div[7]/div/div/div/div[2]/div/div[2]/button[2]/span");
    public By suggetPriceVariant1= By.xpath("//form[6]//tbody/tr[1]/td[5]//descendant::input");

    public By applyToAllSuggestPriceV1 = By.xpath("//form[6]//tbody/tr[2]/td[5]/div[2]");

    public By confirmApplyToAll3 = By.xpath("//div[8]/div/div/div/div[2]/div/div[2]/button[2]/span");
    public By skuVariant1 = By.xpath("//form[6]//tbody/tr[1]/td[6]//descendant::input");
    public By applyToAllSkuV1 = By.xpath("//form[6]//tbody/tr[2]/td[6]/div");
    public By confirmApplyToAll4 = By.xpath("//div[9]/div/div/div/div[2]/div/div[2]/button[2]/span");
    //variant 2
    public By variant2= By.xpath("//form[6]//tbody/tr[2]/td[2]/strong");
    public By imageVariant2 = By.xpath("//form[6]//tbody/tr[2]/td[3]/div");
    public By productCostVariant2 = By.xpath("//form[6]//tbody/tr[2]/td[4]//descendant::input");
    public By suggetPriceVariant2= By.xpath("//form[6]//tbody/tr[2]/td[5]//descendant::input");
    public By skuVariant2 = By.xpath("//form[6]//tbody/tr[2]/td[6]//descendant::input");
    //variant3
    public By variant3= By.xpath("//form[6]//tbody/tr[3]/td[2]/strong");
    public By imageVariant3 = By.xpath("//form[6]//tbody/tr[3]/td[3]/div");
    public By productCostVariant3 = By.xpath("//form[6]//tbody/tr[3]/td[4]//descendant::input");
    public By suggetPriceVariant3= By.xpath("//form[6]//tbody/tr[3]/td[5]//descendant::input");
    public By skuVariant3 = By.xpath("//form[6]//tbody/tr[3]/td[6]//descendant::input");
    //variant4
    public By variant4= By.xpath("//form[6]//tbody/tr[4]/td[2]/strong");
    public By imageVariant4 = By.xpath("//form[6]//tbody/tr[4]/td[3]/div");
    public By imageGray= By.xpath("//div[contains(text(),'Gallery')]//ancestor::div[4]/div[2]//descendant::img[2]");
    public By productCostVariant4 = By.xpath("//form[6]//tbody/tr[4]/td[4]//descendant::input");
    public By suggetPriceVariant4= By.xpath("//form[6]//tbody/tr[4]/td[5]//descendant::input");
    public By skuVariant4 = By.xpath("//form[6]//tbody/tr[4]/td[6]//descendant::input");
    //variants5
    public By variant5= By.xpath("//form[6]//tbody/tr[5]/td[2]/strong");
    public By imageVariant5 = By.xpath("//form[6]//tbody/tr[5]/td[3]/div");
    public By productCostVariant5 = By.xpath("//form[6]//tbody/tr[5]/td[4]//descendant::input");
    public By suggetPriceVariant5= By.xpath("//form[6]//tbody/tr[5]/td[5]//descendant::input");
    public By skuVariant5 = By.xpath("//form[6]//tbody/tr[5]/td[6]//descendant::input");
    //variant6
    public By variant6= By.xpath("//form[6]//tbody/tr[6]/td[2]/strong");
    public By imageVariant6 = By.xpath("//form[6]//tbody/tr[6]/td[3]/div");
    public By productCostVariant6 = By.xpath("//form[6]//tbody/tr[6]/td[4]//descendant::input");
    public By suggetPriceVariant6= By.xpath("//form[6]//tbody/tr[6]/td[5]//descendant::input");
    public By skuVariant6 = By.xpath("//form[6]//tbody/tr[6]/td[6]//descendant::input");
    //variant8
    public By variant8= By.xpath("//form[6]//tbody/tr[8]/td[2]/strong");
    public By imageVariant8 = By.xpath("//form[6]//tbody/tr[8]/td[3]/div");
    public By imageBlue= By.xpath("//div[contains(text(),'Gallery')]//ancestor::div[4]/div[2]//descendant::img[3]");
    public By productCostVariant8 = By.xpath("//form[6]//tbody/tr[8]/td[4]//descendant::input");
    public By suggetPriceVariant8= By.xpath("//form[6]//tbody/tr[8]/td[5]//descendant::input");
    public By skuVariant8 = By.xpath("//form[6]//tbody/tr[8]/td[6]//descendant::input");
    //variant7
    public By variant7= By.xpath("//form[6]//tbody/tr[7]/td[2]/strong");
    public By imageVariant7 = By.xpath("//form[6]//tbody/tr[7]/td[3]/div");
    public By productCostVariant7 = By.xpath("//form[6]//tbody/tr[7]/td[4]//descendant::input");
    public By suggetPriceVariant7= By.xpath("//form[6]//tbody/tr[7]/td[5]//descendant::input");
    public By skuVariant7 = By.xpath("//form[6]//tbody/tr[7]/td[6]//descendant::input");
    //variant9
    public By variant9= By.xpath("//form[6]//tbody/tr[9]/td[2]/strong");
    public By imageVariant9 = By.xpath("//form[6]//tbody/tr[9]/td[3]/div");
    public By productCostVariant9 = By.xpath("//form[6]//tbody/tr[9]/td[4]//descendant::input");
    public By suggetPriceVariant9= By.xpath("//form[6]//tbody/tr[9]/td[5]//descendant::input");
    public By skuVariant9 = By.xpath("//form[6]//tbody/tr[9]/td[6]//descendant::input");
    // Shipping infomation
    public By shippingInformation = By.xpath("//form[7]");
    public By addMoreBtn= By.xpath("//form[7]//strong[contains(text(),'Add more')]");
    public By region = By.xpath("//form[7]//descendant::div[@class='ant-select-selector']/div");
    //body/div[10]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]
    public By UnitedStates = By.xpath("//body//descendant::li[@title='United States']");
    public By Vietnam = By.xpath("//body//descendant::li[@title='Vietnam']");
    public By firstItem = By.xpath("//form[7]//descendant::input[2]");
    public By additionalItem = By.xpath("//form[7]//descendant::input[3]");
    public By region2= By.xpath("//form[7]/div[4]/div/div");
    public By Australia = By.xpath("//body//descendant::li[@title='Australia']");
    public By Japan = By.xpath("//body//descendant::li[@title='Japan']");
    public By firstItem2 = By.xpath("//form[7]//descendant::input[2][@value ='0']");
    public By additionalItem2 = By.xpath("//form[8]//preceding::input[1]");
    //Policy product
    public By return_refundBtn = By.xpath("//form[8]//descendant::button[contains(text(),'Refund and return')]");
    public By iframeAboutProduct= By.xpath("//form[8]//descendant::iframe");
    public By descriptionPolicy = By.xpath("//body[@id='tinymce']");

    //Save
    public By saveBtn = By.xpath("//footer//preceding::button[1]");
}
