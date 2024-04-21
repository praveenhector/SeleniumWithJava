import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestClassOne
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
        EdgeDriver driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.name("search")).sendKeys("hp");
        driver.findElement(By.className("input-group-btn")).click();
    }
}
