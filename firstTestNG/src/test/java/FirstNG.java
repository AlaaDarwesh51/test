import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstNG {
   WebDriver driver;
    @BeforeTest
    public void openchrome()
   {
       System.out.println("openchrome");
       ChromeOptions co = new ChromeOptions();
       co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);

       WebDriverManager.chromedriver().setup();
       //  WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
   }
   @AfterTest
   public void close() throws InterruptedException {
       System.out.println("closechrome");
       Thread.sleep(3000);
       driver.close();
   }
    @Test
    public void maxchrome()
    {
        System.out.println("maxchrome");
    }
    @Test
    public void username()
    {
        System.out.println("username");
    }
    @Test
    public void password()
    {
        System.out.println("password");
    }
    @Test
    public void login()
    {
        System.out.println("login");
    }
    }

