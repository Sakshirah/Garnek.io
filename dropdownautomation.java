package Garnek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		        // Set path to your chromedriver
		        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        // Launch browser
		        WebDriver driver = new ChromeDriver();

		        // Open website
		        driver.get("https://www.opencart.com/index.php?route=account/register");

		        // Find the dropdown element
		        WebElement dropdown = driver.findElement(By.id("input-country"));  // replace with actual ID

		        // Create Select object
		        Select select = new Select(dropdown);

		        // Get total number of options
		        int totalOptions = select.getOptions().size();

		        // Loop through all options one by one
		        for (int i = 0; i < totalOptions; i++) {
		            select.selectByIndex(i);
		            System.out.println("Selected: " + select.getOptions().get(i).getText());
		            Thread.sleep(1000); // wait for 1 second
		        }

		        // Close browser
		        driver.quit();
		    }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
