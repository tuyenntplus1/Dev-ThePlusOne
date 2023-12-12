package fulfillPortal.page;

import org.openqa.selenium.By;

public class fulfillPortal_page {
    public By Fulfill= By.xpath("//h6[contains(text(),'Fulfill')]");
    public By productNav = By.xpath("//p[contains(text(),'Products')]//parent::div//parent::a");
    public By addProductBtn= By.xpath("//main/div/div/div/div[1]/div[2]/button");

    public By productName= By.xpath("//tbody/tr[1]/td[2]/div");
    public By editBtn= By.xpath("//div[@class='ant-modal-header']//descendant::button[1]");
    public By editSellpageTitle= By.xpath("//h1[contains(text(),'Edit product')]");
    public By mesSuccess = By.xpath("//span[contains(text(),'Update product success')]") ;
    public By requestManagementNav = By.xpath("//ul/li[3]/a[@href='/request/']");
    public By requestFulfillTab = By.xpath("//button[contains(text(),'Request fulfill')]");

}
