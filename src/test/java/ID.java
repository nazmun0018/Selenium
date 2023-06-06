import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {
    public void Demo(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

    }
}
