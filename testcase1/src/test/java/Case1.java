import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Case1 {
    public static void main(String[] args) throws InterruptedException {

            ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver(co);

        WebDriverManager.chromedriver().setup();
            //  WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
            String tit = driver.getTitle();
        System.out.println("the title is :"+tit);
        driver.navigate().to("https://www.udemy.com");
        driver.navigate().back();

            String google = driver.getCurrentUrl();
        System.out.println("google url is:"+google);
        driver.manage().window().fullscreen();
        driver.navigate().refresh();
        driver.navigate().forward();
        ////NEW
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
       // driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        Thread.sleep(3000);
        driver.close();

        }
    }