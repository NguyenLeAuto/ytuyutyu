package demojava.pack;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{ 
    public WebDriver driver;
    public WebDriverWait wait;


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws IOException
    {     System.out.println("code selenium testing");
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
   // options.addArguments("--no-sandbox");
   // options.addArguments("--disable-dev-shm-usage");
   // options.addArguments("--headless");
    driver = new ChromeDriver(options);
    driver.navigate().to("https://testdev.vetspire.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
    

    

        
    }
}
