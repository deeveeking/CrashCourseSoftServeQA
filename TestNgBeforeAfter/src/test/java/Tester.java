import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Tester {


    static WebDriver WebDriver;
    static  String link = "https://rozetka.com.ua/";

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                {"IPhone SE"},
                {"Xiaomi"},
                {"Холодильник"},
        };
    }


    @BeforeMethod
    public void MoveOnRozetka(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\deevee\\Downloads\\chromedriver.exe");
        WebDriver = new ChromeDriver(options);
        WebDriver.manage().window().maximize();
        WebDriver.navigate().to(link);

    }

    @AfterMethod
    public void Close(){
        WebDriver.quit();
    }

    @Test(dataProvider = "test1")
    public void MoveTest(String Text){

        WebDriver.findElement(By.xpath("//div[@role='search']//input")).sendKeys(Text);
        WebDriver.findElement(By.xpath("//button[@class=\"button button_color_green button_size_medium search-form__submit\"]")).click();
        WebDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
