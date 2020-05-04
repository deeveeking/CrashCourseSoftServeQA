import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tester {


    static WebDriver driver;
    public String link = "https://rozetka.com.ua";
    private String element =("//ul/li/span[@class=\"header-topline__language-item_state_active\"]");

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][]{
                {"RU", "Найти"},
                {"UA", "Знайти"},
        };
    }

    @Test(dataProvider = "test1")
    public void verifyData1(String Domen, String Text) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\deevee\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to(link);
        String ActivatedLanguage = driver.findElement(By.xpath(element)).getText();

        if (!ActivatedLanguage.equals(Domen))
        {
            driver.findElement(By.xpath("//li[@class='header-topline__language-item']/a")).click();
        }

        ActivatedLanguage = driver.findElement(By.xpath(element)).getText();
        System.out.println("Язык совпал" +
                "\nАктивный язык: " +  ActivatedLanguage +
                "\nЯзык из базы: " + Domen);
        String btnText = driver.findElement(By.xpath("//button[@class=\"button button_color_green button_size_medium search-form__submit\"]"))
                .getText();

        if (btnText.equals(Text))
        {
            System.out.println("Текст кнопки совпал");
            System.out.println("Текст из базы: "+ Text);
            System.out.println("Текст на кнопке: " + btnText);
        }
        else
        {
            System.out.println("Еррор!");
        }
        driver.quit();
    }
}
