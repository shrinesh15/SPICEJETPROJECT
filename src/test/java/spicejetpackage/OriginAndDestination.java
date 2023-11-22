package spicejetpackage;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class OriginAndDestination {
	    public static void main(String[] args) {
	      
	    	WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();
    
	        driver.get("https://www.spicejet.com/");
      
	        WebElement oneWayOriginField = driver.findElement(By.xpath("//input[@id='one-way-origin']")); // Replace with the actual XPath
	        WebElement oneWayDestinationField = driver.findElement(By.xpath("//input[@id='one-way-destination']")); // Replace with the actual XPath

	        oneWayOriginField.sendKeys("New York");
	        oneWayDestinationField.sendKeys("Los Angeles");
       
	        WebElement oneWaySearchButton = driver.findElement(By.xpath("//button[@id='one-way-search-button']")); // Replace with the actual XPath
	        oneWaySearchButton.click();

	        
	        try {
	            Thread.sleep(5000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        
	        WebElement roundTripOriginField = driver.findElement(By.xpath("//input[@id='round-trip-origin']")); // Replace with the actual XPath
	        WebElement roundTripDestinationField = driver.findElement(By.xpath("//input[@id='round-trip-destination']")); // Replace with the actual XPath

	        roundTripOriginField.sendKeys("New York");
	        roundTripDestinationField.sendKeys("Los Angeles");

	        
	        WebElement roundTripSearchButton = driver.findElement(By.xpath("//button[@id='round-trip-search-button']")); // Replace with the actual XPath
	        roundTripSearchButton.click();

	        
	        try {
	            Thread.sleep(5000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	      
	        driver.quit();
	    }
	}

