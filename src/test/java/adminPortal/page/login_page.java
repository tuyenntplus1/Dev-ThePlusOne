package adminPortal.page;

import org.openqa.selenium.By;

public class login_page {
    public By userName = By.id("basic_username");
    public By passwordAdmin = By.id("basic_password");
    public By loginAdminBtn = By.xpath("//button[@type ='submit']");
    public By titleAdmin = By.xpath("//h1");
}
