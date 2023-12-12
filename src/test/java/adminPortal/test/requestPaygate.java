package adminPortal.test;

import adminPortal.function.login_function;
import adminPortal.function.requestPaygate_function;
import core.baseTest.admin;
import org.testng.annotations.Test;

public class requestPaygate extends admin {

    @Test(priority= 1 )
    public void rejectRequest(){
        requestPaygate_function requestPaygateFunction = new requestPaygate_function(driver);
        login_function loginFunction = new login_function(driver);
        loginFunction.loginAdmin();
        requestPaygateFunction.rejectRequest();
    }
    @Test(priority= 2 )
    public void configPaygate() throws InterruptedException {
        requestPaygate_function requestPaygateFunction = new requestPaygate_function(driver);
        login_function loginFunction = new login_function(driver);
        loginFunction.loginAdmin();
        requestPaygateFunction.configPaygate();

    }
}
