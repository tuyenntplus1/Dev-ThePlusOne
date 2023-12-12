package buyerCheckOut.page;

import org.openqa.selenium.By;

public class cart_page {
    public By cartTitle =By.xpath("//div[@class='ant-drawer-header']");
    public By processBtn = By.xpath("//span[contains(text(),'PROCEED TO SECURED CHECKOUT')]//parent::div");
}

