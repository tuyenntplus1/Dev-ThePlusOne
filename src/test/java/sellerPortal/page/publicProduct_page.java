package sellerPortal.page;

import org.openqa.selenium.By;

public class publicProduct_page {
    public By search  = By.xpath("//input[@placeholder='Search product name, creator']");

    //    public By hoverImage =By.xpath("//div[@class='product_product__card__image__bfHia']");
    public By hoverImage =By.xpath("//div[@class='product_product__card__image__bfHia product_product__card__image__sizeNormal__B18su']");

    public By sellThisProductBtn = By.xpath("//button[contains(text(),'Sell this product')]");

}
