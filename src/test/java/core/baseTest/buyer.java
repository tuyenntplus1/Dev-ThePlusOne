package core.baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class buyer {
    public WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
//        driver =new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        String url = "https://teststaging1904.devshop.ehighway.co/";
        String url = "https://testrequestfulfilloldvendor0112.cozypro.mom/";
        driver.get(url);
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
