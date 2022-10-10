package cucumberSelenium.JavaFaker.alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestAlert {
    WebDriver driver;


    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/alerts");

    }

    @AfterEach
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void testAlert() {
        WebElement clickMeInput = driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickMeInput.click();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Alert alert = driver.switchTo().alert();
        alert.accept();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        @Test
        public void testAlert2() {

        WebElement writeClick = driver.findElement(By.xpath("//button[@id='promtButton']"));
        writeClick.click();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
        Alert alert1 = driver.switchTo().alert();
        alert1.sendKeys("Hello World");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            alert1.accept();


        }
    }
}
