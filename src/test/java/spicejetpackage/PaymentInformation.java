package spicejetpackage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class PaymentInformation {
		
	    public static void main(String[] args) {
	        
	    	WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();

	      
	        driver.get("https://www.spicejet.com/booking");

	    
	        WebElement firstNameField = driver.findElement(By.xpath("//input[@id='first-name']"));
	        WebElement lastNameField = driver.findElement(By.xpath("//input[@id='last-name']")); 
	        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']")); 
	        WebElement phoneField = driver.findElement(By.xpath("//input[@id='phone']")); 

	        firstNameField.sendKeys("John");
	        lastNameField.sendKeys("Paul");
	        emailField.sendKeys("john@gmail.com");
	        phoneField.sendKeys("1234567890");

	        
	        WebElement cardNumberField = driver.findElement(By.xpath("//input[@id='card-number']")); 
	        WebElement expirationField = driver.findElement(By.xpath("//input[@id='expiration']")); 
	        WebElement cvvField = driver.findElement(By.xpath("//input[@id='cvv']"));

	        cardNumberField.sendKeys("1234 5678 9012 3456"); 
	        expirationField.sendKeys("12/25"); 
	        cvvField.sendKeys("123"); 

	        
	        WebElement bookNowButton = driver.findElement(By.xpath("//button[@id='book-now']"));

	        bookNowButton.click();

	        
	        try {
	            Thread.sleep(5000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        

	        
	        driver.quit();
	    }
	}

