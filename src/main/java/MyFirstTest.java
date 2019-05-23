//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class MyFirstTest {
    //  private WebDriver driver;
    //  private WebDriverWait wait;

    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\абвг\\IdeaProjects\\YandexTest1\\drivers\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.tinkoff.ru/");
       driver.findElement(By.linkText("Платежи")).click();
        driver.findElement(By.linkText("ЖКХ")).click();
        driver.navigate().back();
        driver.findElement (By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/span/span/span")).click();
        driver.findElement(By.linkText("Москва")).click();
              driver.findElement(By.linkText("ЖКУ-Москва")).click();
        driver.findElement(By.linkText("ОПЛАТИТЬ ЖКУ В МОСКВЕ")).click();

        String bodyText = driver.findElement(By.linkText("Поле заполнено некорректно")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(text));
        
        driver.navigate().back();
        driver.findElement(By.linkText("Платежи")).click();
        driver.findElement(By.linkText("ЖКХ")).click();
        driver.navigate().back();
        driver.findElement (By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/span/span/span")).click();
        driver.findElement(By.linkText("г. Санкт-Петербург")).click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        try {

            WebElement element = driver.findElement(By.linkText("ЖКУ-Москва"));

        } catch (NoSuchElementException e) {

        // Element wasn't found.
        }


        driver.quit();
    }
}