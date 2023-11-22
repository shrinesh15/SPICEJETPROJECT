package spicejetpackage;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class FieldsOnBookingPage {
		
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable (you may need to change this path)
	    	WebDriverManager.chromedriver().setup();


	        // Initialize the WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the booking page (replace with your target website)
	        driver.get("https://www.spicejet.com/booking");

	        // Find the "Check-in" link using XPath
	        WebElement checkInLink = driver.findElement(By.xpath("//a[text()='Check-in']")); // Replace with the actual XPath

	        // Find the "Flight status" link using XPath
	        WebElement flightStatusLink = driver.findElement(By.xpath("//a[text()='Flight status']")); // Replace with the actual XPath

	        // Find the "Manage Booking" link using XPath
	        WebElement manageBookingLink = driver.findElement(By.xpath("//a[text()='Manage Booking']")); // Replace with the actual XPath

	        if (checkInLink.isDisplayed() && flightStatusLink.isDisplayed() && manageBookingLink.isDisplayed()) {
	            System.out.println("All required fields are available on the booking page.");
	        } else {
	            System.out.println("One or more required fields are not available on the booking page.");
	        }

	        driver.quit();
	    }
	}

