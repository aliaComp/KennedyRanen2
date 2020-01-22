package DeletingUser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DelUserTest {
    private WebDriver driver;
    private String url;


    @BeforeClass
    public void beforeMethod() {
        url = "http://37.59.228.229:3000/";
        driver = new ChromeDriver();
    }

    @Test
    public void testMethod() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.cssSelector("i.mdi-content-add")).click();
        driver.findElement(By.cssSelector("div.main-content input#icon_prefix")).clear();
        driver.findElement(By.cssSelector("div.main-content input#icon_prefix")).sendKeys("John Kennedy");
        driver.findElement(By.cssSelector("div.main-content input#icon_telephone")).clear();
        driver.findElement(By.cssSelector("div.main-content input#icon_telephone")).sendKeys("9379992");
        driver.findElement(By.cssSelector("div.main-content a.save-btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='user-list']/li[6]/a")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);

    }
    @AfterTest
    public void afterMethod(){
        driver.quit();
    }


}

