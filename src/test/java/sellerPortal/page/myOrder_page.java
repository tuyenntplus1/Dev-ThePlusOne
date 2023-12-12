package sellerPortal.page;

import org.openqa.selenium.By;

public class myOrder_page {
    public By checkboxMyOrder1 = By.xpath("//tbody/tr[2]/td[1]//input//parent::span");
    public By requestFulfillBtn = By.xpath("//span[contains(text(),' Request fulfill (1)')]//ancestor::button");
    public By confirmPopupHeaderRequest = By.xpath("//div[contains(text(),'Confirm request fulfill')]");
    public By body1PopupConfirmRequest = By.xpath("//h6");
    public By body2ProductRequest = By.xpath("//div[@class='ant-modal-body']/div/div[1]/strong");
    public By confirmBtn = By.xpath("//span[contains(text(),'Confirm')]//parent::button");
    public By status = By.xpath("//div[@role ='status']");
}
