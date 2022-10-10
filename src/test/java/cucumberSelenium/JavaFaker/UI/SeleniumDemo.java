package cucumberSelenium.JavaFaker.UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class SeleniumDemo {

    String name = "Azamat";
    String email = "Azamat@gmail.com";
    String address = "prospect Mira 56";
    String permanent = "prospect Chui 67";


    @Test
    public void test1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();  // otkroet stranicu na celoe okno
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 10 sekund podojdet
        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys(name);

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys(email);

        WebElement addressInput = driver.findElement(By.id("currentAddress"));
        addressInput.sendKeys(address);

        WebElement permanentInput = driver.findElement(By.id("permanentAddress"));
        permanentInput.sendKeys(permanent);

        WebElement button = driver.findElement(By.id("submit"));
//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.PAGE_DOWN).build().perform(); // prokrutit' vniz
        button.click();


        WebElement idName = driver.findElement(By.id("name"));
        Assert.assertTrue(idName.getText().contains("Azamat"));
//        Assertions.assertEquals(name, idName.getText().substring(5));

        WebElement emailId = driver.findElement(By.id("email"));
        Assert.assertTrue(emailId.getText().contains("Azamat@gmail.com"));
//        Assertions.assertEquals(email, emailId.getText().substring(6));

        WebElement addressId = driver.findElement(By.xpath("//*[@id='output']//*[@id='currentAddress']"));
        Assert.assertTrue(addressId.getText().contains("prospect Mira 56"));
        //Assertions.assertEquals(address, addressId.getText().substring(17));

        WebElement permanentId = driver.findElement(By.xpath("//*[@id='output']//*[@id='permanentAddress']"));
        Assert.assertTrue(permanentId.getText().contains("prospect Chui 67"));
//         Assertions.assertEquals(permanent, permanentId.getText().substring(20));


//        driver.get("https://www.google.com/");
//
//        driver.findElement(By.name("q")).sendKeys("Apple");  // napisali slovo Apple
//        driver.findElement(By.name("btnK")).click();


    }

    @Test

    public void xpathTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullNameInputField.sendKeys("John");

        WebElement emailInputField = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailInputField.sendKeys("john@gmail.com");

        WebElement currentAddressInputField = driver.findElement(By.xpath("(//textarea[@class='form-control'])[1]"));
        currentAddressInputField.sendKeys("Wall Street 123");

        WebElement permanentAddressInputField = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddressInputField.sendKeys("Boston 123");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
    }

    @Test

    public void studentRegistration() throws AWTException {
        WebDriverManager.chromedriver().setup(); // какой драйвер мы хотим использовать
        WebDriver driver = new ChromeDriver();  // вызываем интерфейс Вебдрайвер

        driver.manage().window().maximize(); // сделать на полное окно сделать
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // подожди 10 секунд
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("Pirzhan");

        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Abdirasilov");

        WebElement emailInput = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        emailInput.sendKeys("abdirasilov@gmail.com");

        WebElement femaleInput= driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
        femaleInput.click();

        WebElement numberInput =  driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
        numberInput.sendKeys("6667771119");

        WebElement dateInput = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        dateInput.sendKeys(Keys.BACK_SPACE);
        dateInput.sendKeys(Keys.BACK_SPACE);
        dateInput.sendKeys("00");
        femaleInput.click();

        WebElement subjectsInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        subjectsInput.sendKeys("Ma");
        subjectsInput.sendKeys(Keys.ENTER);
        subjectsInput.sendKeys("Ph");
        subjectsInput.sendKeys(Keys.ENTER);

        WebElement sportsButton = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
        sportsButton.click();
        WebElement readingButton = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]"));
        readingButton.click();
        WebElement musicButton = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
        musicButton.click();

        WebElement picturesInput = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
        picturesInput.sendKeys("//Users//aiperibozoeva//Downloads//ballons.jpeg");

//        Robot robot = new Robot();
//
//        for (int i = 0; i < 4; i++) {
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//        }


        WebElement addressInput = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        addressInput.sendKeys("Boston");

        WebElement cityInput = driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
        cityInput.sendKeys("Haryana");
        cityInput.sendKeys(Keys.ENTER);

        WebElement cityButton = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
        cityButton.sendKeys("Karnal");
        cityButton.sendKeys(Keys.ENTER);

        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
//        submitButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",submitButton );





    }
}
