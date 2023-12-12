package sellerPortal.page;

import org.openqa.selenium.By;

public class sellpageRevenue_page {
    public By announcement = By.xpath("//section[@class='announcement']");
    public By logo = By.className("header-logo");
    public By sellpageTitle = By.xpath("//div[@class='product__title']");
    public By priceVariant = By.xpath("//span[@class='lbl-price']");
    public By fomo = By.xpath("//div[@class='product-form']/p[1]");
    public By countDownTimer = By.id("ubundle_discount_countdown");
    public By textCountDownTimer = By.xpath("//span[@id='ubundle_discount_countdown']/div/span");
    //    variants
    public By sectionVariants = By.className("product__varians");

    public By colorPurple = By.xpath("//div[@class='product__varians']//a[contains(text(),'Purple')]");
    public By colorGray = By.xpath("//div[@class='product__varians']//a[contains(text(),'Gray')]");
    public By colorBlue = By.xpath("//div[@class='product__varians']//a[contains(text(),'Blue')]");

    public By sizeS = By.xpath("//div[@class='product__varians']/div[2]//a[contains(text(),'S')]");
    public By sizeM = By.xpath("//div[@class='product__varians']/div[2]//a[contains(text(),'M')]//parent::div");
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
    //cart
    public By subtotalCart = By.xpath("//span[contains(text(),'Subtotal')]//parent::div/span[2]");
    public By valueQuantityDiscount = By.xpath("//span[contains(text(),'Quantity discount')]//parent::div/span[2]");
    public By shippingCart = By.xpath("//span[contains(text(),'Shipping')]//parent::div/span[2]");
    public By totalCart = By.xpath("//strong[contains(text(),'Total')]//parent::div/strong[2]");
    public By iconIncreaseCart = By.xpath("//div[@class='row mt-2']/div/div/div[3]");
    public By closeCartBtn = By.xpath("//button[@aria-label='Close']");
    public By sectionTemOfPolicy = By.xpath("//div[@class ='terms-of-policies']");


}
