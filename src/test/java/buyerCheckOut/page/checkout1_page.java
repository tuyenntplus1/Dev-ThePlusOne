package buyerCheckOut.page;

import org.openqa.selenium.By;

public class checkout1_page {
    public By email = By.name("email");
    public By firstName = By.name("firstName");
    public By lastName = By.name("lastName");
    public By address = By.name("addressDetail");
    public By city = By.name("city");
    public By zipCode = By.name("zipCode");
    public By phoneNumber = By.name("phoneNumber");
    public By country = By.name("country");
    public By countryValue = By.id("mui-9-option-0");
    public By countryValuePaypalPro = By.id("mui-8-option-0");
    public By placeOrderBtn = By.xpath("//button[@type ='submit']");
    public By iframeStripe = By.xpath("//iframe[@title='Secure payment input frame']");
    public By cardNumber = By.id("Field-numberInput");
    public By cardCvv = By.id("Field-cvcInput");
    public By cardExpiration = By.id("Field-expiryInput");
    public By iframePaypal = By.id("braintree-hosted-field-number");
    public By cardNumberPaypal = By.id("credit-card-number");
    public By iframeCvv = By.id("braintree-hosted-field-cvv");
    public By cardCvvPaypal = By.id("cvv");
    public By iframeDate = By.id("braintree-hosted-field-expirationDate");
    public By cardExpirationPaypal = By.id("expiration");
    //order summary
    public By orderSummary = By.xpath("//div[contains(text(),'Order summary')]");
    public By titleProduct = By.xpath("//div[@class='MuiCollapse-wrapperInner MuiCollapse-vertical css-8atqhb']/div/div[2]/div");
    public By colorVariant = By.xpath("//div[@class='MuiCollapse-wrapperInner MuiCollapse-vertical css-8atqhb']/div/div[2]/div[2]/div/div");
    public By sizeVariant = By.xpath("//div[@class='MuiCollapse-wrapperInner MuiCollapse-vertical css-8atqhb']/div/div[2]/div[2]/div/div[2]");
    public By quantity = By.xpath("//div[@class='MuiCollapse-wrapperInner MuiCollapse-vertical css-8atqhb']/div/div[2]/div[2]/div[2]");
    public By subtotal = By.xpath("//div[@class='MuiCollapse-wrapperInner MuiCollapse-vertical css-8atqhb']/div/div[2]/div[3]");
    public By Subtotal = By.xpath("//div[contains(text(),'Subtotal')]//following::div[1]/span");
    public By Tip = By.xpath("//div[contains(text(),'Tip')]//following::div[1]/span");
    public By Shipping = By.xpath("//div[contains(text(),'Secured Shipping include Tracking Number')]//following::div[1]/span");
    public By Total = By.xpath("//div[contains(text(),'Total')]//following::div[1]/span");
    //Section Tip
    public By titleTip = By.xpath("//div[@class='mb-2']/div");
    public By noteTip = By.xpath("//div[@class='mb-2']/small");
    public By option1 = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[1]/span");
    public By option1Btn = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[1]");
    public By valueOption1 = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[1]/div");
    public By option2 = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[2]/span");
    public By option2Btn = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[2]");
    public By valueOption2 = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[2]/div");
    public By option3 = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[3]/span");
    public By option3Btn = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[3]");
    public By valueOption3 = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[3]/div");
    public By option4= By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[4]/span");
    public By option4Btn = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[4]");
    public By valueOption4 = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[4]/div");
    public By option5 = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[5]/span");
    public By option5Btn = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[5]");
    public By valueOption5= By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[5]/div");
    public By noTip = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[6]/span");
    public By noTipBtn = By.xpath("//div[@class='checkout_tipArticle__box__Owb7j']/div/div[1]/div[6]");
    public By customTip = By.xpath("//input[@placeholder ='Custom tip']");
    public By tipUsBtn = By.xpath("//span[contains(text(),'Tip us')]//parent::button");







}

