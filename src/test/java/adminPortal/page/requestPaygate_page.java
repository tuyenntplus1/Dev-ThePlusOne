package adminPortal.page;

import org.openqa.selenium.By;

public class requestPaygate_page {
    public By requestPaygateNav = By.xpath("//a[contains(text(),'Request paygate')]//ancestor::li");
    public By Collapse = By.xpath("//aside/div[2]");
    public By line1 = By.xpath("//tbody/tr[2]");
    public By line2 = By.xpath("//tbody/tr[3]");
    public By actionIcon = By.xpath("//tbody/tr[2]/td[7]/div");
    public By paygateBtn = By.xpath("//li[contains(text(),'Paygate')]");
    public By RejectBtn = By.xpath("//li[contains(text(),'Reject')]");
    //Popup Reject config
    public By titlePopupReject = By.xpath("//div[@class='ant-modal-content']/div[1]/div");
    public By checkboxReason1 = By.xpath("//div[@id='options']/label/span");
    public By textReason1 = By.xpath("//div[@id='options']/label/span[2]");
    public By checkboxReason2 = By.xpath("//div[@id='options']/label[2]/span");
    public By textReason2 = By.xpath("//div[@id='options']/label[2]/span[2]");
    public By checkboxReason3 = By.xpath("//div[@id='options']/label[3]/span");
    public By textReason3 = By.xpath("//div[@id='options']/label[3]/span[2]");
    public By checkboxReason4 = By.xpath("//div[@id='options']/label[4]/span");
    public By textReason4 = By.xpath("//div[@id='options']/label[4]/span[2]");
    public By checkboxReason5 = By.xpath("//div[@id='options']/label[5]/span");
    public By textReason5 = By.xpath("//div[@id='options']/label[5]/span[2]");
    public By rejectRequestBtn = By.xpath("//span[contains(text(),'Reject request')]//parent::button");
    public By cancelBtn = By.xpath("//span[contains(text(),'Cancel')]//parent::button");
    public By messageNotify = By.xpath("//div[@class = 'ant-message']/div");
    public By actionPaypal = By.xpath("//tbody/tr[3]/td[7]/div");
    public By searchPaygate = By.xpath("//input[@placeholder ='Search paygate']");
    public By paygate01 = By.xpath("//input[@type ='checkbox']//parent::span");
    public By conectBtn = By.xpath("//span[contains(text(),'Connect')]//parent::button");
    public By confirmBtn = By.xpath("//span[contains(text(),'Confirm')]//parent::button");
    public By messageNotifyAccepted = By.xpath("//span[contains(text(),'Accepted')]");

}
