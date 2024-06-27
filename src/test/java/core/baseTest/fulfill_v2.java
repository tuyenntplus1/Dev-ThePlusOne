package core.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class fulfill_v2 {
    public WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        String url ="https://fulfillment-v2.devzone.theplus1.net";
        driver.get(url);
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
