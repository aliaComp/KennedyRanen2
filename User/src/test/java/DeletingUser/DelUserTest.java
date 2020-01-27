package DeletingUser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

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
        driver.findElement(By.xpath("//*[@id='user-list']/li[4]/a")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        List<WebElement> users = driver.findElements(By.cssSelector("ul#user-list li"));
        boolean switcher = false;
        for (WebElement user: users){
            if (user.findElement(By.cssSelector("h4")).getText().equals("John Kennedy")) {
                user.findElement(By.cssSelector("p")).getText().equals("9379992");
            }
            switcher = false;
            Assert.assertFalse(switcher);
        }
    }

    @AfterTest
    public void afterMethod(){
        driver.quit();
    }


}

