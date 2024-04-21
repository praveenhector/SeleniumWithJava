import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DemoFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");

        // Specify the path to the Firefox binary
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); // Modify this path according to your Firefox installation

        FirefoxDriver driver = new FirefoxDriver(options); // Pass options to the FirefoxDriver constructor
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.name("search")).sendKeys("hp");
        driver.findElement(By.className("input-group-btn")).click();
        //driver.quit();
    }

}
