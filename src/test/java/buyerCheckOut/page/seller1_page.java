package buyerCheckOut.page;

import org.openqa.selenium.By;

public class seller1_page {
    public By email = By.id("email");
    public By password = By.id("password");
    public By loginBtn= By.xpath("//span[contains(text(),'Login')]");
    public By ordersNav= By.xpath("//span[contains(text(),'Orders')]//ancestor::div[1]");
    public By orderNav = By.xpath("//nav/div[1]/div[4]/div[1]");
    public By myOrdesNav= By.xpath("//span[contains(text(),'My orders')]//ancestor::div[3]/div[2]");
    public By collapseNav= By.xpath("//img[@class='ant-image-img sidebar_collapseIcon__9mnvD']");
    public By orderNumber = By.xpath("//form[@id='form-listOrder']//tbody/tr[2]/td[2]/span/a");
    public By myOrderNumber =By.xpath("//tbody/tr[2]/td[3]/span/a");
    //order detail
    public By statusOrder = By.xpath("//div[@class='d-flex']/div[1]");
    public By productName = By.xpath("//span[@class='styles_name__pglWw']");
    public By variantColor = By.xpath("//div[@class='styles_productName__aPgd5']//descendant::div[1]/div/div");
    public By variantSize = By.xpath("//div[@class='styles_productName__aPgd5']//descendant::div[1]/div/div[2]");
    public By priceVariant = By.xpath("//div[@class='styles_productPrice__HUKA6']");
    public By quantity = By.xpath("//div[@class='styles_productQuantity__QZ2XO']");
    public By subtotal1= By.xpath("//div[@class='css-g4hox8']//div[@class='styles_productTotal__WEdyj']");
    public By subtotal2 = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0']//div[@class='styles_productTotal__WEdyj']");
    public By tip = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0']/div/div[2]/div[2]");
    public By shipping = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0']/div/div[2]/div[2]");
    public By total = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0']/div/div[3]/strong");
    public By customerEmail = By.xpath("//div[2]/div/div/div/div[2]/div[2]");
    public By customerPhoneNumber = By.xpath("//div[contains(text(),'Phone')]//following::div[1]");
    public By customerShippingAddress= By.xpath("//div/div/div[4]/div[2]");
    public By customerBillingAddress = By.xpath("//div[5]/div[2]");

}
