package Flipckart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipckartassignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iPad");
		Thread.sleep(2000);
		
		  List<WebElement> list = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		Thread.sleep(2000);
		
		
		
		for(int i=0;i<=list.size()-1;i++)
		{
			if(list.get(i).getText().contains("ipad mini"))
			{
				list.get(i).click();
				break;
		
			}
			
		}
	   Thread.sleep(2000);
		//brand
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='APPLE']")).click();
		Thread.sleep(1000);
		//dislpay size
		driver.findElement(By.xpath("//div[text()='Display Size']")).click();
		driver.findElement(By.xpath("//div[text()='8 - 10 Inch']")).click();
		Thread.sleep(1000);
		//gst invoice bill avilable
		driver.findElement(By.xpath("//div[text()='GST Invoice Available']")).click();
		driver.findElement(By.xpath("(//div[text()='GST Invoice Available'])[2]")).click();
		Thread.sleep(500);
		//conectivity
		driver.findElement(By.xpath("//div[text()='Connectivity']")).click();
		driver.findElement(By.xpath("//div[text()='Wi-Fi Only']")).click();
		
		//rating
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(1000);
		//internal storage
		driver.findElement(By.xpath("//div[text()='Internal Storage']")).click();
		driver.findElement(By.xpath("//div[text()='64 GB']")).click();
	     Thread.sleep(1000);
	     //Operating system
	     driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	     driver.findElement(By.xpath("//div[text()='iOS']")).click();
	     Thread.sleep(1000);
	     //primery camera
	     driver.findElement(By.xpath("//div[text()='Primary Camera']")).click();
	     driver.findElement(By.xpath("//div[text()='8MP  Above']")).click();
	 
	    
	     //voice calling facility
	     Thread.sleep(500);
	     driver.findElement(By.xpath("//div[text()='Voice Calling Facility']")).click();
	     driver.findElement(By.xpath("//div[text()='No']")).click();
	   
	     Thread.sleep(1000);
	     //offers
	    driver.findElement(By.xpath("//div[text()='Offers']")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//div[@class='_24_Dny'])[5]")).click();
	     
	     //processor clock speed
	    
	     driver.findElement(By.xpath("//div[text()='Processor Clock Speed']")).click();
	     driver.findElement(By.xpath("//div[text()='Less than 1 GHz']")).click();
	     //avilability
	     Thread.sleep(500);
	     driver.findElement(By.xpath("//div[text()='Availability']")).click();
	     driver.findElement(By.xpath("//div[text()='Exclude Out of Stock']")).click();
	     //click on select
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//div[text()='APPLE iPad mini (6th Gen) 64 GB ROM 8.3 inch with Wi-Fi Only (Purple)']")).click();
	     Thread.sleep(500);
	    //click on X
	     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	     //click buy now
	     Thread.sleep(1000);
	    //add to cart
	     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	
	  
	  
	     
	     
	     
	     
	     
		
		
		
		
	}

}
