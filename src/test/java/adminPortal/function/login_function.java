package adminPortal.function;

import adminPortal.page.login_page;
import core.basePage;
import core.common_function;
import org.openqa.selenium.WebDriver;

public class login_function extends basePage {

    public login_function(WebDriver driver) {
        super(driver);
    }
    common_function commonFunction = new common_function(driver);
    login_page loginPage = new login_page();
    public void loginAdmin(){
        commonFunction.senKeys(loginPage.userName,"vendor_admin");
        commonFunction.senKeys(loginPage.passwordAdmin,"vendor_admin@123");
        commonFunction.click(loginPage.loginAdminBtn);
        commonFunction.verifyElement(loginPage.titleAdmin,"eHighWay Admin");
    }
}
