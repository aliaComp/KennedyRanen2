import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Task1 {
    WebDriver driver;
    String loginUrl = "http://demo.guru99.com/Agile_Project/Agi_V1/index.php";
    String Error = "User or Password is not valid";
    String UserID = "1303";
    String Pass = "Guru99";
    String RandomID = UUID.randomUUID().toString();
    String RandomPass = UUID.randomUUID().toString();




    @BeforeSuite
    public void DriverSetUp() {
        driver = new ChromeDriver();
        System.setProperty("webriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
    }

    @AfterSuite
    public void DriverClose() {
        driver.quit();
    }

    @Test
    public void PositiveLogin() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(loginUrl);
        driver.findElement(By.name("uid")).sendKeys(UserID);
        driver.findElement(By.name("password")).sendKeys(Pass);
        driver.findElement(By.name("btnLogin")).click();
        WebElement logOutButton = driver.findElement(By.xpath("//*[text()= \"Log out\"]"));
        assertTrue(logOutButton.isDisplayed());
        logOutButton.click();
        assertEquals(driver.switchTo().alert().getText(), "You Have Succesfully Logged Out!!");
        driver.switchTo().alert().accept();
        assertEquals(driver.getCurrentUrl(), loginUrl);

    }

    @Test
    public void NegativeInvalidIdValidPass() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(loginUrl);
        driver.findElement(By.name("uid")).sendKeys(RandomID);
        driver.findElement(By.name("password")).sendKeys(Pass);
        driver.findElement(By.name("btnLogin")).click();
        assertEquals(driver.switchTo().alert().getText(), Error);
        driver.switchTo().alert().accept();
        assertEquals(driver.getCurrentUrl(), loginUrl);
    }

    @Test
    public void NegativeValidIDInvalidPass() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(loginUrl);
        driver.findElement(By.name("uid")).sendKeys(UserID);
        driver.findElement(By.name("password")).sendKeys(RandomPass);
        driver.findElement(By.name("btnLogin")).click();
        assertEquals(driver.switchTo().alert().getText(), Error);
        driver.switchTo().alert().accept();
        assertEquals(driver.getCurrentUrl(), loginUrl);
    }
    @Test
    public void NegativeInvalidBothPassAndId() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(loginUrl);
        driver.findElement(By.name("uid")).sendKeys(RandomID);
        driver.findElement(By.name("password")).sendKeys(RandomPass);
        driver.findElement(By.name("btnLogin")).click();
        assertEquals(driver.switchTo().alert().getText(), Error);
        driver.switchTo().alert().accept();
        assertEquals(driver.getCurrentUrl(), loginUrl);
    }
    @Test
    public void NegativeEmptyIDValidPass() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(loginUrl);
        driver.findElement(By.name("password")).sendKeys(Pass);
        driver.findElement(By.name("btnLogin")).click();
        assertEquals(driver.switchTo().alert().getText(), Error);
        driver.switchTo().alert().accept();
        assertEquals(driver.getCurrentUrl(), loginUrl);
    }
    @Test
    public void NegativeEmptyPassValidId() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(loginUrl);
        driver.findElement(By.name("uid")).sendKeys(UserID);
        driver.findElement(By.name("btnLogin")).click();
        assertEquals(driver.switchTo().alert().getText(), Error);
        driver.switchTo().alert().accept();
        assertEquals(driver.getCurrentUrl(), loginUrl);
    }
    @Test
    public void NegativeEmptyPassAndID() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(loginUrl);
        driver.findElement(By.name("btnLogin")).click();
        assertEquals(driver.switchTo().alert().getText(), Error);
        driver.switchTo().alert().accept();
        assertEquals(driver.getCurrentUrl(), loginUrl);
    }
}


