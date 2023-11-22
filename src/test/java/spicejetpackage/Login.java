package spicejetpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
    public static void main(String[] args) {
        
    	WebDriverManager.chromedriver().setup();

        
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.spicejet.com/"); 

        
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='login-button']")); // Replace with the actual XPath
        loginButton.click();

        
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']")); // Replace with the actual XPath
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']")); // Replace with the actual XPath

        emailField.sendKeys("abcd@example.com");
        passwordField.sendKeys("password123"); 

        
        WebElement loginSubmitButton = driver.findElement(By.xpath("//button[@id='login-submit']")); // Replace with the actual XPath
        loginSubmitButton.click();

        
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        driver.quit();
    }
}

