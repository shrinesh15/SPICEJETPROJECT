package spicejetpackage;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class ClosingTheWebBrowser {
		
	    public static void main(String[] args) {
	        
	    	WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();

	    
	        driver.quit();
	    }
	}

