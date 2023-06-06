import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Linktext {

    @Test
    public void Sixth() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        //driver.findElement(By.linkText("Forgot password?")).click();

        WebElement w1=driver.findElement(By.name("email"));
        w1.click();
        w1.sendKeys("whitebox");
        driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]"))
                .sendKeys("123456");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//button[@data-testid=\"royal_login_button\"]")).click();
driver.close();

    }
}
