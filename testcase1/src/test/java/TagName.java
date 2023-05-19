import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;
import java.util.List;

public class TagName {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);

        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        WebElement table= driver.findElement(By.id("table1"));
       List <WebElement> tablerow;
        tablerow = (List<WebElement>) Collections.singletonList(table.findElement(By.tagName("tr")));
        System.out.println(tablerow.size());
        for (int i =0;i<4;i++)
        { System.out.println(tablerow.get(i).getText());}
        Thread.sleep(3000);
        driver.close();

}}
