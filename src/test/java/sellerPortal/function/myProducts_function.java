package sellerPortal.function;

import core.basePage;
import core.common_function;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.myProducts_page;

public class myProducts_function extends basePage {
    public myProducts_function(WebDriver driver) {
        super(driver);
    }
    myProducts_page myProductsPage =new myProducts_page();

    common_function commonFunction =new common_function(driver);
    public void clickAddProduct(){
        commonFunction.click(myProductsPage.addProductBtn);
    }
    public void createTitleProduct(){
        commonFunction.senKeys(myProductsPage.titleProduct,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        Assert.assertEquals("Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional",commonFunction.getValue(myProductsPage.titleProduct));
    }
    public void createDescription() throws InterruptedException {
        commonFunction.switchIframe(myProductsPage.iframeDescription);
        commonFunction.senKeys(myProductsPage.description,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR\n"+
                "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        String description = "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR\n" +
                "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional";
        commonFunction.verifyElement(myProductsPage.description,description);

    }
    public void createSpecification() throws InterruptedException {
        commonFunction.switchIframe(myProductsPage.iframeSpecification);
        commonFunction.senKeys(myProductsPage.specification,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR\n"+
                "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        String specification = "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR\n" +
                "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional";
        commonFunction.verifyElement(myProductsPage.specification,specification);
    }
    public void addImage() throws InterruptedException {
//        commonFunction.click(myProductsPage.addImageProduct);
        commonFunction.uploadFile(myProductsPage.addImageProduct,"D:\\AION\\ảnh test\\áo\\áo tím.webp");
//        commonFunction.click(myProductsPage.addImageProduct);
        commonFunction.uploadFile(myProductsPage.addImageProduct,"D:\\Aion\\ảnh test\\áo\\áo xám.webp");
//        commonFunction.click(myProductsPage.addImageProduct);
        commonFunction.uploadFile(myProductsPage.addImageProduct,"D:\\Aion\\ảnh test\\áo\\áo xanh.webp");

    }
    public void addProductCost(){
        commonFunction.senKeys(myProductsPage.productCost,"5.33");
        Assert.assertEquals("5.33",commonFunction.getValue(myProductsPage.productCost));
        Assert.assertEquals("15.99",commonFunction.getValue(myProductsPage.suggestPrice));
    }
    public void addOption(){
        commonFunction.click(myProductsPage.addAnotherOption);
        commonFunction.senKeys(myProductsPage.optionName1,"Color");
        commonFunction.senKeys(myProductsPage.value1Option1,"Purple");
        commonFunction.senKeys(myProductsPage.value2Option1,"Gray");
        commonFunction.senKeys(myProductsPage.value3Option1,"Blue");
        commonFunction.click(myProductsPage.addAnotherOption2);
        commonFunction.senKeys(myProductsPage.optionName2,"Size");
        commonFunction.senKeys(myProductsPage.value1Option2,"S");
        commonFunction.senKeys(myProductsPage.value2Option2,"M");
        commonFunction.senKeys(myProductsPage.value3Option2,"L");
    }
    public void verifyVariants() throws InterruptedException {
        commonFunction.verifyElement(myProductsPage.variant1,"Purple / S");
        commonFunction.click(myProductsPage.imageVariant1);
        commonFunction.scroll(myProductsPage.confirmBtn);
        commonFunction.click(myProductsPage.confirmBtn);
        commonFunction.senKeyPrice(myProductsPage.productCostVariant1,"5.33");
        commonFunction.senKeyPrice(myProductsPage.suggetPriceVariant1,"15.99");
        commonFunction.senKeys(myProductsPage.skuVariant1,"Test12345");

        //apply to all
        commonFunction.click(myProductsPage.applyToAllImageV1);
        commonFunction.click(myProductsPage.confirmApplyToAll);
        commonFunction.click(myProductsPage.applyToAllProductCostV1);
        commonFunction.click(myProductsPage.confirmApplyToAll2);
        commonFunction.click(myProductsPage.applyToAllSuggestPriceV1);
        commonFunction.click(myProductsPage.confirmApplyToAll3);
        commonFunction.click(myProductsPage.applyToAllSkuV1);
        commonFunction.click(myProductsPage.confirmApplyToAll4);
    }
    public void addShippingInformation() throws InterruptedException {
        commonFunction.scroll(myProductsPage.shippingInformation);
        commonFunction.click(myProductsPage.addMoreBtn);
        commonFunction.click(myProductsPage.region);
        commonFunction.click(myProductsPage.UnitedStates);
        commonFunction.click(myProductsPage.Vietnam);
        commonFunction.senKeyPrice(myProductsPage.firstItem,"4.99");
        Assert.assertEquals("4.99",commonFunction.getValue(myProductsPage.additionalItem));
        commonFunction.senKeyPrice(myProductsPage.additionalItem,"3.99");
//        commonFunction.click(myProductsPage.addMoreBtn);
//        commonFunction.click(myProductsPage.region2);
//        commonFunction.click(myProductsPage.Australia);
//        commonFunction.click(myProductsPage.Japan);
//        commonFunction.senKeyPrice(myProductsPage.firstItem2,"5.99");
//        Assert.assertEquals("5.99",commonFunction.getValue(myProductsPage.additionalItem2));
//        commonFunction.senKeyPrice(myProductsPage.additionalItem2,"4.5");
    }
    public void policyProduct(){
        commonFunction.switchIframe(myProductsPage.iframeAboutProduct);
        commonFunction.senKeys(myProductsPage.descriptionPolicy,"About This Product");
        driver.switchTo().defaultContent();
        commonFunction.click(myProductsPage.return_refundBtn);
        commonFunction.switchIframe(myProductsPage.iframeAboutProduct);
        commonFunction.senKeys(myProductsPage.descriptionPolicy,"return and refund product");
    }
    public void save(){
        driver.switchTo().defaultContent();
        commonFunction.click(myProductsPage.saveBtn);
        commonFunction.verifyPage(myProductsPage.myProducts);

    }
    public void saveAndRequest(){
        driver.switchTo().defaultContent();
        commonFunction.click(myProductsPage.saveAndRequestBtn);

        commonFunction.click(myProductsPage.requestSourcingBtn);
        commonFunction.verifyPage(myProductsPage.requestSourcingPage);
    }
    public void verifyMes(){
        commonFunction.click(myProductsPage.saveBtn);
        commonFunction.verifyPage(myProductsPage.mesError);
    }
    public void viewEditProduct(){
        commonFunction.click(myProductsPage.productName);
        commonFunction.click(myProductsPage.editBtn);
        commonFunction.verifyPage(myProductsPage.editSellpageTitle);
    }
    public void editTitleProduct(){
        commonFunction.senKeyPrice(myProductsPage.titleProduct,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        String titleProduct = "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional";
        Assert.assertEquals(titleProduct,commonFunction.getValue(myProductsPage.titleProduct));
    }
    public void editDescriptionProduct(){
        commonFunction.switchIframe(myProductsPage.iframeDescription);
        commonFunction.senKeyPrice(myProductsPage.description,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR");
        String description = "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR";
        commonFunction.verifyElement(myProductsPage.description,description);
//        Assert.assertEquals(description,commonFunction.getValue(myProductsPage.description));
    }
    public void editSpecificationProduct() {
        commonFunction.switchIframe(myProductsPage.iframeSpecification);
        commonFunction.senKeys(myProductsPage.specification,
                "Material: NYLON\n" +
                        "Material: spandex\n" +
                        "Feature: Anti-Wrinkle\n" +
                        "Feature: Anti-Pilling\n" +
                        "Feature: Waterproof\n" +
                        "Feature: Quick Dry\n" +
                        "Feature: Windproof\n" +
                        "Collar: MANDARIN COLLAR");
        String specification =
                "Material: NYLON\n" +
                        "Material: spandex\n" +
                        "Feature: Anti-Wrinkle\n" +
                        "Feature: Anti-Pilling\n" +
                        "Feature: Waterproof\n" +
                        "Feature: Quick Dry\n" +
                        "Feature: Windproof\n" +
                        "Collar: MANDARIN COLLAR" ;
        commonFunction.verifyElement(myProductsPage.specification,specification);
    }
    public void editImage() throws InterruptedException {
        commonFunction.uploadFile(myProductsPage.addImageProduct,"D:\\Aion\\ảnh test\\set quan áo.jpg");
        commonFunction.verifyPage(myProductsPage.image4);
        commonFunction.Hover(myProductsPage.image4);
        commonFunction.click(myProductsPage.iconDelete);
//        commonFunction.isElementDisplayed(myProductsPage.image4);
        commonFunction.uploadFile(myProductsPage.addImageProduct,"D:\\Aion\\ảnh test\\áo.jpg");
    }
    public void editPricing(){
        commonFunction.senKeyPrice(myProductsPage.productCost,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(myProductsPage.productCost));
        Assert.assertEquals("18.99",commonFunction.getValue(myProductsPage.suggestPrice));
        commonFunction.senKeyPrice(myProductsPage.suggestPrice,"20");
        Assert.assertEquals("20",commonFunction.getValue(myProductsPage.suggestPrice));

    }
    public void editVariants() throws InterruptedException {
        //variants1
        commonFunction.verifyElement(myProductsPage.variant1,"Purple / S");
        commonFunction.senKeyPrice(myProductsPage.productCostVariant1,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(myProductsPage.productCostVariant1));
        commonFunction.senKeyPrice(myProductsPage.suggetPriceVariant1,"18.99");
        Assert.assertEquals("18.99",commonFunction.getValue(myProductsPage.suggetPriceVariant1));
        //variants2
        commonFunction.verifyElement(myProductsPage.variant2,"Purple / M");
        commonFunction.senKeyPrice(myProductsPage.productCostVariant2,"7.33");
        Assert.assertEquals("7.33",commonFunction.getValue(myProductsPage.productCostVariant2));
        commonFunction.senKeyPrice(myProductsPage.suggetPriceVariant2,"21.99");
        Assert.assertEquals("21.99",commonFunction.getValue(myProductsPage.suggetPriceVariant2));
        Assert.assertEquals("Test12345",commonFunction.getValue(myProductsPage.skuVariant2));
        //variant3
        commonFunction.verifyElement(myProductsPage.variant3,"Purple / L");
        commonFunction.senKeyPrice(myProductsPage.productCostVariant3,"8.33");
        Assert.assertEquals("8.33",commonFunction.getValue(myProductsPage.productCostVariant3));
        commonFunction.senKeyPrice(myProductsPage.suggetPriceVariant3,"24.99");
        Assert.assertEquals("24.99",commonFunction.getValue(myProductsPage.suggetPriceVariant3));
        Assert.assertEquals("Test12345",commonFunction.getValue(myProductsPage.skuVariant3));
        //variant4
        commonFunction.verifyElement(myProductsPage.variant4,"Gray / S");
        commonFunction.click(myProductsPage.imageVariant4);
        commonFunction.click(myProductsPage.imageGray);
        commonFunction.scroll(myProductsPage.confirmBtn);
        commonFunction.click(myProductsPage.confirmBtn);
        commonFunction.senKeyPrice(myProductsPage.productCostVariant4,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(myProductsPage.productCostVariant4));
        commonFunction.senKeyPrice(myProductsPage.suggetPriceVariant4,"18.99");
        Assert.assertEquals("18.99",commonFunction.getValue(myProductsPage.suggetPriceVariant4));
        Assert.assertEquals("Test12345",commonFunction.getValue(myProductsPage.skuVariant4));
        //variant5
        commonFunction.verifyElement(myProductsPage.variant5,"Gray / M");
        commonFunction.click(myProductsPage.imageVariant5);
//        commonFunction.click(myProductsPage.imageGray);
        commonFunction.click(myProductsPage.confirmBtn);
        commonFunction.senKeyPrice(myProductsPage.productCostVariant5,"7.33");
        Assert.assertEquals("7.33",commonFunction.getValue(myProductsPage.productCostVariant5));
        commonFunction.senKeyPrice(myProductsPage.suggetPriceVariant5,"21.99");
        Assert.assertEquals("21.99",commonFunction.getValue(myProductsPage.suggetPriceVariant5));
        Assert.assertEquals("Test12345",commonFunction.getValue(myProductsPage.skuVariant5));
        //variant6
        commonFunction.verifyElement(myProductsPage.variant6,"Gray / L");
        commonFunction.click(myProductsPage.imageVariant6);
//        commonFunction.click(myProductsPage.imageGray);
        commonFunction.scroll(myProductsPage.confirmBtn);
        commonFunction.click(myProductsPage.confirmBtn);
        commonFunction.senKeyPrice(myProductsPage.productCostVariant6,"8.33");
        Assert.assertEquals("8.33",commonFunction.getValue(myProductsPage.productCostVariant6));
        commonFunction.senKeyPrice(myProductsPage.suggetPriceVariant6,"24.99");
        Assert.assertEquals("24.99",commonFunction.getValue(myProductsPage.suggetPriceVariant6));
        Assert.assertEquals("Test12345",commonFunction.getValue(myProductsPage.skuVariant6));
        //variant7
        commonFunction.verifyElement(myProductsPage.variant7,"Blue / S");
        commonFunction.click(myProductsPage.imageVariant7);
        commonFunction.click(myProductsPage.imageBlue);
        commonFunction.scroll(myProductsPage.confirmBtn);
        commonFunction.click(myProductsPage.confirmBtn);
        commonFunction.senKeyPrice(myProductsPage.productCostVariant7,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(myProductsPage.productCostVariant7));
        commonFunction.senKeyPrice(myProductsPage.suggetPriceVariant7,"18.99");
        Assert.assertEquals("18.99",commonFunction.getValue(myProductsPage.suggetPriceVariant7));
        Assert.assertEquals("Test12345",commonFunction.getValue(myProductsPage.skuVariant7));
        //variant8
        commonFunction.verifyElement(myProductsPage.variant8,"Blue / M");
        commonFunction.click(myProductsPage.imageVariant8);
//        commonFunction.click(myProductsPage.imageBlue);
        commonFunction.click(myProductsPage.confirmBtn);
        commonFunction.senKeyPrice(myProductsPage.productCostVariant8,"7.33");
        Assert.assertEquals("7.33",commonFunction.getValue(myProductsPage.productCostVariant8));
        commonFunction.senKeyPrice(myProductsPage.suggetPriceVariant8,"21.99");
        Assert.assertEquals("21.99",commonFunction.getValue(myProductsPage.suggetPriceVariant8));
        Assert.assertEquals("Test12345",commonFunction.getValue(myProductsPage.skuVariant8));
        //variant9
        commonFunction.verifyElement(myProductsPage.variant9,"Blue / L");
        commonFunction.click(myProductsPage.imageVariant9);
//        commonFunction.click(myProductsPage.imageBlue);
        commonFunction.scroll(myProductsPage.confirmBtn);
        commonFunction.click(myProductsPage.confirmBtn);
        commonFunction.senKeyPrice(myProductsPage.productCostVariant9,"8.33");
        Assert.assertEquals("8.33",commonFunction.getValue(myProductsPage.productCostVariant9));
        commonFunction.senKeyPrice(myProductsPage.suggetPriceVariant9,"24.99");
        Assert.assertEquals("24.99",commonFunction.getValue(myProductsPage.suggetPriceVariant9));
        Assert.assertEquals("Test12345",commonFunction.getValue(myProductsPage.skuVariant9));

    }
    public void editShippingInfomation() throws InterruptedException {
        commonFunction.senKeyPrice(myProductsPage.firstItem,"5.99");
        Assert.assertEquals("5.99",commonFunction.getValue(myProductsPage.additionalItem));
        commonFunction.senKeyPrice(myProductsPage.additionalItem,"4.99");
        commonFunction.click(myProductsPage.addMoreBtn);
        commonFunction.click(myProductsPage.region2);
        commonFunction.click(myProductsPage.Australia);
        commonFunction.click(myProductsPage.Japan);
        commonFunction.senKeyPrice(myProductsPage.firstItem2,"5.99");
        Assert.assertEquals("5.99",commonFunction.getValue(myProductsPage.additionalItem2));
        commonFunction.senKeyPrice(myProductsPage.additionalItem2,"4.5");
        Assert.assertEquals("4.5",commonFunction.getValue(myProductsPage.additionalItem2));

    }
    public void editPolicy(){
        commonFunction.switchIframe(myProductsPage.iframeAboutProduct);
        commonFunction.senKeyPrice(myProductsPage.descriptionPolicy,"About This Product Update");
        String s1="About This Product Update";
        commonFunction.verifyElement(myProductsPage.descriptionPolicy,s1);
        driver.switchTo().defaultContent();
        commonFunction.click(myProductsPage.return_refundBtn);
        commonFunction.switchIframe(myProductsPage.iframeAboutProduct);
        commonFunction.senKeyPrice(myProductsPage.descriptionPolicy,"Return and refund product Update");
        String s2 ="Return and refund product Update";
        commonFunction.verifyElement(myProductsPage.descriptionPolicy,s2);
    }
    public void saveEditProduct(){
        driver.switchTo().defaultContent();
        commonFunction.click(myProductsPage.saveBtn);
        commonFunction.verifyElement(myProductsPage.mesSuccess,"Update product success");
    }
    public void requestSourcing() throws InterruptedException {
        commonFunction.Hover(myProductsPage.product1);
        commonFunction.click(myProductsPage.action);
        commonFunction.click(myProductsPage.requestSourcing);
        commonFunction.verifyElement(myProductsPage.confirmPopup,"Confirm");
        commonFunction.click(myProductsPage.requestSourcingBtnConfirm);
        Thread.sleep(5000);
        System.out.println(commonFunction.getText(myProductsPage.requestStatus));
        commonFunction.verifyElement(myProductsPage.requestStatus,"Requesting");
        commonFunction.Hover(myProductsPage.action);
        System.out.println(commonFunction.getText(myProductsPage.sellThisProductBtn));
        commonFunction.verifyElement(myProductsPage.sellThisProductBtn,"Sell this product");
    }
    public void viewProductDetail(){
        commonFunction.click(myProductsPage.myProduct1);
        commonFunction.click(myProductsPage.sellThisProductBtn2);
    }
    public void viewPrivateProduct(){
        commonFunction.click(myProductsPage.privateProductBtn);
    }
}
