
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;


public class Demo {

    @Test
    public void first() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
WebElement w1=driver.findElement(By.id("firstName"));
w1.click();
w1.sendKeys("WhiteBoxQA");

WebElement w2=driver.findElement(By.id("userEmail"));
w2.click();
w2.sendKeys("fdjhfjdhjs@gmail.com");

driver.findElement(By.xpath("//label[@for=\"gender-radio-2\"]")).click();

    }

    @Test
    public void second(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://whiteboxqa.com/schedule.php#");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());

        driver.close();

    }
}
