import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chrome.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://tutorialsninja.com/demo/");
      driver.findElement(By.name("search")).sendKeys("hp");
      driver.findElement(By.className("input-group-btn")).click();

    }
}
