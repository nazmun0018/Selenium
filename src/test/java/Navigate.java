import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Navigate {
@Test
    public void Forth() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://whiteboxqa.com/schedule.php#");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.close();

    }
}
