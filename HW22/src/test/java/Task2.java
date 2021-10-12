import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class Task2 {
    WebDriver driver;
    String Google = "https://www.google.com/";
    int pages;

    @BeforeSuite
    public void DriverSetUp() {
        driver = new ChromeDriver();
        System.setProperty("webriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
        pages = 5;
    }
    @AfterSuite
    public void DriverClose() {
        driver.quit();
    }


    @Test
    public void SearchIphone() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(Google);
        driver.findElement(By.name("q")).sendKeys("iPhone odessa buy");
        driver.findElement(By.name("btnK")).click();
        boolean isFound = false;
        for (int i = 1; i <= pages; i++) {
            List<WebElement> elements = driver.findElements(By.partialLinkText("citrus.ua"));

            if (elements.size() != 0) {
                System.out.println("citrus.ua was found on page " + i);
                isFound = true;
            }

            if (i < 5)
                driver.findElement(By.id("pnnext")).click();
        }

        if(!isFound) {

            System.out.println("citrus.ua not found");
        }
    }
}







