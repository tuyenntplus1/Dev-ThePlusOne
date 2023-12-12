package core.baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class seller {
    public WebDriver driver;
    @BeforeMethod
    public void setup(){
//        ChromeDriverService service = new ChromeDriverService.Builder()
//                .build();
//        driver = new ChromeDriver(service);
//        driver =new FirefoxDriver();
        driver = new ChromeDriver();
//        String source = "D:\\google\\chromedriver-win64\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",source);
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        String url ="https://seller.devzone.ehighway.co/login";
        String url ="https://seller.staging.ehighway.co/login";
        driver.get(url);
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
