package core.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class fulfill {
    public WebDriver driver;
    @BeforeMethod
    public void setup(){
//        driver =new FirefoxDriver();
        driver =new ChromeDriver();
//        String source = "D:\\google\\chromedriver-win64\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",source);
//        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        String url ="https://fulfillment.devzone.ehighway.co/pages/login/";
        String url ="https://fulfillment.staging.ehighway.co/pages/login/";
        driver.get(url);
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
