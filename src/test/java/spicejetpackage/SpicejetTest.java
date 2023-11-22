package spicejetpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetTest {

    private WebDriver driver;
    private String baseUrl = "https://www.spicejet.com/";

    @BeforeClass
    public void setUp() {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
       
    }

    @Test(priority = 1)
    public void testPositiveFlightSearch() {
      
        WebElement origin = driver.findElement(By.id("origin"));
        
        origin.sendKeys("SourceCity");
        
        WebElement destination = driver.findElement(By.id("destination"));
        
        destination.sendKeys("DestinationCity");
        
        Assert.assertTrue(driver.getCurrentUrl().contains("expectedSearchResult"));
    }

    @Test(priority = 2)
    public void testNegativeFlightSearch() {
        
         WebElement origin = driver.findElement(By.id("origin"));
         
         origin.sendKeys("InvalidSourceCity");
         
         WebElement destination = driver.findElement(By.id("destination"));
         
         destination.sendKeys("InvalidDestinationCity");
         
         Assert.assertTrue(driver.findElement(By.id("error")).isDisplayed());
    }

    @AfterClass
    public void tearDown() {
        
        if (driver != null) {
            driver.quit();
        }
    }
}

