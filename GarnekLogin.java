package Garnek;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;


//import junit.framework.Assert;


public class GarnekLogin {
	 public String basUrl = "https://garnek.io/login";
	 public WebDriver driver;
	 
	 @BeforeTest
	 public void setup()
	 {
		 System.out.println("Before Test Executed");
		 driver=new ChromeDriver();
		 //Maximize windows
		 driver.manage().window().maximize();
		 //open Url
		 driver.get(basUrl);
		 // timer
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	 }
	 
	 /*@Test(priority = 1)
	  public void loginTest() throws InterruptedException
	  { 
		  driver.findElement(By.xpath("//input[@placeholder=\"Username or Email\"]")).sendKeys("abhay@garnek.io");
		  driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("A@B@C@D1234");
		  driver.findElement(By.xpath("//span[text()='Login']")).click();
		   Thread.sleep(5000);
		  // verify page title
		  String pageTitle  = driver.getTitle();
		  
		   /* if(pageTitle.equals("Garnek.io")){
			  System.out.println("Login succesful1");
		    } else { 
			  System.out.println("login failed");
	        }
		  logout();
		    Assert.assertEquals("Garnek.io", pageTitle);//2nd method
		    Thread.sleep(500); 
	 }*/
	
	 /*@Test(priority = 2)
	  public void AddHSN() throws InterruptedException, IOException
	  {  
		login();
		   driver.findElement(By.xpath("//span[text()=\"Product\"]")).click();
		   Thread.sleep(1000);
		   /*driver.findElement(By.xpath("//a[text()=\"Brands\"]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//span[text()=\"Create Brand\"]")).click();
		   driver.findElement(By.xpath("//input[@placeholder='Type Brand Name']")).sendKeys("ABCS");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//span[normalize-space()='Upload: File Should be less than 1MB']")).click();
		   Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Select File']")).click();
			Thread.sleep(5000);
			Desktop.getDesktop().open(new File("C:\\Users\\Admin\\Desktop\\new File\\logo (1).png"));
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()=\"Upload\"]")).click();
			Thread.sleep(1000);
		   driver.findElement(By.xpath("//a[text()='HSN Setup']")).click();
		   driver.findElement(By.xpath("//span[text()='Create Hsn']")).click();
		   driver.findElement(By.xpath("//input[@placeholder=\"HSN Setup\"]")).sendKeys("41098");
		   driver.findElement(By.xpath("//span[text()='Add HSN']")).click();
		   driver.findElement(By.xpath("//a[text()='HSN Setup']")).click();
		    // find total link
		    List<WebElement> totalLinksElements = driver.findElements(By.xpath("//ul[@class='ant-pagination ant-table-pagination ant-table-pagination-right css-7ny38l']/li"));
		   int totalLinks =totalLinksElements.size();
		    for (int i=0; i<totalLinks;i++)//0,1,2,3
		    {
		    	String currentlinkText = totalLinksElements.get(i).getText();
		    	 try 
		    	 {
		    		int page =Integer.parseInt(currentlinkText); 
		    	    totalLinksElements.get(i).click(); 
		    	 }
		    	 
		    	 catch(Exception e)
		    	 {
		    		 System.out.println("Not a number");
		    	 }
		    }
		    logout();
	   }*/
	  /* @Test(priority = 3)
		public void Attributes() throws InterruptedException
		{
		  login(); 
		  driver.findElement(By.xpath("//span[text()=\"Product\"]")).click();
		  Thread.sleep(1000); 
		  driver.findElement(By.xpath("//a[text()='Attributes']")).click();
		  Thread.sleep(1000); 
		  driver.findElement(By.xpath("//span[text()='Create Attribute']")).click();
		  Thread.sleep(1000); 
		  driver.findElement(By.xpath("//input[@id=\"attributeCode\"]")).sendKeys("5678");
		  Thread.sleep(1000); 
		  driver.findElement(By.xpath("//input[@id=\"attributeName\"]")).sendKeys("Color");
		  Thread.sleep(1000); 
		  driver.findElement(By.xpath("//input[@id=\"attributeType\"]")).sendKeys("Text");
		  Thread.sleep(1000); 
		  driver.findElement(By.xpath("//div[text()='Text']")).click();
		  Thread.sleep(1000); 
		  //driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("//span[text()='Add Attribute']")).click();
		  Thread.sleep(1000); 
		logout();
	  }*/
	   @Test(priority = 2)
	   public void Category() throws InterruptedException
	  
	   {
		   login();
		   
		   driver.findElement(By.xpath("//span[text()='Product']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//a[text()='Item Category']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//span[text()=\"Create Category\"]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@placeholder=\"Type Category Name\"]")).sendKeys("AAAa"); 
		   Thread.sleep(1000);
		  driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/main/div[3]/div/form/div[1]/div[2]/div/div/div[2]/div/div/div/div/span/span[1]/input")).sendKeys("TAWA");	
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[text()='TAWA']")).click();
		  Thread.sleep(1000);
		   driver.findElement(By.xpath("/html/body/div/div[3]/div/main/div[3]/div/form/div[2]/div[2]/div/div/div[2]/div/div/span/div[1]/span/button/span[2]")).sendKeys("");
		   Thread.sleep(1000);
		  
		logout();   
	   }
	 
	  /* @Test(priority = 4)
	   public void Group() throws InterruptedException
	   {
		login();
		driver.findElement(By.xpath("//span[text()=\"Product\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Groups']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add Main Group']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Group Name\"]")).sendKeys("Groupppp");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='OK']")).click();
		Thread.sleep(1000);
		logout();
		}*/
	  public void login()
	     {
		  driver.findElement(By.xpath("//input[@placeholder=\"Username or Email\"]")).sendKeys("abhay@garnek.io");
		  driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("A@B@C@D1234");
		  driver.findElement(By.xpath("//span[text()='Login']")).click();
	     }
	 public void logout() 
	    {  
		  driver.findElement(By.xpath("//span[text()='Logout']")).click();
		  // Thread.sleep(5000);
		  driver.findElement(By.xpath(" (//span[contains(text(),'Logout')])[2]")).click();
		  //Thread.sleep(5000);
		}
	  
	 
	 
	 @AfterTest
	 public void tearDown() throws InterruptedException
	 {  
		 	Thread.sleep(2000);
		 driver.close();
		 driver.quit();
     }
}
