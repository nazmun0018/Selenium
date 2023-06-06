import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jshell.Snippet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locator {

    @Test
    public void Fifth() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        WebElement w1= driver.findElement(By.id("lastName"));
        w1.click();
        w1.sendKeys("Whitebox");
        WebElement w2= driver.findElement(By.id("firstName"));
        w2.click();
        w2.sendKeys("Learning");
        WebElement w3= driver.findElement(By.id("userEmail"));
        w3.click();
        w3.sendKeys("white@gmail.com");

        Thread.sleep(4000);
        driver.close();


    }
}
