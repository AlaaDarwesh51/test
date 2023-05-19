import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindLinkText {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);

        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
       // driver.findElement(By.partialLinkText("onload")).click();
       // driver.findElement(By.partialLinkText("Auth")).click();
       // Thread.sleep(2000);
       // driver.navigate().back();
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        // driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        //driver.findElement(By.className("radius")).click();
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(3000);
        driver.close();



    }

}
