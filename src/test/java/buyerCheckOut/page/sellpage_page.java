package buyerCheckOut.page;

import org.openqa.selenium.By;

public class sellpage_page {
    public By announcement = By.className("announcement");
    public By logo = By.className("header-logo");
    public By sellpageTitle = By.xpath("//div[@class='product__title']");
    public By priceVariant = By.xpath("//span[@class='lbl-price']");
    public By fomo = By.xpath("//div[@class='product-form']/p[1]");
    public By countDownTimer = By.id("ubundle_discount_countdown");
    //    variants
    public By sectionVariants = By.className("product__varians");
    public By colorBlack = By.xpath("//div[@class='product__varians']//a[contains(text(),'Black')]");
    public By colorPink = By.xpath("//div[@class='product__varians']//a[contains(text(),'Pink')]");
    public By colorBlue = By.xpath("//div[@class='product__varians']//a[contains(text(),'Blue')]");
    public By sizeS = By.xpath("//div[@class='product__varians']/div[2]//a[contains(text(),'S')]");
    public By sizeM = By.xpath("//div[@class='product__varians']/div[2]//a[contains(text(),'M')]");
    public By sizeL = By.xpath("//div[@class='product__varians']/div[2]//a[contains(text(),'L')]");
    //Quantity
    public By quantity = By.id("Quantity");
    public By iconIncrease = By.xpath("//div[@class='product-form']/div[5]/div/div/div/div/p[3]");
    public By iconDecrease = By.xpath("//div[@class='product-form']/div[5]/div/div/div/div/p[1]");
    public By addToCartBtn = By.xpath("//span[contains(text(),'Add to cart')]//parent::button");
    public By byItNowBtn = By.xpath("//button[@onclick ='buyNow()']");
    public By paypalBtn = By.id("paypal-button-container");
    public By description = By.xpath("//div[@class='wrapper']/div/div[2]");
    public By specification = By.xpath("//div[@class='wrapper']/div/div[3]");


}

