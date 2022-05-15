import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    static final String DRIVER_TYPE = "webdriver.chrome.driver";
    static final String DRIVER_FILE = "./driver/chromedriver.exe";
    // static final String DRIVER_FILE = "/Users/axelhendler/Desktop/chromedriver 3";

    public static void main(String[] args) {
        System.setProperty(DRIVER_TYPE, DRIVER_FILE);
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.google.com/";
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com/");

        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
