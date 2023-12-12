package sellerPortal.function;

import core.basePage;
import core.common_function;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.publicProduct_page;

public class productPubic_function extends basePage {
    public productPubic_function(WebDriver driver) {
        super(driver);
    }
    publicProduct_page publicProductPage =new publicProduct_page();
    common_function commonFunction =new common_function(driver);
    public void searchProduct(String key) throws InterruptedException {
        commonFunction.senKeys(publicProductPage.search,key);
    }
    public void hoverImage(){
//        Actions action = new Actions(driver);
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(publicProductPage.hoverImage));
//        action.moveToElement(element).perform();
        commonFunction.Hover(publicProductPage.hoverImage);
    }
    public void sellThisProduct() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", publicProductPage.sellThisProductBtn);
//        Thread.sleep(1000);
        commonFunction.click(publicProductPage.sellThisProductBtn);
    }
}
