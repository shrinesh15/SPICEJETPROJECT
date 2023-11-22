package spicejetpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signup {
    public static void main(String[] args) {
        
    	WebDriverManager.chromedriver().setup();


        
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://spiceclub.spicejet.com/signup");

        
        WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstname']"));
        WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastname']"));
        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement dobField = driver.findElement(By.xpath("//input[@name='dateobirth']"));
        WebElement mobilenoField = driver.findElement(By.xpath("//input[@name='mobileno']"));
        WebElement countryterritoryField = driver.findElement(By.xpath("//input[@name='country/territory']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement confirmpasswordField = driver.findElement(By.xpath("//input[@name='confirmpassword']"));

        firstNameField.sendKeys("John");
        lastNameField.sendKeys("Paul");
        emailField.sendKeys("john@gmail.com");
        dobField.sendKeys("01/01/2002");
        passwordField.sendKeys("abcd");
        confirmpasswordField.sendKeys("abcd");
        mobilenoField.sendKeys("1234567890");
        countryterritoryField.sendKeys("India");

        
        WebElement signUpButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signUpButton.click();

     
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        driver.quit();
    }
}

