package spicejetpackage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BookingConfirmationMessage {
	    public static void main(String[] args) {
	        
	    	WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.spicejet.com/booking");
	        
	        WebElement confirmationMessage = driver.findElement(By.xpath("//div[@id='confirmation-message']")); // Replace with the actual XPath
	        
	        if (confirmationMessage.isDisplayed() && confirmationMessage.getText().contains("Booking Successful")) {
	            System.out.println("Booking was successful. Confirmation message found.");
	        } else {
	            System.out.println("Booking was not successful. Confirmation message not found or does not match expected text.");
	        }

	     
	        driver.quit();
	    }
	}

