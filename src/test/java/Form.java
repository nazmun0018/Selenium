import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Form {
    @Test
    public void Seventh() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

      driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"]")).click();

      Thread.sleep(4000);


        driver.findElement(By.xpath("//label[@for=\"gender-radio-2\"]")).click();

    }
}