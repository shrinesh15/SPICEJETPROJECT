package spicejetpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingPage {
    public static void main(String[] args) {
       
    	WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://corporate.spicejet.com/Default.aspx");

        WebElement selectFlightButton = driver.findElement(By.xpath("(//button[@class='select-flight-button'])[1]")); // Replace with the actual XPath

        selectFlightButton.click();

        
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

      
        WebElement proceedToBookingButton = driver.findElement(By.xpath("//button[@id='proceed-to-booking']")); // Replace with the actual XPath

        proceedToBookingButton.click();

        
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
