package buyerCheckOut.page;

import org.openqa.selenium.By;

public class fulfill_page {
    public By userName = By.xpath("//input[@id='email']");
    public By password = By.xpath("//input[@id='auth-login-password']");
    public By loginBtn = By.xpath("//button[@type='submit']");

    public By orderListNav = By.xpath("//a[@href='/orders/']");
    public By orderNumber = By.xpath("//tbody[@class='MuiTableBody-root css-ceeiht']/tr/td[2]/a");
    //Order Detail
    public By statusOrder = By.xpath("//div[2]/div/div/span");
    public By productName = By.xpath("//span[@class='styles_nameVariant___8z1i']");
    public By variantColor = By.xpath("//div[2]/div[2]/span/div");
    public By variantSize = By.xpath("//div[@class='styles_productVariantItem__jkXlh' and contains(text(),'Size')]");
    public By productCost = By.xpath("//div[@class='styles_productTitle__eHkVL']");
    public By quantity = By.xpath("//div[@class='styles_productTitle__eHkVL']//following::div[1]");
    public By subtotal1= By.xpath("//div[@class='styles_productTitle__eHkVL']//following::div[2]");
    public By subtotal2 = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0']//div[@class='styles_productTotal__WEdyj']");
    public By shipping = By.xpath("//div[3]/div[2]/div[3]");
    public By total = By.xpath("//div[3]/div[3]/div/strong");
    public By customer = By.xpath("//main/div/div/div/div/div[2]/div/div/div/div/div/div[2]/div");
    public By customerEmail = By.xpath("//main/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div");
    //    public By customerPhoneNumber = By.xpath("");
    public By customerShippingAddress= By.xpath("//main/div/div/div/div/div[2]/div/div/div/div/div[3]/div[2]");
    public By customerBillingAddress = By.xpath("//main/div/div/div/div/div[2]/div/div/div/div/div[4]/div[2]");


}

