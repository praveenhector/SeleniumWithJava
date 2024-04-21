import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import javax.swing.event.ChangeEvent;

public class BrowserClass
{

    public static void main(String[] args)
    {
        String browserName = "firefox";
        WebDriver driver= null;

        if(browserName.equals("edge"))
        {
            System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
             driver= new EdgeDriver();

        }
        else if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "./Drivers/chrome.exe");
             driver= new ChromeDriver();
        }
        else if(browserName.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); // Modify this path according to your Firefox installation

            driver = new FirefoxDriver(options);
        }

        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo/");
        driver.findElement(By.name("search")).sendKeys("hp");
        driver.findElement(By.className("input-group-btn")).click();
    }
}
