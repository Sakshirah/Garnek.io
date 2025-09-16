package Garnek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
      driver.get("https://www.calculator.net/");
      
      List<WebElement> redioButtonList = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
      System.out.println("Total no. of redio button on web page:" + redioButtonList.size());
      driver.close();
	}

}
